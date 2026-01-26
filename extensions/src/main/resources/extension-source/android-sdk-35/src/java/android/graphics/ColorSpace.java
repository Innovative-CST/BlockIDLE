package android.graphics;

import java.util.function.DoubleUnaryOperator;

public abstract class ColorSpace
{
    public static final float[] ILLUMINANT_A;
    public static final float[] ILLUMINANT_B;
    public static final float[] ILLUMINANT_C;
    public static final float[] ILLUMINANT_D50;
    public static final float[] ILLUMINANT_D55;
    public static final float[] ILLUMINANT_D60;
    public static final float[] ILLUMINANT_D65;
    public static final float[] ILLUMINANT_D75;
    public static final float[] ILLUMINANT_E;
    public static final int MAX_ID = 63;
    public static final int MIN_ID = -1;
    
    ColorSpace() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Model getModel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getComponentCount() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean isWideGamut();
    
    public boolean isSrgb() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract float getMinValue(final int p0);
    
    public abstract float getMaxValue(final int p0);
    
    @NonNull
    public float[] toXyz(final float r, final float g, final float b) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract float[] toXyz(@NonNull final float[] p0);
    
    @NonNull
    public float[] fromXyz(final float x, final float y, final float z) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract float[] fromXyz(@NonNull final float[] p0);
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Connector connect(@NonNull final ColorSpace source, @NonNull final ColorSpace destination) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Connector connect(@NonNull final ColorSpace source, @NonNull final ColorSpace destination, @NonNull final RenderIntent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Connector connect(@NonNull final ColorSpace source) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Connector connect(@NonNull final ColorSpace source, @NonNull final RenderIntent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ColorSpace adapt(@NonNull final ColorSpace colorSpace, @NonNull final float[] whitePoint) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ColorSpace adapt(@NonNull final ColorSpace colorSpace, @NonNull final float[] whitePoint, @NonNull final Adaptation adaptation) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static ColorSpace getFromDataSpace(final int dataSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataSpace() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ColorSpace get(@NonNull final Named name) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static ColorSpace match(@NonNull final float[] toXYZD50, @NonNull final Rgb.TransferParameters function) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static float[] cctToXyz(final int cct) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static float[] chromaticAdaptation(@NonNull final Adaptation adaptation, @NonNull final float[] srcWhitePoint, @NonNull final float[] dstWhitePoint) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        ILLUMINANT_A = null;
        ILLUMINANT_B = null;
        ILLUMINANT_C = null;
        ILLUMINANT_D50 = null;
        ILLUMINANT_D55 = null;
        ILLUMINANT_D60 = null;
        ILLUMINANT_D65 = null;
        ILLUMINANT_D75 = null;
        ILLUMINANT_E = null;
    }
    
    public enum Adaptation
    {
        BRADFORD, 
        VON_KRIES, 
        CIECAT02;
    }
    
    public static class Connector
    {
        Connector() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ColorSpace getSource() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ColorSpace getDestination() {
            throw new RuntimeException("Stub!");
        }
        
        public RenderIntent getRenderIntent() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] transform(final float r, final float g, final float b) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] transform(@NonNull final float[] v) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public enum Model
    {
        RGB, 
        XYZ, 
        LAB, 
        CMYK;
        
        public int getComponentCount() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public enum Named
    {
        SRGB, 
        LINEAR_SRGB, 
        EXTENDED_SRGB, 
        LINEAR_EXTENDED_SRGB, 
        BT709, 
        BT2020, 
        DCI_P3, 
        DISPLAY_P3, 
        NTSC_1953, 
        SMPTE_C, 
        ADOBE_RGB, 
        PRO_PHOTO_RGB, 
        ACES, 
        ACESCG, 
        CIE_XYZ, 
        CIE_LAB, 
        BT2020_HLG, 
        BT2020_PQ;
    }
    
    public enum RenderIntent
    {
        PERCEPTUAL, 
        RELATIVE, 
        SATURATION, 
        ABSOLUTE;
    }
    
    public static class Rgb extends ColorSpace
    {
        public Rgb(@NonNull final String name, @NonNull final float[] toXYZ, @NonNull final DoubleUnaryOperator oetf, @NonNull final DoubleUnaryOperator eotf) {
            throw new RuntimeException("Stub!");
        }
        
        public Rgb(@NonNull final String name, @NonNull final float[] primaries, @NonNull final float[] whitePoint, @NonNull final DoubleUnaryOperator oetf, @NonNull final DoubleUnaryOperator eotf, final float min, final float max) {
            throw new RuntimeException("Stub!");
        }
        
        public Rgb(@NonNull final String name, @NonNull final float[] toXYZ, @NonNull final TransferParameters function) {
            throw new RuntimeException("Stub!");
        }
        
        public Rgb(@NonNull final String name, @NonNull final float[] primaries, @NonNull final float[] whitePoint, @NonNull final TransferParameters function) {
            throw new RuntimeException("Stub!");
        }
        
        public Rgb(@NonNull final String name, @NonNull final float[] toXYZ, final double gamma) {
            throw new RuntimeException("Stub!");
        }
        
        public Rgb(@NonNull final String name, @NonNull final float[] primaries, @NonNull final float[] whitePoint, final double gamma) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] getWhitePoint(@NonNull final float[] whitePoint) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] getWhitePoint() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] getPrimaries(@NonNull final float[] primaries) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] getPrimaries() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] getTransform(@NonNull final float[] transform) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] getTransform() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] getInverseTransform(@NonNull final float[] inverseTransform) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] getInverseTransform() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DoubleUnaryOperator getOetf() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DoubleUnaryOperator getEotf() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public TransferParameters getTransferParameters() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean isSrgb() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean isWideGamut() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public float getMinValue(final int component) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public float getMaxValue(final int component) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] toLinear(final float r, final float g, final float b) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] toLinear(@NonNull final float[] v) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] fromLinear(final float r, final float g, final float b) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] fromLinear(@NonNull final float[] v) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        @Override
        public float[] toXyz(@NonNull final float[] v) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        @Override
        public float[] fromXyz(@NonNull final float[] v) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        public static class TransferParameters
        {
            public final double a;
            public final double b;
            public final double c;
            public final double d;
            public final double e;
            public final double f;
            public final double g;
            
            public TransferParameters(final double a, final double b, final double c, final double d, final double g) {
                this.a = 0.0;
                this.b = 0.0;
                this.c = 0.0;
                this.d = 0.0;
                this.e = 0.0;
                this.f = 0.0;
                this.g = 0.0;
                throw new RuntimeException("Stub!");
            }
            
            public TransferParameters(final double a, final double b, final double c, final double d, final double e, final double f, final double g) {
                this.a = 0.0;
                this.b = 0.0;
                this.c = 0.0;
                this.d = 0.0;
                this.e = 0.0;
                this.f = 0.0;
                this.g = 0.0;
                throw new RuntimeException("Stub!");
            }
            
            @Override
            public boolean equals(final Object o) {
                throw new RuntimeException("Stub!");
            }
            
            @Override
            public int hashCode() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
