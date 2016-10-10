package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by akshat on 08/10/16.
 */

public class SquareImage extends ImageView {

    public SquareImage(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();

        //two by three height image view
        int measuredHeight = (int) (measuredWidth * (2f / 3f));
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public SquareImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SquareImage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
