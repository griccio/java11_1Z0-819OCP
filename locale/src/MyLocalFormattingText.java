import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyLocalFormattingText {
    public static void main(String[] args) {
        Date now = new Date();
        float floatValue = 10.233f;
        //Two ways  to define the default Locale
        Locale.setDefault(new Locale("en", "AU"));
        Locale.setDefault(Locale.US);
        //The Locale of JVM i Italian
        Locale l = new Locale("it", "IT");
        Locale l_it = new Locale("IT");


        Locale.setDefault(l);
        String str = ResourceBundle.getBundle("firstBundle")
                                    .getString("unsure") ;
        System.out.println("---- Default locale = " + Locale.getDefault() +"----");
        System.out.println("NOT LOCALIZED " +
                " text :" + str +
                " float: "+ floatValue +
                " date: " + now);
        //Localize each element with the corresponding Number and Date Format
        System.out.println("LOCALIZED 1" +
                " text :" + str +
                " float: "+ DecimalFormat.getInstance().format(floatValue) +
                " date: " + SimpleDateFormat.getDateInstance().format(now));
        // Printing using String.format with format specifiers and args
        System.out.println(
                String.format("LOCALIZED 2 : " +
                        "text: %1$s " +
                        "float: %2$.2f " +
                        "date: %3$tA %3$td %3$tB %3$tY %n",str,floatValue,now));
        // Printing using String returned from MessageFormat.format
        System.out.println(MessageFormat.format(
                "LOCALIZED 3 : text: {0} float: {1} date: {2}",
                str, floatValue, now));
        // Printing using String returned from MessageFormat.format
        // Using more specific format specifiers
        System.out.println(MessageFormat.format(
                "LOCALIZED 4 text: {0} float: {1, number}" +
                        " date: {2, date, long}",
                str, floatValue, now));

    }
}
/**
 ---- Default locale = it_IT----
 NOT LOCALIZED  text :NON SO float: 10.233 date: Tue Apr 09 14:12:16 CEST 2024
 LOCALIZED 1 text :NON SO float: 10,233 date: 9 apr 2024
 LOCALIZED 2 : text: NON SO float: 10,23 date: martedì 09 aprile 2024

 LOCALIZED 3 : text: NON SO float: 10,233 date: 09/04/24, 14:12
 LOCALIZED 4 text: NON SO float: 10,233 date: 9 aprile 2024\
 */
