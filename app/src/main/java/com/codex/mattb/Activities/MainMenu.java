package com.codex.mattb.Activities;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomMenuButton;


public class MainMenu extends AppCompatActivity {

    //TODO Add UI
    Resources.Theme currThem;
    //ListView listView = (ListView) findViewById(R.id.list);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setup();


    }


    //This method is called at the beginning of every time the app is set up to reconfigure necessary references etc
    public void setup(){
        BMB();
        list();
    }


    //These are the methods for complicated items

    public void list(){

    }

    public void BMB(){
        //Begin BMB set up
        final Context context = this.getApplicationContext();
        BoomMenuButton bmb = findViewById(R.id.bmb);
        bmb.setNormalColor(Color.GREEN);




        HamButton.Builder builder = new HamButton.Builder()
                .normalImageRes(R.drawable.add)
                .normalText("Add Item")
                .subNormalText("Add a homework assignment :(")
                .normalColor(Color.BLUE)
                .listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        Toast.makeText(context,"Not Supported yet" ,Toast.LENGTH_LONG).show();
                    }
                });
        bmb.addBuilder(builder);

        HamButton.Builder builder1 = new HamButton.Builder()
                .normalImageRes(R.drawable.search)
                .normalText("Search")
                .subNormalText("Search for an assignment or a class")
                .normalColor(Color.MAGENTA)
                .listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        Toast.makeText(context,"Not Supported yet" ,Toast.LENGTH_LONG).show();
                    }
                });
        bmb.addBuilder(builder1);

        HamButton.Builder builder2 = new HamButton.Builder()
                .normalImageRes(R.drawable.nuke)
                .normalText("KA BOOOMMMMMM")
                .subNormalText("Delete all homework. WOO HOO")
                .normalColor(Color.RED)
                .listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        Toast.makeText(context,"Not Supported yet" ,Toast.LENGTH_LONG).show();
                    }
                });
        bmb.addBuilder(builder2);

        //End BMB Set up
    }

}
