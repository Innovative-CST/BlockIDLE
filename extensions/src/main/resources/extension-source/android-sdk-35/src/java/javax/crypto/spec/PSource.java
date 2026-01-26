package javax.crypto.spec;

public class PSource
{
    protected PSource(final String pSrcName) {
        throw new RuntimeException("Stub!");
    }
    
    public String getAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class PSpecified extends PSource
    {
        public static final PSpecified DEFAULT;
        
        public PSpecified(final byte[] p) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public byte[] getValue() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            DEFAULT = null;
        }
    }
}
