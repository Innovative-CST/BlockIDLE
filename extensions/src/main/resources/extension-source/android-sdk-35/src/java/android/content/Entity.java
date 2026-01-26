package android.content;

import android.net.Uri;
import java.util.ArrayList;

public final class Entity
{
    public Entity(final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    public ContentValues getEntityValues() {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayList<NamedContentValues> getSubValues() {
        throw new RuntimeException("Stub!");
    }
    
    public void addSubValue(final Uri uri, final ContentValues values) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static class NamedContentValues
    {
        public final Uri uri;
        public final ContentValues values;
        
        public NamedContentValues(final Uri uri, final ContentValues values) {
            this.uri = null;
            this.values = null;
            throw new RuntimeException("Stub!");
        }
    }
}
