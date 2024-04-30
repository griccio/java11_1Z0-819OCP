/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 16:  Localization
Topic:  Use Locale class
*/

import java.util.Arrays;
import java.util.Locale;

public class LocaleReview {
    public static void main(String[] args) {

        // List of Available Locales
        System.out.println("Number of Locales: " +
                Locale.getAvailableLocales().length);

        System.out.println("------Hong Kong Locales--");
        // List only Locales with country code of "HK"
        Arrays.stream(Locale.getAvailableLocales())
                .filter((s) -> s.getCountry().equals("HK"))
                .forEach((s) -> System.out.println(s + " : " +
                        s.getDisplayName()));

        System.out.println("------ Language only -");
        // List only Locales with country code of "US"
        Arrays.stream(Locale.getAvailableLocales())
                //.filter((s) -> s.getCountry().equals("US"))
                .filter((s) -> s.getCountry().length() == 0 && s.getLanguage().length() > 0)
                .limit(7)
                .forEach((s) -> System.out.println(s + " : " +
                        s.getDisplayName()));

        System.out.println("------ Locales with variants ");
        // List only Locales with country code of "US"
        Arrays.stream(Locale.getAvailableLocales())
                //.filter((s) -> s.getCountry().equals("US"))
                .filter((s) -> s.getVariant().length() > 0)
                .forEach((s) -> System.out.println(s + " : " +
                        s.getDisplayName() + " : " + s.getVariant()));
        System.out.println("------ Locales with extensions ");
        // List only Locales with country code of "US"
        Arrays.stream(Locale.getAvailableLocales())
                //.filter((s) -> s.getCountry().equals("US"))
                .filter((s) -> s.getExtensionKeys().size() > 0)
                .forEach((s) -> System.out.println(s + " : " +
                        s.getDisplayName() + " : " + s.getExtensionKeys()));

        System.out.println("---- Static fields for common Locales ");
        // Locale static variables for some specific Locales.
        System.out.println("Locale.ENGLISH = " + Locale.ENGLISH);
        System.out.println("Locale.FRENCH = " + Locale.FRENCH);
        System.out.println("Locale.FRANCE = " + Locale.FRANCE);
        System.out.println("Locale.CANADA = " + Locale.CANADA);
        System.out.println("Locale.CANADA_FRENCH = " + Locale.CANADA_FRENCH);
        System.out.println("--------------------------");

        // Default Locale can be retrieved
        System.out.println("Default Locale: " + Locale.getDefault());

        // User friendly Display Name can be used.
        System.out.println("DisplayName of default locale = " +
                Locale.getDefault().getDisplayName());

        // User friendly Display Name can be displayed using a different locale
        System.out.println("DisplayName of default locale for locale.FRENCH = " +
                Locale.getDefault().getDisplayName(Locale.FRENCH));
    }
}
/**
 Number of Locales: 748
 ------Hong Kong Locales ------
 zh_HK_#Hant : cinese (tradizionale, RAS di Hong Kong)
 zh_HK_#Hans : cinese (semplificato, RAS di Hong Kong)
 yue_HK_#Hant : cantonese (tradizionale, RAS di Hong Kong)
 zh_HK : cinese (RAS di Hong Kong)
 en_HK : inglese (RAS di Hong Kong)
 ------ Language only ------
 nn : norvegese nynorsk
 bg : bulgaro
 kea : capoverdiano
 nds : basso tedesco
 zu : zulu
 hsb : alto sorabo
 lv : lettone
 ------ Locales with variants ------
 en_US_POSIX : inglese (Stati Uniti, computer) : POSIX
 no_NO_NY : norvegese (Norvegia, Nynorsk) : NY
 th_TH_TH_#u-nu-thai : thai (Thailandia, TH, Cifre thailandesi) : TH
 ja_JP_JP_#u-ca-japanese : giapponese (Giappone, JP, Calendario giapponese) : JP
 ca_ES_VALENCIA : catalano (Spagna, valenziano) : VALENCIA
 ------ Locales with extensions ------
 th_TH_TH_#u-nu-thai : thai (Thailandia, TH, Cifre thailandesi) : [u]
 ja_JP_JP_#u-ca-japanese : giapponese (Giappone, JP, Calendario giapponese) : [u]
 --------- Static fields for common Locales --------
 Locale.ENGLISH = en
 Locale.FRENCH = fr
 Locale.FRANCE = fr_FR
 Locale.CANADA = en_CA
 Locale.CANADA_FRENCH = fr_CA
 --------------------------
 Default Locale: it_IT
 DisplayName of default locale = italiano (Italia)
 DisplayName of default locale for locale.FRENCH = italien (Italie)

 Process finished with exit code 0
 */
