package android.app;

import android.view.View;
import android.content.IntentSender;
import android.os.Bundle;
import android.content.Intent;
import android.view.LayoutInflater;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.Handler;
import android.content.Context;

@Deprecated
public abstract class FragmentHostCallback<E> extends FragmentContainer
{
    @Deprecated
    public FragmentHostCallback(final Context context, final Handler handler, final int windowAnimations) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDump(final String prefix, final FileDescriptor fd, final PrintWriter writer, final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean onShouldSaveFragmentState(final Fragment fragment) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public LayoutInflater onGetLayoutInflater() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean onUseFragmentManagerInflaterFactory() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public abstract E onGetHost();
    
    @Deprecated
    public void onInvalidateOptionsMenu() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onStartActivityFromFragment(final Fragment fragment, final Intent intent, final int requestCode, final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onStartIntentSenderFromFragment(final Fragment fragment, final IntentSender intent, final int requestCode, @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onRequestPermissionsFromFragment(@NonNull final Fragment fragment, @NonNull final String[] permissions, final int requestCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean onHasWindowAnimations() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int onGetWindowAnimations() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onAttachFragment(final Fragment fragment) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    @Override
    public <T extends View> T onFindViewById(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onHasView() {
        throw new RuntimeException("Stub!");
    }
}
