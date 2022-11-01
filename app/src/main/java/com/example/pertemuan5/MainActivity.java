package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class MainActivity extends AppCompatActivity {
    RecyclerView recylerView;
    String s1[], s2[],s3[];
    int images[] =
            {R.drawable.laptop1,R.drawable.laptop2,R.drawable.laptop3,R.drawable.laptop4,R.drawable.laptop5,R.drawable.laptop6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.laptop);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.star);
        LaptopAdapter appAdapter = new
                LaptopAdapter(this,s1,s2,s3,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new
                LinearLayoutManager(this));
//        LinearLayoutManager horizontalLayoutManagaer = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
//        recylerView.setLayoutManager(horizontalLayoutManagaer);
    }
}
