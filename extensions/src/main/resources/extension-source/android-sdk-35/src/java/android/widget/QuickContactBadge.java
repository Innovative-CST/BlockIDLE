package android.widget;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.net.Uri;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class QuickContactBadge extends ImageView implements OnClickListener
{
    protected String[] mExcludeMimes;
    
    public QuickContactBadge(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public QuickContactBadge(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public QuickContactBadge(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public QuickContactBadge(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void drawableStateChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawableHotspotChanged(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMode(final int size) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPrioritizedMimeType(final String prioritizedMimeType) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageToDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public void assignContactUri(final Uri contactUri) {
        throw new RuntimeException("Stub!");
    }
    
    public void assignContactFromEmail(final String emailAddress, final boolean lazyLookup) {
        throw new RuntimeException("Stub!");
    }
    
    public void assignContactFromEmail(final String emailAddress, final boolean lazyLookup, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public void assignContactFromPhone(final String phoneNumber, final boolean lazyLookup) {
        throw new RuntimeException("Stub!");
    }
    
    public void assignContactFromPhone(final String phoneNumber, final boolean lazyLookup, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOverlay(final Drawable overlay) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onClick(final View v) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setExcludeMimes(final String[] excludeMimes) {
        throw new RuntimeException("Stub!");
    }
}
