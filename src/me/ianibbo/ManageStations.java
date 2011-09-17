package me.ianibbo;

import android.app.Activity;
import android.os.Bundle;
import android.app.TabActivity;
import android.widget.TabHost;
import android.widget.Button;
import android.view.View;

public class ManageStations extends TabActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button play=(Button)findViewById(R.id.play);
        play.setOnClickListener(play_listener);


        TabHost.TabSpec spec=getTabHost().newTabSpec("about");
        spec.setContent(R.id.about);
        spec.setIndicator("About");
        getTabHost().addTab(spec);

        spec=getTabHost().newTabSpec("stations");
        spec.setContent(R.id.stations);
        spec.setIndicator("Stations");
        getTabHost().addTab(spec);

        spec=getTabHost().newTabSpec("news");
        spec.setContent(R.id.news);
        spec.setIndicator("News");
        getTabHost().addTab(spec);

        spec=getTabHost().newTabSpec("player");
        spec.setContent(R.id.player);
        spec.setIndicator("Player");
        getTabHost().addTab(spec);

        getTabHost().setCurrentTab(0);

    }

    private View.OnClickListener play_listener=new View.OnClickListener() {
      public void onClick(View v) {
        // EditText name=(EditText)findViewById(R.id.name);
        // EditText address=(EditText)findViewById(R.id.addr);
        // r.setName(name.getText().toString());
        // r.setAddress(address.getText().toString());
      }
    };

}
