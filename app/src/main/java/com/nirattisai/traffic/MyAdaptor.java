package com.nirattisai.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pc on 21/9/2559.
 */
public class MyAdaptor extends BaseAdapter {
    //explicit
    private Context objContext;
    private int[] trafficInts;
    private String[] trafficStrings; //mianActivity

    public MyAdaptor(Context objContext, int[] trafficInts, String[] trafficStrings) {
        this.objContext = objContext;
        this.trafficInts = trafficInts;
        this.trafficStrings = trafficStrings;
    }

    @Override
    public int getCount() {
        return trafficStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.mylifeview, viewGroup, false);
        //show icon

        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imvShowicon);
        iconImageView.setBackgroundResource(trafficInts[i]);
        //show Title

        TextView titleTextView = (TextView) view1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(trafficStrings[i]);

        return view1;
        // getView
    }
} //mian class
