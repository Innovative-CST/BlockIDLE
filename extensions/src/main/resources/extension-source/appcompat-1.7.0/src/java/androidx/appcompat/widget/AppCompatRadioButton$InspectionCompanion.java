package androidx.appcompat.widget;

import android.view.inspector.PropertyReader;
import androidx.appcompat.R;
import androidx.annotation.NonNull;
import android.view.inspector.PropertyMapper;
import androidx.annotation.RestrictTo;
import androidx.annotation.RequiresApi;
import android.view.inspector.InspectionCompanion;

@RequiresApi(29)
@RestrictTo({ RestrictTo.Scope.LIBRARY })
public final class AppCompatRadioButton$InspectionCompanion implements InspectionCompanion<AppCompatRadioButton>
{
    private boolean mPropertiesMapped;
    private int mBackgroundTintId;
    private int mBackgroundTintModeId;
    private int mButtonTintId;
    private int mButtonTintModeId;
    private int mDrawableTintId;
    private int mDrawableTintModeId;
    
    public AppCompatRadioButton$InspectionCompanion() {
        this.mPropertiesMapped = false;
    }
    
    public void mapProperties(@NonNull final PropertyMapper propertyMapper) {
        this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.mButtonTintId = propertyMapper.mapObject("buttonTint", R.attr.buttonTint);
        this.mButtonTintModeId = propertyMapper.mapObject("buttonTintMode", R.attr.buttonTintMode);
        this.mDrawableTintId = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
        this.mDrawableTintModeId = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
        this.mPropertiesMapped = true;
    }
    
    public void readProperties(@NonNull final AppCompatRadioButton appCompatRadioButton, @NonNull final PropertyReader propertyReader) {
        if (!this.mPropertiesMapped) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.mBackgroundTintId, (Object)appCompatRadioButton.getBackgroundTintList());
        propertyReader.readObject(this.mBackgroundTintModeId, (Object)appCompatRadioButton.getBackgroundTintMode());
        propertyReader.readObject(this.mButtonTintId, (Object)appCompatRadioButton.getButtonTintList());
        propertyReader.readObject(this.mButtonTintModeId, (Object)appCompatRadioButton.getButtonTintMode());
        propertyReader.readObject(this.mDrawableTintId, (Object)appCompatRadioButton.getCompoundDrawableTintList());
        propertyReader.readObject(this.mDrawableTintModeId, (Object)appCompatRadioButton.getCompoundDrawableTintMode());
    }
}
