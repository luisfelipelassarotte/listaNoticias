package com.list;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class NewsDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String content = intent.getStringExtra("content");
        int imageResourceId = intent.getIntExtra("image", -1);

        TextView titleTextView = findViewById(R.id.detailNewsTitle);
        TextView contentTextView = findViewById(R.id.detailNewsContent);
        ImageView imageView = findViewById(R.id.detailNewsImage);
        Button backButton = findViewById(R.id.backButton);

        titleTextView.setText(title);
        contentTextView.setText(content);
        imageView.setImageResource(imageResourceId);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(NewsDetailActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
