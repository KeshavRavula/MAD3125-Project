package com.foodexpo.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantAdapter extends BaseAdapter {
    private ArrayList<Restaurant> restList;
    LayoutInflater layoutInflater;

    public RestaurantAdapter(Context context,ArrayList<Restaurant> restList) {
        this.restList = restList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return restList.size();
    }

    @Override
    public Object getItem(int i) {
        return restList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = new ViewHolder();
        if(view==null) {
            view = layoutInflater.inflate(R.layout.row, null);
            holder.img = view.findViewById(R.id.restImg);
            holder.restName = view.findViewById(R.id.restName);
            holder.restLocation = view.findViewById(R.id.restLocation);
            view.setTag(holder);
        }
        else
            view.getTag();

            int id = view.getResources().getIdentifier(restList.get(i).getRestImage(), "drawable", view.getContext().getPackageName());
            holder.img.setImageResource(id);
            holder.restName.setText(restList.get(i).getRestName());
            holder.restLocation.setText(String.valueOf(restList.get(i).getRestLocation()));

        return view;
    }

    static class ViewHolder{
        ImageView img;
        TextView restName,restLocation;
    }
}
