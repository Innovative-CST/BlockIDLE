package android.view.accessibility;

import android.os.Parcelable;
import java.util.List;
import android.view.View;

public class AccessibilityRecord
{
    public AccessibilityRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public AccessibilityRecord(@NonNull final AccessibilityRecord record) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSource(@Nullable final View source) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSource(@Nullable final View root, final int virtualDescendantId) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AccessibilityNodeInfo getSource() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AccessibilityNodeInfo getSource(final int prefetchingStrategy) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDisplayId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWindowId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isChecked() {
        throw new RuntimeException("Stub!");
    }
    
    public void setChecked(final boolean isChecked) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEnabled(final boolean isEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPassword() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPassword(final boolean isPassword) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFullScreen() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFullScreen(final boolean isFullScreen) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isScrollable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollable(final boolean scrollable) {
        throw new RuntimeException("Stub!");
    }
    
    public int getItemCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void setItemCount(final int itemCount) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCurrentItemIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCurrentItemIndex(final int currentItemIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFromIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFromIndex(final int fromIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getToIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public void setToIndex(final int toIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScrollX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollX(final int scrollX) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScrollY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollY(final int scrollY) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScrollDeltaX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollDeltaX(final int scrollDeltaX) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScrollDeltaY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollDeltaY(final int scrollDeltaY) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxScrollX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxScrollX(final int maxScrollX) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxScrollY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxScrollY(final int maxScrollY) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAddedCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAddedCount(final int addedCount) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRemovedCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRemovedCount(final int removedCount) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setClassName(@Nullable final CharSequence className) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<CharSequence> getText() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getBeforeText() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBeforeText(@Nullable final CharSequence beforeText) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getContentDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentDescription(@Nullable final CharSequence contentDescription) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Parcelable getParcelableData() {
        throw new RuntimeException("Stub!");
    }
    
    public void setParcelableData(@Nullable final Parcelable parcelableData) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static AccessibilityRecord obtain(@NonNull final AccessibilityRecord record) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static AccessibilityRecord obtain() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void recycle() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
