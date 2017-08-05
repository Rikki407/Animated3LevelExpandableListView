package com.kirayepay.threelevelexpandablelistview;

import android.content.Context;
import android.widget.ExpandableListView;

/**
 * Created by rikki on 8/4/17.
 */

public class SecondRowListView extends ExpandableListView
{
        public SecondRowListView(Context context) {
            super(context);
        }
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            //999999 is a size in pixels. ExpandableListView requires a maximum height in order to do measurement calculations.
            heightMeasureSpec = MeasureSpec.makeMeasureSpec(999999, MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
}
