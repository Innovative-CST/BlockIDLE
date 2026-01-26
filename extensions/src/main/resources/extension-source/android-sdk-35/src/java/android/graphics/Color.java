package android.graphics;

public class Color
{
    public static final int BLACK = -16777216;
    public static final int BLUE = -16776961;
    public static final int CYAN = -16711681;
    public static final int DKGRAY = -12303292;
    public static final int GRAY = -7829368;
    public static final int GREEN = -16711936;
    public static final int LTGRAY = -3355444;
    public static final int MAGENTA = -65281;
    public static final int RED = -65536;
    public static final int TRANSPARENT = 0;
    public static final int WHITE = -1;
    public static final int YELLOW = -256;
    
    public Color() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ColorSpace getColorSpace() {
        throw new RuntimeException("Stub!");
    }
    
    public ColorSpace.Model getModel() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWideGamut() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSrgb() {
        throw new RuntimeException("Stub!");
    }
    
    public int getComponentCount() {
        throw new RuntimeException("Stub!");
    }
    
    public long pack() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Color convert(@NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public int toArgb() {
        throw new RuntimeException("Stub!");
    }
    
    public float red() {
        throw new RuntimeException("Stub!");
    }
    
    public float green() {
        throw new RuntimeException("Stub!");
    }
    
    public float blue() {
        throw new RuntimeException("Stub!");
    }
    
    public float alpha() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] getComponents() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] getComponents(@Nullable final float[] components) {
        throw new RuntimeException("Stub!");
    }
    
    public float getComponent(final int component) {
        throw new RuntimeException("Stub!");
    }
    
    public float luminance() {
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
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ColorSpace colorSpace(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public static float red(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public static float green(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public static float blue(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public static float alpha(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSrgb(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isWideGamut(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isInColorSpace(final long color, @NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public static int toArgb(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Color valueOf(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Color valueOf(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Color valueOf(final float r, final float g, final float b) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Color valueOf(final float r, final float g, final float b, final float a) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Color valueOf(final float r, final float g, final float b, final float a, @NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Color valueOf(@NonNull final float[] components, @NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public static long pack(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public static long pack(final float red, final float green, final float blue) {
        throw new RuntimeException("Stub!");
    }
    
    public static long pack(final float red, final float green, final float blue, final float alpha) {
        throw new RuntimeException("Stub!");
    }
    
    public static long pack(final float red, final float green, final float blue, final float alpha, @NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public static long convert(final int color, @NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public static long convert(final long color, @NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public static long convert(final float r, final float g, final float b, final float a, @NonNull final ColorSpace source, @NonNull final ColorSpace destination) {
        throw new RuntimeException("Stub!");
    }
    
    public static long convert(final long color, @NonNull final ColorSpace.Connector connector) {
        throw new RuntimeException("Stub!");
    }
    
    public static long convert(final float r, final float g, final float b, final float a, @NonNull final ColorSpace.Connector connector) {
        throw new RuntimeException("Stub!");
    }
    
    public static float luminance(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public static int alpha(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public static int red(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public static int green(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public static int blue(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public static int rgb(final int red, final int green, final int blue) {
        throw new RuntimeException("Stub!");
    }
    
    public static int rgb(final float red, final float green, final float blue) {
        throw new RuntimeException("Stub!");
    }
    
    public static int argb(final int alpha, final int red, final int green, final int blue) {
        throw new RuntimeException("Stub!");
    }
    
    public static int argb(final float alpha, final float red, final float green, final float blue) {
        throw new RuntimeException("Stub!");
    }
    
    public static float luminance(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public static int parseColor(final String colorString) {
        throw new RuntimeException("Stub!");
    }
    
    public static void RGBToHSV(final int red, final int green, final int blue, final float[] hsv) {
        throw new RuntimeException("Stub!");
    }
    
    public static void colorToHSV(final int color, final float[] hsv) {
        throw new RuntimeException("Stub!");
    }
    
    public static int HSVToColor(final float[] hsv) {
        throw new RuntimeException("Stub!");
    }
    
    public static int HSVToColor(final int alpha, final float[] hsv) {
        throw new RuntimeException("Stub!");
    }
}
