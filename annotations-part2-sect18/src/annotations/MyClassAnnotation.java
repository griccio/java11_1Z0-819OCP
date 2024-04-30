package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.CLASS )
public @interface MyClassAnnotation {
    int val() default 10;
    int rel() default 100;
}
