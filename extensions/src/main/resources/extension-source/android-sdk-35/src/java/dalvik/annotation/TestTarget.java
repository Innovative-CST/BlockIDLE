package dalvik.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.ANNOTATION_TYPE })
public @interface TestTarget {
    @Deprecated
    String methodName() default "";
    
    @Deprecated
    String conceptName() default "";
    
    @Deprecated
    Class<?>[] methodArgs() default {};
}
