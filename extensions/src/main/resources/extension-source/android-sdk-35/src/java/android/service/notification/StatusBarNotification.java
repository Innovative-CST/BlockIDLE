package android.service.notification;

import android.os.Parcel;
import android.os.UserHandle;
import android.app.Notification;
import android.os.Parcelable;

public class StatusBarNotification implements Parcelable
{
    @NonNull
    public static final Creator<StatusBarNotification> CREATOR;
    
    @Deprecated
    public StatusBarNotification(final String pkg, final String opPkg, final int id, final String tag, final int uid, final int initialPid, final int score, final Notification notification, final UserHandle user, final long postTime) {
        throw new RuntimeException("Stub!");
    }
    
    public StatusBarNotification(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isGroup() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAppGroup() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    public StatusBarNotification clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOngoing() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isClearable() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getUserId() {
        throw new RuntimeException("Stub!");
    }
    
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public String getTag() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUid() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getOpPkg() {
        throw new RuntimeException("Stub!");
    }
    
    public Notification getNotification() {
        throw new RuntimeException("Stub!");
    }
    
    public UserHandle getUser() {
        throw new RuntimeException("Stub!");
    }
    
    public long getPostTime() {
        throw new RuntimeException("Stub!");
    }
    
    public String getKey() {
        throw new RuntimeException("Stub!");
    }
    
    public String getGroupKey() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOverrideGroupKey(final String overrideGroupKey) {
        throw new RuntimeException("Stub!");
    }
    
    public String getOverrideGroupKey() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
