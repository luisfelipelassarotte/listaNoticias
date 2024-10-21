package com.list;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        NewsRepository newsRepository = new NewsRepository();
        List<News> newsList = newsRepository.getNewsList();

        NewsAdapter adapter = new NewsAdapter(this, newsList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                News news = newsList.get(position);

                Intent intent = new Intent(MainActivity.this, NewsDetailActivity.class);
                intent.putExtra("title", news.getTitle());
                intent.putExtra("content", news.getContent());
                intent.putExtra("image", news.getImageResourceId());

                startActivity(intent);
            }
        });
    }
}
