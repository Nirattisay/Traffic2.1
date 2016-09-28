package com.nirattisai.traffic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         //Create Listview
        createListView();


    } //main Metod
    private void createListView(){
        MyData objMyData = new MyData();
        int[] intIcon = objMyData.icon();
        String[] strTitle = objMyData.title();

        MyAdaptor objMyAdapter = new MyAdaptor(MainActivity.this, intIcon,strTitle);
        ListView myListView = (ListView) findViewById(R.id.listView);
        myListView.setAdapter(objMyAdapter);

    } //createListView
public void  ClickAboutMe (View view) {
    Intent objIntent = new Intent (Intent.ACTION_VIEW);
    objIntent.setData(Uri.parse("http://csclub.ssru.ac.th/s56122201126/csc3215"));
    startActivity(objIntent);

    }
}
