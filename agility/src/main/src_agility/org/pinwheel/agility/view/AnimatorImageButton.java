package org.pinwheel.agility.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageButton;
import org.pinwheel.agility.animation.TouchAnimator;

/**
 * Copyright (C), 2015 <br>
 * <br>
 * All rights reserved <br>
 * <br>
 *
 * @author dnwang
 */
public class AnimatorImageButton extends ImageButton {

    protected TouchAnimator touchAnimator;

    public AnimatorImageButton(Context context) {
        super(context);
        init(context);
    }

    public AnimatorImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public AnimatorImageButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context) {
        touchAnimator = new TouchAnimator(this);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (touchAnimator != null) {
            touchAnimator.onTouchEvent(event);
        }
        return super.dispatchTouchEvent(event);
    }

}
