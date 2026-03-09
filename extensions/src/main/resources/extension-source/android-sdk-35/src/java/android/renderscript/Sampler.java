package android.renderscript;

@Deprecated
public class Sampler extends BaseObj
{
    Sampler() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Value getMinification() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Value getMagnification() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Value getWrapS() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Value getWrapT() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public float getAnisotropy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Sampler CLAMP_NEAREST(final RenderScript rs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Sampler CLAMP_LINEAR(final RenderScript rs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Sampler CLAMP_LINEAR_MIP_LINEAR(final RenderScript rs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Sampler WRAP_NEAREST(final RenderScript rs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Sampler WRAP_LINEAR(final RenderScript rs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Sampler WRAP_LINEAR_MIP_LINEAR(final RenderScript rs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Sampler MIRRORED_REPEAT_NEAREST(final RenderScript rs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Sampler MIRRORED_REPEAT_LINEAR(final RenderScript rs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Sampler MIRRORED_REPEAT_LINEAR_MIP_LINEAR(final RenderScript rs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class Builder
    {
        @Deprecated
        public Builder(final RenderScript rs) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setMinification(final Value v) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setMagnification(final Value v) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setWrapS(final Value v) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setWrapT(final Value v) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void setAnisotropy(final float v) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Sampler create() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public enum Value
    {
        @Deprecated
        NEAREST, 
        @Deprecated
        LINEAR, 
        @Deprecated
        LINEAR_MIP_LINEAR, 
        @Deprecated
        LINEAR_MIP_NEAREST, 
        @Deprecated
        WRAP, 
        @Deprecated
        CLAMP, 
        @Deprecated
        MIRRORED_REPEAT;
    }
}
