package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import android.view.Window;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.view.View;
import androidx.appcompat.R;
import android.os.IBinder;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;

class MenuDialogHelper implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, MenuPresenter.Callback
{
    private MenuBuilder mMenu;
    private AlertDialog mDialog;
    ListMenuPresenter mPresenter;
    private MenuPresenter.Callback mPresenterCallback;
    
    public MenuDialogHelper(final MenuBuilder menu) {
        this.mMenu = menu;
    }
    
    public void show(final IBinder windowToken) {
        final MenuBuilder menu = this.mMenu;
        final AlertDialog.Builder builder = new AlertDialog.Builder(menu.getContext());
        (this.mPresenter = new ListMenuPresenter(builder.getContext(), R.layout.abc_list_menu_item_layout)).setCallback(this);
        this.mMenu.addMenuPresenter(this.mPresenter);
        builder.setAdapter(this.mPresenter.getAdapter(), (DialogInterface.OnClickListener)this);
        final View headerView = menu.getHeaderView();
        if (headerView != null) {
            builder.setCustomTitle(headerView);
        }
        else {
            builder.setIcon(menu.getHeaderIcon()).setTitle(menu.getHeaderTitle());
        }
        builder.setOnKeyListener((DialogInterface.OnKeyListener)this);
        (this.mDialog = builder.create()).setOnDismissListener((DialogInterface.OnDismissListener)this);
        final WindowManager.LayoutParams lp = this.mDialog.getWindow().getAttributes();
        lp.type = 1003;
        if (windowToken != null) {
            lp.token = windowToken;
        }
        final WindowManager.LayoutParams layoutParams = lp;
        layoutParams.flags |= 0x20000;
        this.mDialog.show();
    }
    
    public boolean onKey(final DialogInterface dialog, final int keyCode, final KeyEvent event) {
        if (keyCode == 82 || keyCode == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                final Window win = this.mDialog.getWindow();
                if (win != null) {
                    final View decor = win.getDecorView();
                    if (decor != null) {
                        final KeyEvent.DispatcherState ds = decor.getKeyDispatcherState();
                        if (ds != null) {
                            ds.startTracking(event, (Object)this);
                            return true;
                        }
                    }
                }
            }
            else if (event.getAction() == 1 && !event.isCanceled()) {
                final Window win = this.mDialog.getWindow();
                if (win != null) {
                    final View decor = win.getDecorView();
                    if (decor != null) {
                        final KeyEvent.DispatcherState ds = decor.getKeyDispatcherState();
                        if (ds != null && ds.isTracking(event)) {
                            this.mMenu.close(true);
                            dialog.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.mMenu.performShortcut(keyCode, event, 0);
    }
    
    public void setPresenterCallback(final MenuPresenter.Callback cb) {
        this.mPresenterCallback = cb;
    }
    
    public void dismiss() {
        if (this.mDialog != null) {
            this.mDialog.dismiss();
        }
    }
    
    public void onDismiss(final DialogInterface dialog) {
        this.mPresenter.onCloseMenu(this.mMenu, true);
    }
    
    public void onCloseMenu(@NonNull final MenuBuilder menu, final boolean allMenusAreClosing) {
        if (allMenusAreClosing || menu == this.mMenu) {
            this.dismiss();
        }
        if (this.mPresenterCallback != null) {
            this.mPresenterCallback.onCloseMenu(menu, allMenusAreClosing);
        }
    }
    
    public boolean onOpenSubMenu(@NonNull final MenuBuilder subMenu) {
        return this.mPresenterCallback != null && this.mPresenterCallback.onOpenSubMenu(subMenu);
    }
    
    public void onClick(final DialogInterface dialog, final int which) {
        this.mMenu.performItemAction((MenuItem)this.mPresenter.getAdapter().getItem(which), 0);
    }
}
