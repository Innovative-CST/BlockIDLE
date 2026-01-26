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
public final class AppCompatImageView$InspectionCompanion implements InspectionCompanion<AppCompatImageView>
{
    private boolean mPropertiesMapped;
    private int mBackgroundTintId;
    private int mBackgroundTintModeId;
    private int mTintId;
    private int mTintModeId;
    
    public AppCompatImageView$InspectionCompanion() {
        this.mPropertiesMapped = false;
    }
    
    public void mapProperties(@NonNull final PropertyMapper propertyMapper) {
        this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
        this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
        this.mTintId = propertyMapper.mapObject("tint", R.attr.tint);
        this.mTintModeId = propertyMapper.mapObject("tintMode", R.attr.tintMode);
        this.mPropertiesMapped = true;
    }
    
    public void readProperties(@NonNull final AppCompatImageView appCompatImageView, @NonNull final PropertyReader propertyReader) {
        if (!this.mPropertiesMapped) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.mBackgroundTintId, (Object)appCompatImageView.getBackgroundTintList());
        propertyReader.readObject(this.mBackgroundTintModeId, (Object)appCompatImageView.getBackgroundTintMode());
        propertyReader.readObject(this.mTintId, (Object)appCompatImageView.getImageTintList());
        propertyReader.readObject(this.mTintModeId, (Object)appCompatImageView.getImageTintMode());
    }
}
