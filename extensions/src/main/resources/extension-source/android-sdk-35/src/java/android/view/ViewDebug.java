package android.view;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class ViewDebug
{
    @Deprecated
    public static final boolean TRACE_HIERARCHY = false;
    @Deprecated
    public static final boolean TRACE_RECYCLER = false;
    
    public ViewDebug() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void trace(final View view, final RecyclerTraceType type, final int... parameters) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void startRecyclerTracing(final String prefix, final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void stopRecyclerTracing() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void trace(final View view, final HierarchyTraceType type) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void startHierarchyTracing(final String prefix, final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void stopHierarchyTracing() {
        throw new RuntimeException("Stub!");
    }
    
    public static void dumpCapturedView(final String tag, final Object view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public enum HierarchyTraceType
    {
        @Deprecated
        INVALIDATE, 
        @Deprecated
        INVALIDATE_CHILD, 
        @Deprecated
        INVALIDATE_CHILD_IN_PARENT, 
        @Deprecated
        REQUEST_LAYOUT, 
        @Deprecated
        ON_LAYOUT, 
        @Deprecated
        ON_MEASURE, 
        @Deprecated
        DRAW, 
        @Deprecated
        BUILD_CACHE;
    }
    
    @Deprecated
    public enum RecyclerTraceType
    {
        @Deprecated
        NEW_VIEW, 
        @Deprecated
        BIND_VIEW, 
        @Deprecated
        RECYCLE_FROM_ACTIVE_HEAP, 
        @Deprecated
        RECYCLE_FROM_SCRAP_HEAP, 
        @Deprecated
        MOVE_TO_SCRAP_HEAP, 
        @Deprecated
        MOVE_FROM_ACTIVE_TO_SCRAP_HEAP;
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ ElementType.TYPE })
    public @interface IntToString {
        int from();
        
        String to();
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ ElementType.TYPE })
    public @interface FlagToString {
        int mask();
        
        int equals();
        
        String name();
        
        boolean outputIf() default true;
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ ElementType.FIELD, ElementType.METHOD })
    public @interface ExportedProperty {
        boolean resolveId() default false;
        
        IntToString[] mapping() default {};
        
        IntToString[] indexMapping() default {};
        
        FlagToString[] flagMapping() default {};
        
        boolean deepExport() default false;
        
        String prefix() default "";
        
        String category() default "";
        
        boolean formatToHexString() default false;
        
        boolean hasAdjacentMapping() default false;
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ ElementType.FIELD, ElementType.METHOD })
    public @interface CapturedViewProperty {
        boolean retrieveReturn() default false;
    }
}
