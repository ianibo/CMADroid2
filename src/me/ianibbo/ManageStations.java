package me.ianibbo;

import android.app.Activity;
import android.os.Bundle;
import android.app.TabActivity;
import android.widget.TabHost;

public class ManageStations extends TabActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

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

        getTabHost().setCurrentTab(0);

    }
}
