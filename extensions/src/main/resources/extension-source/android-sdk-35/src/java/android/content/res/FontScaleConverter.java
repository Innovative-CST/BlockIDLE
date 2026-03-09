package android.content.res;

public interface FontScaleConverter
{
    float convertSpToDp(final float p0);
    
    float convertDpToSp(final float p0);
    
    default boolean isNonLinearFontScalingActive(final float fontScale) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    default FontScaleConverter forScale(final float fontScale) {
        throw new RuntimeException("Stub!");
    }
}
