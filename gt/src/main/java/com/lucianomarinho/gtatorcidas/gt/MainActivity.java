package com.lucianomarinho.gtatorcidas.gt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import com.google.android.gms.ads.*;

public class MainActivity extends ActionBarActivity {
    String[] menu = {
            "Info do Server",
            "Rádio GT",
            "Torcidas",
            "Sobre"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);

        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        getSupportActionBar().setTitle("GTA Torcidas");

        final ListView listviewMenu = (ListView) findViewById(R.id.listviewMenu);
        ArrayList<String> itemsList = new ArrayList<String>();
        for (int i = 0; i < menu.length; ++i) {
            itemsList.add(menu[i]);
        }
        final ArrayAdapter <String> menuAdapter = new ArrayAdapter <String> ( this, android . R . layout . simple_list_item_1, itemsList ) ;
        listviewMenu.setAdapter(menuAdapter);

        listviewMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, final int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, InfoServerActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, RadioGtActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, TorcidasMenuActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, AboutActivity.class));
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
