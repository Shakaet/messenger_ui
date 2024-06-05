package com.example.messenger_ui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> Names = new ArrayList<>();
    private ArrayList<String> Image1 = new ArrayList<>();

    private ArrayList<String> image2 = new ArrayList<>();
    private ArrayList<String> text1 = new ArrayList<>();
    private ArrayList<String> text2 = new ArrayList<>();
    private ArrayList<String> text3 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();

    }

    private void initRecyclerView(){

        RecyclerView recyclerView=findViewById(R.id.rec1);
        RecyclerView recyclerView1=findViewById(R.id.rec2);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));

        Adapter_class adapterClass=new Adapter_class(Names,Image1,this);
        Adapter_class2 adapterClass2=new Adapter_class2(image2,text1,text2,text3,this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapterClass);

        recyclerView1.setAdapter(adapterClass2);


        //recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));



// for recyclerview1
        Image1.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        Names.add("Trondheim");

        Image1.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        Names.add("Portugal");

        Image1.add("https://i.redd.it/j6myfqglup501.jpg");
        Names.add("Rocky");


        Image1.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        Names.add("Mahahual");

        Image1.add("https://i.redd.it/k98uzl68eh501.jpg");
        Names.add("Frozen");


        Image1.add("https://i.redd.it/glin0nwndo501.jpg");
        Names.add("White");

        Image1.add("https://i.redd.it/obx4zydshg601.jpg");
        Names.add("Austrailia");

        Image1.add("https://i.imgur.com/ZcLLrkY.jpg");
        Names.add("Washington");


// for recyclerview2


        image2.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        text1.add("Trondheim");
        text2.add("Hello,how are u?");
        text3.add("9:00 pm");

        image2.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        text1.add("Portugal");
        text2.add("Good night,bye");
        text3.add("8:45 pm");

        image2.add("https://i.redd.it/j6myfqglup501.jpg");
        text1.add("Rocky");
        text2.add("What do you do?");
        text3.add("8:30 pm");


        image2.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        text1.add("Mahahual");
        text2.add("Can we meet?");
        text3.add("8:24 pm");

        image2.add("https://i.redd.it/k98uzl68eh501.jpg");
        text1.add("Frozen");
        text2.add("Are you well?");
        text3.add("8:20 pm");


        image2.add("https://i.redd.it/glin0nwndo501.jpg");
        text1.add("White");
        text2.add("I wanna see you");
        text3.add("8:10 pm");

        image2.add("https://i.redd.it/obx4zydshg601.jpg");
        text1.add("Austrailia");
        text2.add("Hi,i miss you");
        text3.add("8:00 pm");

        image2.add("https://i.imgur.com/ZcLLrkY.jpg");
        text1.add("Washington");
        text2.add("Allah hafez,bye");
        text3.add("7:53 pm");







    }
}