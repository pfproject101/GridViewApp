package com.personal.gridviewapp;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        int[] iconIDs = {R.drawable.camera, R.drawable.camera_roll, R.drawable.featured, R.drawable.my_videos, R.drawable.likes, R.drawable.watch_later, R.drawable.stats, R.drawable.subscriptions, R.drawable.help};
        String[] data = {"Camera", "Camera Roll", "Featured", "My Videos", "Likes", "Watch Later", "Stats", "Subscriptions", "Help"};
        GridView gridView = findViewById(R.id.grid_view);

        MyAdapter adapter = new MyAdapter(this, data, iconIDs);
        gridView.setAdapter(adapter);
    }
}