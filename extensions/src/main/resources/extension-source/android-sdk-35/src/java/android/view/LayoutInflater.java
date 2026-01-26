package android.view;

import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;

public abstract class LayoutInflater
{
    protected LayoutInflater(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    protected LayoutInflater(final LayoutInflater original, final Context newContext) {
        throw new RuntimeException("Stub!");
    }
    
    public static LayoutInflater from(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract LayoutInflater cloneInContext(final Context p0);
    
    public Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    public final Factory getFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public final Factory2 getFactory2() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFactory(final Factory factory) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFactory2(final Factory2 factory) {
        throw new RuntimeException("Stub!");
    }
    
    public Filter getFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFilter(final Filter filter) {
        throw new RuntimeException("Stub!");
    }
    
    public View inflate(final int resource, @Nullable final ViewGroup root) {
        throw new RuntimeException("Stub!");
    }
    
    public View inflate(final XmlPullParser parser, @Nullable final ViewGroup root) {
        throw new RuntimeException("Stub!");
    }
    
    public View inflate(final int resource, @Nullable final ViewGroup root, final boolean attachToRoot) {
        throw new RuntimeException("Stub!");
    }
    
    public View inflate(final XmlPullParser parser, @Nullable final ViewGroup root, final boolean attachToRoot) {
        throw new RuntimeException("Stub!");
    }
    
    public final View createView(final String name, final String prefix, final AttributeSet attrs) throws ClassNotFoundException, InflateException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final View createView(@NonNull final Context viewContext, @NonNull final String name, @Nullable final String prefix, @Nullable final AttributeSet attrs) throws ClassNotFoundException, InflateException {
        throw new RuntimeException("Stub!");
    }
    
    protected View onCreateView(final String name, final AttributeSet attrs) throws ClassNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    protected View onCreateView(final View parent, final String name, final AttributeSet attrs) throws ClassNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public View onCreateView(@NonNull final Context viewContext, @Nullable final View parent, @NonNull final String name, @Nullable final AttributeSet attrs) throws ClassNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public interface Filter
    {
        boolean onLoadClass(final Class p0);
    }
    
    public interface Factory2 extends Factory
    {
        @Nullable
        View onCreateView(@Nullable final View p0, @NonNull final String p1, @NonNull final Context p2, @NonNull final AttributeSet p3);
    }
    
    public interface Factory
    {
        @Nullable
        View onCreateView(@NonNull final String p0, @NonNull final Context p1, @NonNull final AttributeSet p2);
    }
}
