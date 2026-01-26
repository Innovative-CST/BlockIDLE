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
public final class AppCompatToggleButton$InspectionCompanion implements InspectionCompanion<AppCompatToggleButton>
{
    private boolean mPropertiesMapped;
    private int mBackgroundTintId;
    private int mBackgroundTintModeId;
    private int mDrawableTintId;
    private int mDrawableTintModeId;
    
    public AppCompatToggleButton$InspectionCompanion() {
        this.mPropertiesMapped = false;
    }
    
    public void mapProperties(@NonNull final PropertyMapper propertyMapper) {
        this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.mDrawableTintId = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
        this.mDrawableTintModeId = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
        this.mPropertiesMapped = true;
    }
    
    public void readProperties(@NonNull final AppCompatToggleButton appCompatToggleButton, @NonNull final PropertyReader propertyReader) {
        if (!this.mPropertiesMapped) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.mBackgroundTintId, (Object)appCompatToggleButton.getBackgroundTintList());
        propertyReader.readObject(this.mBackgroundTintModeId, (Object)appCompatToggleButton.getBackgroundTintMode());
        propertyReader.readObject(this.mDrawableTintId, (Object)appCompatToggleButton.getCompoundDrawableTintList());
        propertyReader.readObject(this.mDrawableTintModeId, (Object)appCompatToggleButton.getCompoundDrawableTintMode());
    }
}
