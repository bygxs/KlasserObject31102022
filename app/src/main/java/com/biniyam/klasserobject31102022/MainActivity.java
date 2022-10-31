package com.biniyam.klasserobject31102022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<employeee> arrayList;
    ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = this.<ListView>findViewById(R.id.listview);
        arrayList =new ArrayList<>();
        employeee employeee1 =new employeee("bill","1", 100);
        employeee employeee2 =new employeee("bosse","9", 700);
        employeee employeee3 =new employeee("dany","22", 900);



        manager manager1 = new manager("Beata","4", 200, "IT");

        arrayList.add(employeee1);
        arrayList.add(employeee2);
        arrayList.add(employeee3);


        employeee1.id = "76";



        ArrayAdapter<employeee> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);

        listview.setAdapter(adapter);


    }

}

// int x = 5;

// employeee employeee1 = new employeee("bill", "1",100);