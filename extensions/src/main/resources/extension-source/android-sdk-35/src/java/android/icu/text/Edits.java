package android.icu.text;

public final class Edits
{
    public Edits() {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public void addUnchanged(final int unchangedLength) {
        throw new RuntimeException("Stub!");
    }
    
    public void addReplace(final int oldLength, final int newLength) {
        throw new RuntimeException("Stub!");
    }
    
    public int lengthDelta() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasChanges() {
        throw new RuntimeException("Stub!");
    }
    
    public int numberOfChanges() {
        throw new RuntimeException("Stub!");
    }
    
    public Iterator getCoarseChangesIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public Iterator getCoarseIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public Iterator getFineChangesIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public Iterator getFineIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public Edits mergeAndAppend(final Edits ab, final Edits bc) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Iterator
    {
        Iterator() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean next() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean findSourceIndex(final int i) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean findDestinationIndex(final int i) {
            throw new RuntimeException("Stub!");
        }
        
        public int destinationIndexFromSourceIndex(final int i) {
            throw new RuntimeException("Stub!");
        }
        
        public int sourceIndexFromDestinationIndex(final int i) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean hasChange() {
            throw new RuntimeException("Stub!");
        }
        
        public int oldLength() {
            throw new RuntimeException("Stub!");
        }
        
        public int newLength() {
            throw new RuntimeException("Stub!");
        }
        
        public int sourceIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int replacementIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int destinationIndex() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
