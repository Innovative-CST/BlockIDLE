package android.app.appsearch;

import java.util.Iterator;
import java.util.List;

public class PropertyPath implements Iterable<PathSegment>
{
    public PropertyPath(@NonNull final List<PathSegment> pathList) {
        throw new RuntimeException("Stub!");
    }
    
    public PropertyPath(@NonNull final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PathSegment get(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int size() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Iterator<PathSegment> iterator() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public static class PathSegment
    {
        public static final int NON_REPEATED_CARDINALITY = -1;
        
        PathSegment() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static PathSegment create(@NonNull final String propertyName, final int propertyIndex) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static PathSegment create(@NonNull final String propertyName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getPropertyName() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPropertyIndex() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
}
