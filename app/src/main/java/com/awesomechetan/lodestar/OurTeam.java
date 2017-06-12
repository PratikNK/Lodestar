package com.awesomechetan.lodestar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class OurTeam extends AppCompatActivity {

    List<DataItem> listdata1,listdata2;
    ListView lv1,lv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_team);

        listdata1=new ArrayList<>();
        listdata2=new ArrayList<>();

        listdata1.add(new DataItem(R.drawable.anand,"Anand Sudarshan","Chairman"));
        listdata1.add(new DataItem(R.drawable.murlidhar,"Murlidhar S","Founder and CEO"));
        listdata1.add(new DataItem(R.drawable.subodh,"Subodh Jindal","Co-Founder and COO"));
        listdata1.add(new DataItem(R.drawable.rajeev,"Rajeev Menon","Product Head"));
        listdata1.add(new DataItem(R.drawable.tarun,"Tarun Krishnamurthy","Chief Technology Officer (CTO)"));

        listdata2.add(new DataItem(R.drawable.natarajan,"Dr V Natarajan",""));
        listdata2.add(new DataItem(R.drawable.vikram,"Vikram D Rao",""));
        listdata2.add(new DataItem(R.drawable.madan,"Madan Padaki",""));
        listdata2.add(new DataItem(R.drawable.ponappa,"P G Ponappa",""));

        lv1=(ListView)findViewById(R.id.listview1);
        lv2=(ListView)findViewById(R.id.listview2);

        DataCustomAdapter adapter1=new DataCustomAdapter(this,R.layout.student_list_card,listdata1);
        DataCustomAdapter adapter2=new DataCustomAdapter(this,R.layout.student_list_card,listdata2);

        lv1.setAdapter(adapter1);
        lv2.setAdapter(adapter2);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent=new Intent();
                intent.putExtra("Dp",listdata1.get(position).img);
                intent.putExtra("Name",listdata1.get(position).Name);
                intent.putExtra("Designation",listdata1.get(position).Designation);

                intent.setClass(OurTeam.this,DataDescription.class);
                startActivity(intent);
            }
        });

        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent=new Intent();
                intent.putExtra("Dp1",listdata1.get(position).img);
                intent.putExtra("Name1",listdata1.get(position).Name);
                intent.putExtra("Designation",listdata1.get(position).Designation);

                intent.setClass(OurTeam.this,DataDescription.class);
                startActivity(intent);
            }
        });


    }
}
