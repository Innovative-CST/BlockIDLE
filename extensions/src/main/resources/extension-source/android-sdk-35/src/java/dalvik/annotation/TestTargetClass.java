package dalvik.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface TestTargetClass {
    @Deprecated
    Class<?> value();
}
