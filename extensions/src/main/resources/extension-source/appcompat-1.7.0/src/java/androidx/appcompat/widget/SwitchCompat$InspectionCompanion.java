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
public final class SwitchCompat$InspectionCompanion implements InspectionCompanion<SwitchCompat>
{
    private boolean mPropertiesMapped;
    private int mTextOffId;
    private int mTextOnId;
    private int mThumbId;
    private int mShowTextId;
    private int mSplitTrackId;
    private int mSwitchMinWidthId;
    private int mSwitchPaddingId;
    private int mThumbTextPaddingId;
    private int mThumbTintId;
    private int mThumbTintModeId;
    private int mTrackId;
    private int mTrackTintId;
    private int mTrackTintModeId;
    
    public SwitchCompat$InspectionCompanion() {
        this.mPropertiesMapped = false;
    }
    
    public void mapProperties(@NonNull final PropertyMapper propertyMapper) {
        this.mTextOffId = propertyMapper.mapObject("textOff", 16843045);
        this.mTextOnId = propertyMapper.mapObject("textOn", 16843044);
        this.mThumbId = propertyMapper.mapObject("thumb", 16843074);
        this.mShowTextId = propertyMapper.mapBoolean("showText", R.attr.showText);
        this.mSplitTrackId = propertyMapper.mapBoolean("splitTrack", R.attr.splitTrack);
        this.mSwitchMinWidthId = propertyMapper.mapInt("switchMinWidth", R.attr.switchMinWidth);
        this.mSwitchPaddingId = propertyMapper.mapInt("switchPadding", R.attr.switchPadding);
        this.mThumbTextPaddingId = propertyMapper.mapInt("thumbTextPadding", R.attr.thumbTextPadding);
        this.mThumbTintId = propertyMapper.mapObject("thumbTint", R.attr.thumbTint);
        this.mThumbTintModeId = propertyMapper.mapObject("thumbTintMode", R.attr.thumbTintMode);
        this.mTrackId = propertyMapper.mapObject("track", R.attr.track);
        this.mTrackTintId = propertyMapper.mapObject("trackTint", R.attr.trackTint);
        this.mTrackTintModeId = propertyMapper.mapObject("trackTintMode", R.attr.trackTintMode);
        this.mPropertiesMapped = true;
    }
    
    public void readProperties(@NonNull final SwitchCompat switchCompat, @NonNull final PropertyReader propertyReader) {
        if (!this.mPropertiesMapped) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.mTextOffId, (Object)switchCompat.getTextOff());
        propertyReader.readObject(this.mTextOnId, (Object)switchCompat.getTextOn());
        propertyReader.readObject(this.mThumbId, (Object)switchCompat.getThumbDrawable());
        propertyReader.readBoolean(this.mShowTextId, switchCompat.getShowText());
        propertyReader.readBoolean(this.mSplitTrackId, switchCompat.getSplitTrack());
        propertyReader.readInt(this.mSwitchMinWidthId, switchCompat.getSwitchMinWidth());
        propertyReader.readInt(this.mSwitchPaddingId, switchCompat.getSwitchPadding());
        propertyReader.readInt(this.mThumbTextPaddingId, switchCompat.getThumbTextPadding());
        propertyReader.readObject(this.mThumbTintId, (Object)switchCompat.getThumbTintList());
        propertyReader.readObject(this.mThumbTintModeId, (Object)switchCompat.getThumbTintMode());
        propertyReader.readObject(this.mTrackId, (Object)switchCompat.getTrackDrawable());
        propertyReader.readObject(this.mTrackTintId, (Object)switchCompat.getTrackTintList());
        propertyReader.readObject(this.mTrackTintModeId, (Object)switchCompat.getTrackTintMode());
    }
}
