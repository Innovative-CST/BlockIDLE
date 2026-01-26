package java.lang;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD,
		ElementType.PACKAGE, ElementType.MODULE, ElementType.PARAMETER, ElementType.TYPE })
public @interface Deprecated {
	String since() default "";

	boolean forRemoval() default false;
}
