import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MyLocaleFormattingNumbers {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.ITALY;
        Locale.setDefault(defaultLocale);
        Locale britishLocale = Locale.UK;
        System.out.println("default Locale is " + Locale.ITALY);
        double d = 10.55;
        System.out.println(MessageFormat.format("InstanceFormat {0}: {1} - {2}: {3} ",
                Locale.getDefault(),
                NumberFormat.getInstance().format(d),
                britishLocale,
                NumberFormat.getInstance(britishLocale).format(d))
        );
        //NumberInstance
        System.out.println(MessageFormat.format("NumberInstanceFormat {0}: {1} - {2}: {3} ",
                Locale.getDefault(),
                NumberFormat.getNumberInstance().format(d),
                britishLocale,
                NumberFormat.getNumberInstance(britishLocale).format(d))
        );
        //CurrencyInstance
        System.out.println(MessageFormat.format("CurrencyFormat {0}: {1} - {2}: {3} ",
                Locale.getDefault(),
                NumberFormat.getCurrencyInstance().format(d),
                britishLocale,
                NumberFormat.getCurrencyInstance(britishLocale).format(d))
        );
        //IntegerInstance
        System.out.println(MessageFormat.format("CurrencyFormat {0}: {1} - {2}: {3} ",
                Locale.getDefault(),
                NumberFormat.getIntegerInstance().format(d),
                britishLocale,
                NumberFormat.getIntegerInstance(britishLocale).format(d))
        );
        //PercentInstance
        System.out.println(MessageFormat.format("PercentFormat {0}: {1} - {2}: {3} ",
                Locale.getDefault(),
                NumberFormat.getPercentInstance().format(d),
                britishLocale,
                NumberFormat.getPercentInstance(britishLocale).format(d))
        );

    }
}
