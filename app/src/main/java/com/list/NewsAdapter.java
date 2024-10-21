package com.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    List<News> newsList;

    public NewsAdapter(@NonNull Context context, List<News> newsList) {
        super(context, 0, newsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        News currentNews = getItem(position);
        TextView titleTextView = convertView.findViewById(R.id.newsTitle);
        TextView subtitleTextView = convertView.findViewById(R.id.newsSubtitle);
        ImageView imageView = convertView.findViewById(R.id.newsImage);

        titleTextView.setText(currentNews.getTitle());
        subtitleTextView.setText(currentNews.getSubtitle());
        imageView.setImageResource(currentNews.getImageResourceId());

        return convertView;
    }
}

