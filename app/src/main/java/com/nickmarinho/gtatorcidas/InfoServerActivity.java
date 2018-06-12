package com.lucianomarinho.gtatorcidas.gt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import com.google.android.gms.ads.*;

public class InfoServerActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infoserver_main);

        getSupportActionBar().setTitle("Info do Server");

        Button btn = (Button) findViewById(R.id.button_ok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InfoServerActivity.this, MainActivity.class));
            }
        });

        String url = "http://www.game-state.eu/iframe.php?ip=198.15.64.2&port=7789&bgcolor=363636&bordercolor=000000&fieldcolor=FFFFFF&valuecolor=EDEDED&oddrowscolor=4D4D4D&showgraph=true&showplayers=true&graphvalues=EDEDED&graphaxis=FFFFFF&width=190&graph_height=70&plist_height=80&font_size=9";
        WebView webview;
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(url);

        // Consultar o AdView como um recurso e carregar uma solicitação.
        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }
}
