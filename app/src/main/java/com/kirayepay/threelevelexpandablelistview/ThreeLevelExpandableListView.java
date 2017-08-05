package com.kirayepay.threelevelexpandablelistview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

public class ThreeLevelExpandableListView extends AppCompatActivity
{

    private Context mContext;
    private ExpandableListView expandableListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=this;
        setContentView(R.layout.three_level_expandable_list_ciew);
        expandableListView = (ExpandableListView) findViewById(R.id.mainList);
        expandableListView.setAdapter(new FirstRowAdapter(this));
    }

}

