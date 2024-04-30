import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocaleFormattingNumber {
    public static void main(String[] args) throws ParseException {
        double d = 10.55;
        Locale lUK = Locale.UK;
        System.out.println("default Locale is  " + Locale.getDefault());
        System.out.println("defaultDecimal = " + NumberFormat.getInstance().format(d));
        System.out.println("localeDecimal = " + NumberFormat.getInstance(lUK).format(d));
        //Let's use MessageFormat
        String message ="NumberFormat.getInstance({0}.parse({1}) : {2}";

        System.out.println(MessageFormat.format(message,Locale.getDefault(),
                "defaultDecimal",
                NumberFormat.getInstance().parse(NumberFormat.getInstance().format(d))));

        //Pay Attention
        //NumberFormat ignore the ',' read 10.55 and return 1055 ->
        // MassegeFormat read 1055 -> and return 1.055 in Italian
        System.out.println(MessageFormat.format(message,Locale.getDefault(),
                "localeDecimal",
                NumberFormat.getInstance().parse(NumberFormat.getInstance(lUK).format(d))));

        //Different format
        //DecimalFormat with a pattern
        DecimalFormat dfUK = (DecimalFormat) NumberFormat.getInstance(lUK);
        dfUK.applyPattern("###.###");
        System.out.println(MessageFormat.format("{0}({1}) : {2}",
                "DecimalFormat(###.###)",
                lUK,
                dfUK.format(d)));

        //Contructor with a pattern
        //messageFormat take the DefaultLocale
        System.out.println(MessageFormat.format("{0}({1}) : {2}",
                "DecimalFormat(###.###)",
                lUK,
                new DecimalFormat("##.00").format(d)));
        System.out.println(MessageFormat.format("{0}({1}) : {2, number}",
                "{2, number}",lUK,d));
        System.out.println(MessageFormat.format("{0}({1}) : {2, number,percent}",
                "{2, number,percent}",lUK,d));
        System.out.println(MessageFormat.format("{0}({1}) : {2, number,currency}",
                "{2, number,currency}",lUK,d));
        System.out.println(MessageFormat.format("{0}({1}) : {2, number,integer}",
                "{2, number,integer}",lUK,d));
        System.out.println(MessageFormat.format("{0}({1}) : {2, number, #.0}",
                "{2, number,#.0}",lUK,d));
        System.out.println(MessageFormat.format("{0}({1}) : {2, number, 0.0}",
                "{2, number, 0.0}",lUK,d));
        System.out.println(MessageFormat.format("{0}({1}) : {2, number, #.#}",
                "{2, number, #.#}",lUK,d));
        System.out.println(MessageFormat.format("{0}({1}) : {2, number, 00.##}",
                "{2, number, 00.##}",lUK,d));

        System.out.println("default Locale is  " + Locale.getDefault());
        System.out.println(DecimalFormat.getInstance(Locale.ITALY).parse("12,88"));
        Double dd = Double.valueOf(NumberFormat.getInstance(Locale.ITALY).parse("12,88").doubleValue()); //12.88
        System.out.println("not formatted double: " + dd); //12.88
        System.out.println(MessageFormat.format("italian formatted double {0,number}",dd)); //12,88
        System.out.println("Decimal Format " + DecimalFormat.getInstance(Locale.ITALY).format(dd)); //12,88
        //ignore the '.'
        System.out.println(DecimalFormat.getInstance(Locale.ITALY).parse("12.88"));//1288
        dd = Double.valueOf(NumberFormat.getInstance(Locale.ITALY).parse("12.88").doubleValue());//1288
        System.out.println("Wrong Locale and number format " + dd);//1288
        //ignore the ','
        System.out.println(DecimalFormat.getInstance(Locale.UK).parse("12,88"));//1288
        dd = Double.valueOf(NumberFormat.getInstance(Locale.UK).parse("12,88").doubleValue());//1288
        System.out.println("Wrong Locale and number format " + dd);//1288.0
    }
}
/**
 default Locale is  it_IT
 defaultDecimal = 10,55
 localeDecimal = 10.55
 NumberFormat.getInstance(it_IT.parse(defaultDecimal) : 10,55
 NumberFormat.getInstance(it_IT.parse(localeDecimal) : 1.055
 DecimalFormat(###.###)(en_GB) : 10.55
 DecimalFormat(###.###)(en_GB) : 10,55
 {2, number}(en_GB) : 10,55
 {2, number,percent}(en_GB) : 1.055%
 {2, number,currency}(en_GB) : 10,55 €
 {2, number,integer}(en_GB) : 11
 {2, number,#.0}(en_GB) :  10,6
 {2, number, 0.0}(en_GB) :  10,6
 {2, number, #.#}(en_GB) :  10,6
 {2, number, 00.##}(en_GB) :  10,55
 default Locale is  it_IT
 12.88
 not formatted double: 12.88
 italian formatted double 12,88
 Decimal Format 12,88
 1288
 Wrong Locale and number format 1288.0
 1288
 Wrong Locale and number format 1288.0
 */