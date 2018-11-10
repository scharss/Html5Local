package com.example.user.html5local;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

       WebView webHtmlCss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webHtmlCss = (WebView) findViewById(R.id.webView);

        WebSettings ws = webHtmlCss.getSettings();
        ws.setJavaScriptEnabled(true);

        webHtmlCss.loadUrl("file:///android_asset/index.html");

    }

    //***************************************************************************************
    // Menu desplegable
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.inicio){

            Intent intenthomeee = new Intent(MainActivity.this, MainActivity.class );
            startActivity(intenthomeee);
            return true;
        }


        if(id == R.id.quienes){

            Intent intenthomeee = new Intent(MainActivity.this, Main2Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.productos){

            Intent intenthomeee = new Intent(MainActivity.this, Main3Activity.class );
            startActivity(intenthomeee);
            return true;
        }

        if(id == R.id.contacto){

            Intent intenthomeee = new Intent(MainActivity.this, Main4Activity.class );
            startActivity(intenthomeee);
            return true;
        }



        return true;

    }
//***************************************************************************************


}
