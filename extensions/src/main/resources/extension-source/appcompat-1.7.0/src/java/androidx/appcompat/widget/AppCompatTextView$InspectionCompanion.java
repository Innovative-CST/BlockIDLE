package androidx.appcompat.widget;

import android.view.inspector.PropertyReader;
import java.util.function.IntFunction;
import androidx.appcompat.R;
import androidx.annotation.NonNull;
import android.view.inspector.PropertyMapper;
import androidx.annotation.RestrictTo;
import androidx.annotation.RequiresApi;
import android.view.inspector.InspectionCompanion;

@RequiresApi(29)
@RestrictTo({ RestrictTo.Scope.LIBRARY })
public final class AppCompatTextView$InspectionCompanion implements InspectionCompanion<AppCompatTextView>
{
    private boolean mPropertiesMapped;
    private int mAutoSizeMaxTextSizeId;
    private int mAutoSizeMinTextSizeId;
    private int mAutoSizeStepGranularityId;
    private int mAutoSizeTextTypeId;
    private int mBackgroundTintId;
    private int mBackgroundTintModeId;
    private int mDrawableTintId;
    private int mDrawableTintModeId;
    
    public AppCompatTextView$InspectionCompanion() {
        this.mPropertiesMapped = false;
    }
    
    public void mapProperties(@NonNull final PropertyMapper propertyMapper) {
        this.mAutoSizeMaxTextSizeId = propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.autoSizeMaxTextSize);
        this.mAutoSizeMinTextSizeId = propertyMapper.mapInt("autoSizeMinTextSize", R.attr.autoSizeMinTextSize);
        this.mAutoSizeStepGranularityId = propertyMapper.mapInt("autoSizeStepGranularity", R.attr.autoSizeStepGranularity);
        this.mAutoSizeTextTypeId = propertyMapper.mapIntEnum("autoSizeTextType", R.attr.autoSizeTextType, (IntFunction)new IntFunction<String>() {
            public String apply(final int value) {
                switch (value) {
                    case 0: {
                        return "none";
                    }
                    case 1: {
                        return "uniform";
                    }
                    default: {
                        return String.valueOf(value);
                    }
                }
            }
        });
        this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.mDrawableTintId = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
        this.mDrawableTintModeId = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
        this.mPropertiesMapped = true;
    }
    
    public void readProperties(@NonNull final AppCompatTextView appCompatTextView, @NonNull final PropertyReader propertyReader) {
        if (!this.mPropertiesMapped) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.mAutoSizeMaxTextSizeId, appCompatTextView.getAutoSizeMaxTextSize());
        propertyReader.readInt(this.mAutoSizeMinTextSizeId, appCompatTextView.getAutoSizeMinTextSize());
        propertyReader.readInt(this.mAutoSizeStepGranularityId, appCompatTextView.getAutoSizeStepGranularity());
        propertyReader.readIntEnum(this.mAutoSizeTextTypeId, appCompatTextView.getAutoSizeTextType());
        propertyReader.readObject(this.mBackgroundTintId, (Object)appCompatTextView.getBackgroundTintList());
        propertyReader.readObject(this.mBackgroundTintModeId, (Object)appCompatTextView.getBackgroundTintMode());
        propertyReader.readObject(this.mDrawableTintId, (Object)appCompatTextView.getCompoundDrawableTintList());
        propertyReader.readObject(this.mDrawableTintModeId, (Object)appCompatTextView.getCompoundDrawableTintMode());
    }
}
