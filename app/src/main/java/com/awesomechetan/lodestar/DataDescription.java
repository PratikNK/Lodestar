package com.awesomechetan.lodestar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DataDescription extends AppCompatActivity {

    ImageView iv;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_description);

        iv=(ImageView)findViewById(R.id.dataimg);
        tv=(TextView)findViewById(R.id.description);

        tv.setText(getIntent().getStringExtra("Name"));
        iv.setImageResource(getIntent().getIntExtra("Dp",R.drawable.anand));




    }
}
