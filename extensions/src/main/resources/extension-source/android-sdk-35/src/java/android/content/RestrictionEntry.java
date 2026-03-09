package android.content;

import android.os.Parcel;
import android.os.Parcelable;

public class RestrictionEntry implements Parcelable
{
    @NonNull
    public static final Creator<RestrictionEntry> CREATOR;
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_BUNDLE = 7;
    public static final int TYPE_BUNDLE_ARRAY = 8;
    public static final int TYPE_CHOICE = 2;
    public static final int TYPE_INTEGER = 5;
    public static final int TYPE_MULTI_SELECT = 4;
    public static final int TYPE_NULL = 0;
    public static final int TYPE_STRING = 6;
    
    public RestrictionEntry(final int type, final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public RestrictionEntry(final String key, final String selectedString) {
        throw new RuntimeException("Stub!");
    }
    
    public RestrictionEntry(final String key, final boolean selectedState) {
        throw new RuntimeException("Stub!");
    }
    
    public RestrictionEntry(final String key, final String[] selectedStrings) {
        throw new RuntimeException("Stub!");
    }
    
    public RestrictionEntry(final String key, final int selectedInt) {
        throw new RuntimeException("Stub!");
    }
    
    public RestrictionEntry(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    public static RestrictionEntry createBundleEntry(final String key, final RestrictionEntry[] restrictionEntries) {
        throw new RuntimeException("Stub!");
    }
    
    public static RestrictionEntry createBundleArrayEntry(final String key, final RestrictionEntry[] restrictionEntries) {
        throw new RuntimeException("Stub!");
    }
    
    public void setType(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSelectedString() {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getAllSelectedStrings() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getSelectedState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIntValue() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntValue(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelectedString(final String selectedString) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelectedState(final boolean state) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllSelectedStrings(final String[] allSelectedStrings) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChoiceValues(final String[] choiceValues) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChoiceValues(final Context context, final int stringArrayResId) {
        throw new RuntimeException("Stub!");
    }
    
    public RestrictionEntry[] getRestrictions() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRestrictions(final RestrictionEntry[] restrictions) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getChoiceValues() {
        throw new RuntimeException("Stub!");
    }
    
    public void setChoiceEntries(final String[] choiceEntries) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChoiceEntries(final Context context, final int stringArrayResId) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getChoiceEntries() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDescription(final String description) {
        throw new RuntimeException("Stub!");
    }
    
    public String getKey() {
        throw new RuntimeException("Stub!");
    }
    
    public String getTitle() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTitle(final String title) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
