package com.itrustcambodia.pluggable.validation.type;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Socheat KHAUV
 */
@Target({ ElementType.FIELD })
@Retention(RUNTIME)
@Documented
public @interface Setting {

    String name();

}
