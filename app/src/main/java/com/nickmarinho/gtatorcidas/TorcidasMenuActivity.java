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

public class TorcidasMenuActivity extends ActionBarActivity {
    String[] TorcidasSiglas = {
            "TJF", //1
            "RRN", //2
            "FJV", //3
            "FJB", //4
            "TJB", //5
            "TYF", //6
            "TFF", //7
            "IJV", //8
            "UBZ", //9
            "TTI", //10
            "MV", //11
            "GDF", //12
            "TJ", //13
            "C12", //14
            "DDR", //15
            "P9", //16
            "CMA", //17
            "TOG", //18
            "TPI", //19
            "HSG", //20
            "TOF", //21
            "IAV", //22
            "TFI", //23
            "CMS12", //24
            "PPL", //25
            "GDG", //26
            "MVJ", //27
            "TOGA", //28
            "UT", //29
            "FJG", //30
            "TEV", //31
            "TDA", //32
            "IJG", //33
            "TFB", //34
            "TOR", //35
            "TJFan", //36
            "TJS", //37
            "TOIC", //38
            "FJY", //39
            "TGI", //40
            "TORC", //41
            "TOCA", //42
            "TOB", //43
            "TUI", //44
            "JGT", //45
            "TUF", //46
            "TOC", //47
            "MOFI", //48
            "TMV", //49
            "TGA", //50
            "FJBa", //51
            "TUTB", //52
            "TTA", //53
            "TOMA", //54
            "TOCAR", //55
            "TOMN", //56
            "TJGa", //57
            "TJBpb", //58
            "TFJ", //59
            "TUV" // TUV - 60
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.torcidasmenu_main);

        getSupportActionBar().setTitle("Torcidas");

        final ListView listviewTorcidas = (ListView) findViewById(R.id.listviewTorcidas);
        final ArrayList<String> itemsList = new ArrayList<String>();
        for (int i = 0; i < TorcidasSiglas.length; ++i) {
            itemsList.add(TorcidasSiglas[i]);
        }
        final ArrayAdapter <String> menuAdapter = new ArrayAdapter <String> ( this, android . R . layout . simple_list_item_1, itemsList ) ;
        listviewTorcidas.setAdapter(menuAdapter);

        listviewTorcidas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, final int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
                Intent i = new Intent(TorcidasMenuActivity.this, TorcidasDetalhesActivity.class);
                i.putExtra("TorcidaId", position);
                startActivity(i);
            }
        });

        // Consultar o AdView como um recurso e carregar uma solicitação.
        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }
}
