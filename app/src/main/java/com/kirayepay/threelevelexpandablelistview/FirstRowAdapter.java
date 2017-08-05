package com.kirayepay.threelevelexpandablelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Created by rikki on 8/4/17.
 */

public class FirstRowAdapter extends BaseExpandableListAdapter
{
    private Context context;
    int main_category_index = 0;
    public static final int FIRST_LEVEL_COUNT = 6;


    public FirstRowAdapter(Context context) {
        this.context = context;
    }


    @Override
    public Object getChild(int arg0, int arg1) {
        return arg1;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        SecondRowListView secondLevelELV = new SecondRowListView(context);
        secondLevelELV.setAdapter(new SecondRowAdapter(context));
        secondLevelELV.setGroupIndicator(null);
        return secondLevelELV;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return FIRST_LEVEL_COUNT;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groupPosition;
    }

    @Override
    public int getGroupCount() {
        return FIRST_LEVEL_COUNT;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_first, null);
            TextView text = (TextView) convertView.findViewById(R.id.eventsListEventRowText);
            text.setText("First Level");
            main_category_index++;
        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
