package com.androstock.newsapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by SHAJIB-PC on 10/23/2017.
 */

// improve the page desgin from here and xml files
class ListNewsAdapter extends ECCardContentListItemAdapter<News> {
    ArrayList<News> data;

    public ListNewsAdapter(Activity a, ArrayList<News> data) {
        super(a, R.layout.list_row, data);
        this.data = data;


    }


    public int getCount() {
        return data.size();
    }


    //create place holders
    public View getView(int position, View convertView, ViewGroup parent) {
        ListNewsViewHolder holder = null;
        if (convertView == null) {
            holder = new ListNewsViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_row, parent, false);
            holder.galleryImage = convertView.findViewById(R.id.galleryImage);
           // holder.author = convertView.findViewById(R.id.author);
            holder.title = convertView.findViewById(R.id.title);
            holder.sdetails = convertView.findViewById(R.id.sdetails);
            holder.time = convertView.findViewById(R.id.time);
            convertView.setTag(holder);
        } else {
            holder = (ListNewsViewHolder) convertView.getTag();
        }
        final News news = getItem(position);
        if (news != null) {

            //holder.author.setText(news.getName());
            holder.title.setText(news.getTitle());
            holder.time.setText(news.getPublishedAt());
            holder.sdetails.setText(news.getDiscription());
            //holder.galleryImage.setImageResource(Integer.parseInt(news.getNEWSpic()));
            if (news.getNEWSpic().toString().length() < 5) {
                holder.galleryImage.setVisibility(View.GONE);
            } else {
                Picasso.with(getContext())
                        .load(news.getNEWSpic())
                        .resize(600, 400)
                        .into(holder.galleryImage);


            }
        }


            return convertView;
        }


        class ListNewsViewHolder {
            ImageView galleryImage;
            TextView author, title, sdetails, time;
        }

    }
