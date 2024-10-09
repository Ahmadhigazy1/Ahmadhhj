package com.example.chesswithrecview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class games extends AppCompatActivity {
    int images[];
    ImageView imageView2;
    TextView textView;
    String Details[];

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        initImgArray();
        imageView2=findViewById(R.id.imageView2);
        textView=findViewById(R.id.textView);
        Intent modern = getIntent();
        int f = modern.getIntExtra("key",0);
        for (int i=0;i<images.length;i++){
            if (i==f){
                imageView2.setImageResource(images[i]);
                textView.setText(Details[i]);
            }
        }
    }
    private void initImgArray() {
        images=new int[6];
        images[0]=R.drawable.img;
        images[1]=R.drawable.img_1;
        images[2]=R.drawable.img_2;
        images[3]=R.drawable.img_3;
        images[4]=R.drawable.img_4;
        images[5]=R.drawable.img_5;
         Details =getResources().getStringArray(R.array.details);
    }
}