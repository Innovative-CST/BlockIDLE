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
public final class SearchView$InspectionCompanion implements InspectionCompanion<SearchView>
{
    private boolean mPropertiesMapped;
    private int mImeOptionsId;
    private int mMaxWidthId;
    private int mIconifiedByDefaultId;
    private int mQueryHintId;
    
    public SearchView$InspectionCompanion() {
        this.mPropertiesMapped = false;
    }
    
    public void mapProperties(@NonNull final PropertyMapper propertyMapper) {
        this.mImeOptionsId = propertyMapper.mapInt("imeOptions", 16843364);
        this.mMaxWidthId = propertyMapper.mapInt("maxWidth", 16843039);
        this.mIconifiedByDefaultId = propertyMapper.mapBoolean("iconifiedByDefault", R.attr.iconifiedByDefault);
        this.mQueryHintId = propertyMapper.mapObject("queryHint", R.attr.queryHint);
        this.mPropertiesMapped = true;
    }
    
    public void readProperties(@NonNull final SearchView searchView, @NonNull final PropertyReader propertyReader) {
        if (!this.mPropertiesMapped) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.mImeOptionsId, searchView.getImeOptions());
        propertyReader.readInt(this.mMaxWidthId, searchView.getMaxWidth());
        propertyReader.readBoolean(this.mIconifiedByDefaultId, searchView.isIconfiedByDefault());
        propertyReader.readObject(this.mQueryHintId, (Object)searchView.getQueryHint());
    }
}
