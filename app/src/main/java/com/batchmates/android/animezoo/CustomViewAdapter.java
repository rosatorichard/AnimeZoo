package com.batchmates.android.animezoo;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Android on 6/27/2017.
 */

public class CustomViewAdapter extends ArrayAdapter<FirstList>{

    Context context;
    public CustomViewAdapter(@NonNull Context context, @LayoutRes int resource, List<FirstList> firstList) {
        super(context, resource,firstList);
        this.context=context;
    }


//    public CustomListViewAdapter(Context context, int resourceId,
//                                 List<RowItem> items) {
//        super(context, resourceId, items);
//        this.context = context;
//    }

    /*private view holder class*/
    private class ViewHolder {
        TextView name;
        ImageView image;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        FirstList rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_view_buttons, null);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.lvAnime);
            holder.image = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.name.setText(rowItem.getName());
        holder.image.setBackgroundResource(rowItem.getImage());

        return convertView;
    }
}
