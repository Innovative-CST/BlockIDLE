package androidx.appcompat.widget;

import android.view.inspector.PropertyReader;
import java.util.HashSet;
import java.util.Set;
import androidx.appcompat.R;
import java.util.function.IntFunction;
import androidx.annotation.NonNull;
import android.view.inspector.PropertyMapper;
import androidx.annotation.RestrictTo;
import androidx.annotation.RequiresApi;
import android.view.inspector.InspectionCompanion;

@RequiresApi(29)
@RestrictTo({ RestrictTo.Scope.LIBRARY })
public final class LinearLayoutCompat$InspectionCompanion implements InspectionCompanion<LinearLayoutCompat>
{
    private boolean mPropertiesMapped;
    private int mBaselineAlignedId;
    private int mBaselineAlignedChildIndexId;
    private int mGravityId;
    private int mOrientationId;
    private int mWeightSumId;
    private int mDividerId;
    private int mDividerPaddingId;
    private int mMeasureWithLargestChildId;
    private int mShowDividersId;
    
    public LinearLayoutCompat$InspectionCompanion() {
        this.mPropertiesMapped = false;
    }
    
    public void mapProperties(@NonNull final PropertyMapper propertyMapper) {
        this.mBaselineAlignedId = propertyMapper.mapBoolean("baselineAligned", 16843046);
        this.mBaselineAlignedChildIndexId = propertyMapper.mapInt("baselineAlignedChildIndex", 16843047);
        this.mGravityId = propertyMapper.mapGravity("gravity", 16842927);
        this.mOrientationId = propertyMapper.mapIntEnum("orientation", 16842948, (IntFunction)new IntFunction<String>() {
            public String apply(final int value) {
                switch (value) {
                    case 0: {
                        return "horizontal";
                    }
                    case 1: {
                        return "vertical";
                    }
                    default: {
                        return String.valueOf(value);
                    }
                }
            }
        });
        this.mWeightSumId = propertyMapper.mapFloat("weightSum", 16843048);
        this.mDividerId = propertyMapper.mapObject("divider", R.attr.divider);
        this.mDividerPaddingId = propertyMapper.mapInt("dividerPadding", R.attr.dividerPadding);
        this.mMeasureWithLargestChildId = propertyMapper.mapBoolean("measureWithLargestChild", R.attr.measureWithLargestChild);
        this.mShowDividersId = propertyMapper.mapIntFlag("showDividers", R.attr.showDividers, (IntFunction)new IntFunction<Set<String>>() {
            public Set<String> apply(final int value) {
                final Set<String> flags = (Set<String>)new HashSet();
                if (value == 0) {
                    flags.add((Object)"none");
                }
                if (value == 1) {
                    flags.add((Object)"beginning");
                }
                if (value == 2) {
                    flags.add((Object)"middle");
                }
                if (value == 4) {
                    flags.add((Object)"end");
                }
                return flags;
            }
        });
        this.mPropertiesMapped = true;
    }
    
    public void readProperties(@NonNull final LinearLayoutCompat linearLayoutCompat, @NonNull final PropertyReader propertyReader) {
        if (!this.mPropertiesMapped) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readBoolean(this.mBaselineAlignedId, linearLayoutCompat.isBaselineAligned());
        propertyReader.readInt(this.mBaselineAlignedChildIndexId, linearLayoutCompat.getBaselineAlignedChildIndex());
        propertyReader.readGravity(this.mGravityId, linearLayoutCompat.getGravity());
        propertyReader.readIntEnum(this.mOrientationId, linearLayoutCompat.getOrientation());
        propertyReader.readFloat(this.mWeightSumId, linearLayoutCompat.getWeightSum());
        propertyReader.readObject(this.mDividerId, (Object)linearLayoutCompat.getDividerDrawable());
        propertyReader.readInt(this.mDividerPaddingId, linearLayoutCompat.getDividerPadding());
        propertyReader.readBoolean(this.mMeasureWithLargestChildId, linearLayoutCompat.isMeasureWithLargestChildEnabled());
        propertyReader.readIntFlag(this.mShowDividersId, linearLayoutCompat.getShowDividers());
    }
}
