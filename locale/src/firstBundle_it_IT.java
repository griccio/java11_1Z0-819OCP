import java.util.ListResourceBundle;

public class firstBundle_it_IT extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
            {"yes","SI"},
                {"no", "NO"},
                {"unsure", "NON SO"}
        };
    }
}
