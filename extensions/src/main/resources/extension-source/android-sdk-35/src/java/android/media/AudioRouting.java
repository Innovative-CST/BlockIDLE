package android.media;

import android.os.Handler;

public interface AudioRouting
{
    boolean setPreferredDevice(final AudioDeviceInfo p0);
    
    AudioDeviceInfo getPreferredDevice();
    
    AudioDeviceInfo getRoutedDevice();
    
    void addOnRoutingChangedListener(final OnRoutingChangedListener p0, final Handler p1);
    
    void removeOnRoutingChangedListener(final OnRoutingChangedListener p0);
    
    public interface OnRoutingChangedListener
    {
        void onRoutingChanged(final AudioRouting p0);
    }
}
