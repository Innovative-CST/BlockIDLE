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
public final class AppCompatSpinner$InspectionCompanion implements InspectionCompanion<AppCompatSpinner>
{
    private boolean mPropertiesMapped;
    private int mBackgroundTintId;
    private int mBackgroundTintModeId;
    
    public AppCompatSpinner$InspectionCompanion() {
        this.mPropertiesMapped = false;
    }
    
    public void mapProperties(@NonNull final PropertyMapper propertyMapper) {
        this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.mPropertiesMapped = true;
    }
    
    public void readProperties(@NonNull final AppCompatSpinner appCompatSpinner, @NonNull final PropertyReader propertyReader) {
        if (!this.mPropertiesMapped) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.mBackgroundTintId, (Object)appCompatSpinner.getBackgroundTintList());
        propertyReader.readObject(this.mBackgroundTintModeId, (Object)appCompatSpinner.getBackgroundTintMode());
    }
}
