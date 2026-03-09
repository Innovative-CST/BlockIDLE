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
public final class AppCompatCheckedTextView$InspectionCompanion implements InspectionCompanion<AppCompatCheckedTextView>
{
    private boolean mPropertiesMapped;
    private int mBackgroundTintId;
    private int mBackgroundTintModeId;
    private int mCheckMarkTintId;
    private int mCheckMarkTintModeId;
    private int mDrawableTintId;
    private int mDrawableTintModeId;
    
    public AppCompatCheckedTextView$InspectionCompanion() {
        this.mPropertiesMapped = false;
    }
    
    public void mapProperties(@NonNull final PropertyMapper propertyMapper) {
        this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.mCheckMarkTintId = propertyMapper.mapObject("checkMarkTint", R.attr.checkMarkTint);
        this.mCheckMarkTintModeId = propertyMapper.mapObject("checkMarkTintMode", R.attr.checkMarkTintMode);
        this.mDrawableTintId = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
        this.mDrawableTintModeId = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
        this.mPropertiesMapped = true;
    }
    
    public void readProperties(@NonNull final AppCompatCheckedTextView appCompatCheckedTextView, @NonNull final PropertyReader propertyReader) {
        if (!this.mPropertiesMapped) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.mBackgroundTintId, (Object)appCompatCheckedTextView.getBackgroundTintList());
        propertyReader.readObject(this.mBackgroundTintModeId, (Object)appCompatCheckedTextView.getBackgroundTintMode());
        propertyReader.readObject(this.mCheckMarkTintId, (Object)appCompatCheckedTextView.getCheckMarkTintList());
        propertyReader.readObject(this.mCheckMarkTintModeId, (Object)appCompatCheckedTextView.getCheckMarkTintMode());
        propertyReader.readObject(this.mDrawableTintId, (Object)appCompatCheckedTextView.getCompoundDrawableTintList());
        propertyReader.readObject(this.mDrawableTintModeId, (Object)appCompatCheckedTextView.getCompoundDrawableTintMode());
    }
}
