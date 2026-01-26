package android.service.autofill;

import java.util.List;

public final class FieldClassification
{
    FieldClassification() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Match> getMatches() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Match
    {
        Match() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getCategoryId() {
            throw new RuntimeException("Stub!");
        }
        
        public float getScore() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
