package javax.crypto.spec;

import java.security.spec.AlgorithmParameterSpec;

public class OAEPParameterSpec implements AlgorithmParameterSpec
{
    public static final OAEPParameterSpec DEFAULT;
    
    public OAEPParameterSpec(final String mdName, final String mgfName, final AlgorithmParameterSpec mgfSpec, final PSource pSrc) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDigestAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public String getMGFAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public AlgorithmParameterSpec getMGFParameters() {
        throw new RuntimeException("Stub!");
    }
    
    public PSource getPSource() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        DEFAULT = null;
    }
}
