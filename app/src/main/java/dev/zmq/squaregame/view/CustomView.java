package dev.zmq.squaregame.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View

{
    private int SQUARE_SIZE;

    public CustomView(Context context)
    {
        super(context);
        init(null);
    }
    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
    {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }
    private void init(@Nullable AttributeSet set)
    {
    }
    protected void onDraw(Canvas canvas)
    {
        Rect rect=new Rect();
        rect.left=40;
        rect.top=40;
        rect.right=rect.left+SQUARE_SIZE;
        rect.bottom=rect.top+SQUARE_SIZE;

        Paint paint=new Paint();
        paint.setColor(Color.GREEN);
        canvas.drawRect(rect,paint);


    }

}
