import java.util.Locale;

public class LocaleObjects {
    public static void main(String[] args) {
        //create Locale
        System.out.println("Locale(fr) = " + new Locale("fr"));
        System.out.println("Locale(fr) = " + new Locale("FR"));
        System.out.println("Locale(fr,FR) = " + new Locale("fr", "FR"));
        System.out.println("Locale(fr,FR) = " + Locale.forLanguageTag("fr-FR"));

        //using constant
        Locale l = Locale.FRANCE;
        System.out.println("Locale(fr,FR) = " + l);
         l = Locale.ITALY;
        System.out.println("Locale(it,IT) = " + l);

        //using Builder
        l = new Locale.Builder().setRegion("IT").setLanguage("it").build();
        System.out.println("Locale.Builder() = " + l);


        //standard IETF BCP 47
        l = Locale.forLanguageTag("it-IT");
        System.out.println("Locale.forLanguageTag(it-IT) = " + l);

        //locale with wrong paramenter
//        System.out.println("Locale(fr) = " + new Locale(null)); //nullPointer Exception
//        System.out.println("Locale(fr) = " + new Locale()); //Error at compile time
        l= new Locale("it_IT");
        System.out.println("new Locale(\"it_IT\") country = " + l.getCountry());
        System.out.println("new Locale(\"it_IT\"); language = " + l.getLanguage());
        l= new Locale("it","I&T");
        System.out.println("Locale.forLanguageTag(it-I&T) = " + l);
        l= new Locale("I&T");
        System.out.println("Locale.forLanguageTag(I&T) = " + l);
//        l = new Locale.Builder().setRegion("I&T").setLanguage("it").build();//throws an exception IllFormedLocalException   \\
//        System.out.println("Locale.forLanguageTag(I&T) = " + l);
    }
}
/**
 Locale(fr) = fr
 Locale(fr) = fr
 Locale(fr,FR) = fr_FR
 Locale(fr,FR) = fr_FR
 Locale(fr,FR) = fr_FR
 Locale(it,IT) = it_IT
 Locale.Builder() = it_IT
 Locale.forLanguageTag(it-IT) = it_IT
 Locale.forLanguageTag(it-I&T) = it_I&T
 Locale.forLanguageTag(I&T) = i&t
 Process finished with exit code 0
 */