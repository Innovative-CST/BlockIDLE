package androidx.appcompat.view;

import java.util.Iterator;
import android.view.View;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorListener;
import android.view.animation.Interpolator;
import androidx.core.view.ViewPropertyAnimatorCompat;
import java.util.ArrayList;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ViewPropertyAnimatorCompatSet
{
    final ArrayList<ViewPropertyAnimatorCompat> mAnimators;
    private long mDuration;
    private Interpolator mInterpolator;
    ViewPropertyAnimatorListener mListener;
    private boolean mIsStarted;
    private final ViewPropertyAnimatorListenerAdapter mProxyListener;
    
    public ViewPropertyAnimatorCompatSet() {
        this.mDuration = -1L;
        this.mProxyListener = new ViewPropertyAnimatorListenerAdapter() {
            private boolean mProxyStarted = false;
            private int mProxyEndCount = 0;
            
            public void onAnimationStart(final View view) {
                if (this.mProxyStarted) {
                    return;
                }
                this.mProxyStarted = true;
                if (ViewPropertyAnimatorCompatSet.this.mListener != null) {
                    ViewPropertyAnimatorCompatSet.this.mListener.onAnimationStart((View)null);
                }
            }
            
            void onEnd() {
                this.mProxyEndCount = 0;
                this.mProxyStarted = false;
                ViewPropertyAnimatorCompatSet.this.onAnimationsEnded();
            }
            
            public void onAnimationEnd(final View view) {
                if (++this.mProxyEndCount == ViewPropertyAnimatorCompatSet.this.mAnimators.size()) {
                    if (ViewPropertyAnimatorCompatSet.this.mListener != null) {
                        ViewPropertyAnimatorCompatSet.this.mListener.onAnimationEnd((View)null);
                    }
                    this.onEnd();
                }
            }
        };
        this.mAnimators = (ArrayList<ViewPropertyAnimatorCompat>)new ArrayList();
    }
    
    public ViewPropertyAnimatorCompatSet play(final ViewPropertyAnimatorCompat animator) {
        if (!this.mIsStarted) {
            this.mAnimators.add((Object)animator);
        }
        return this;
    }
    
    public ViewPropertyAnimatorCompatSet playSequentially(final ViewPropertyAnimatorCompat anim1, final ViewPropertyAnimatorCompat anim2) {
        this.mAnimators.add((Object)anim1);
        anim2.setStartDelay(anim1.getDuration());
        this.mAnimators.add((Object)anim2);
        return this;
    }
    
    public void start() {
        if (this.mIsStarted) {
            return;
        }
        for (final ViewPropertyAnimatorCompat animator : this.mAnimators) {
            if (this.mDuration >= 0L) {
                animator.setDuration(this.mDuration);
            }
            if (this.mInterpolator != null) {
                animator.setInterpolator(this.mInterpolator);
            }
            if (this.mListener != null) {
                animator.setListener((ViewPropertyAnimatorListener)this.mProxyListener);
            }
            animator.start();
        }
        this.mIsStarted = true;
    }
    
    void onAnimationsEnded() {
        this.mIsStarted = false;
    }
    
    public void cancel() {
        if (!this.mIsStarted) {
            return;
        }
        for (final ViewPropertyAnimatorCompat animator : this.mAnimators) {
            animator.cancel();
        }
        this.mIsStarted = false;
    }
    
    public ViewPropertyAnimatorCompatSet setDuration(final long duration) {
        if (!this.mIsStarted) {
            this.mDuration = duration;
        }
        return this;
    }
    
    public ViewPropertyAnimatorCompatSet setInterpolator(final Interpolator interpolator) {
        if (!this.mIsStarted) {
            this.mInterpolator = interpolator;
        }
        return this;
    }
    
    public ViewPropertyAnimatorCompatSet setListener(final ViewPropertyAnimatorListener listener) {
        if (!this.mIsStarted) {
            this.mListener = listener;
        }
        return this;
    }
}
