import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleFormattingDateTime {
    public static void main(String[] args) {
        Locale lFR = new Locale("fr","FR");
        Date date = new Date();
        System.out.println("Date.toString " + date);
        //date pattern
        System.out.println(MessageFormat.format("MessageFormat date:  {0, date}",date));
        System.out.println(MessageFormat.format("MessageFormat date,short:  {0, date, short}",date));
        System.out.println(MessageFormat.format("MessageFormat date,medium:  {0, date, medium}",date));
        System.out.println(MessageFormat.format("MessageFormat date,long: {0, date, long}",date));
        System.out.println(MessageFormat.format("MessageFormat date,full: {0, date, full}",date));
        System.out.println(MessageFormat.format("MessageFormat date,long: {0, date, yyy-MMM-ddd}",date));
        System.out.println(MessageFormat.format("MessageFormat date,long: {0, date, M d y}",date));
        //time pattern
        System.out.println(MessageFormat.format("MessageFormat time: {0, time}",date));
        System.out.println(MessageFormat.format("MessageFormat time,short: {0, time,short}",date));
        System.out.println(MessageFormat.format("MessageFormat time,medium: {0, time,medium}",date));
        System.out.println(MessageFormat.format("MessageFormat time,long: {0, time,long}",date));
        System.out.println(MessageFormat.format("MessageFormat time,full: {0, time,full}",date));
        System.out.println(MessageFormat.format("MessageFormat time,h:m:s: {0, time, h:m:s}",date));
    }
}
/**
 Date.toString Wed Apr 10 11:41:44 CEST 2024
 MessageFormat date:  10 apr 2024
 MessageFormat date,short:  10/04/24
 MessageFormat date,medium:  10 apr 2024
 MessageFormat date,long: 10 aprile 2024
 MessageFormat date,full: mercoledì 10 aprile 2024
 MessageFormat date,long:  2024-apr-010
 MessageFormat date,long:  4 10 2024
 MessageFormat time: 11:41:44
 MessageFormat time,short: 11:41
 MessageFormat time,medium: 11:41:44
 MessageFormat time,long: 11:41:44 CEST
 MessageFormat time,full: 11:41:44 Ora legale dell’Europa centrale
 MessageFormat time,h:m:s:  11:41:44
 Process finished with exit code 0
 */