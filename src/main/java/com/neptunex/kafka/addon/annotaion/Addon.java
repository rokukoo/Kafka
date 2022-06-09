package com.neptunex.kafka.addon.annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Addon {

    String name();

    String version() default "1.0.0";

    String description() default "";

    String author() default "Unknown";

    String website() default "Unknown";

}
