package app.orangekraft.warzguia.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import app.orangekraft.warzguia.R;
import app.orangekraft.warzguia.descripcion.cat1.desc1;
import app.orangekraft.warzguia.descripcion.cat1.desc10;
import app.orangekraft.warzguia.descripcion.cat1.desc11;
import app.orangekraft.warzguia.descripcion.cat1.desc12;
import app.orangekraft.warzguia.descripcion.cat1.desc13;
import app.orangekraft.warzguia.descripcion.cat1.desc2;
import app.orangekraft.warzguia.descripcion.cat1.desc3;
import app.orangekraft.warzguia.descripcion.cat1.desc4;
import app.orangekraft.warzguia.descripcion.cat1.desc5;
import app.orangekraft.warzguia.descripcion.cat1.desc6;
import app.orangekraft.warzguia.descripcion.cat1.desc7;
import app.orangekraft.warzguia.descripcion.cat1.desc8;
import app.orangekraft.warzguia.descripcion.cat1.desc9;

public class FusilAsalto extends AppCompatActivity {
    ImageView IvRegresar;
    CardView card0,card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fusil_asalto);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        IvRegresar = (ImageView) findViewById(R.id.botonatras);
        IvRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        card0 = (CardView) findViewById(R.id.Cardc1l0);
        card0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this,desc1.class);
                startActivity(i);
            }
        });

        card1 = (CardView) findViewById(R.id.Cardc1l1);
        card1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc2.class);
                startActivity(i);
            }
        });

        card2 = (CardView) findViewById(R.id.Cardc1l2);
        card2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc3.class);
                startActivity(i);
            }
        });

        card3 = (CardView) findViewById(R.id.Cardc1l3);
        card3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc4.class);
                startActivity(i);
            }
        });

        card4 = (CardView) findViewById(R.id.Cardc1l4);
        card4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc5.class);
                startActivity(i);
            }
        });

        card5 = (CardView) findViewById(R.id.Cardc1l5);
        card5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc6.class);
                startActivity(i);
            }
        });

        card6 = (CardView) findViewById(R.id.Cardc1l6);
        card6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc7.class);
                startActivity(i);
            }
        });

        card7 = (CardView) findViewById(R.id.Cardc1l7);
        card7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc8.class);
                startActivity(i);
            }
        });

        card8 = (CardView) findViewById(R.id.Cardc1l8);
        card8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc9.class);
                startActivity(i);
            }
        });

        card9 = (CardView) findViewById(R.id.Cardc1l9);
        card9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc10.class);
                startActivity(i);
            }
        });

        card10 = (CardView) findViewById(R.id.Cardc1l10);
        card10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc11.class);
                startActivity(i);
            }
        });

        card11 = (CardView) findViewById(R.id.Cardc1l11);
        card11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc12.class);
                startActivity(i);
            }
        });

        card12 = (CardView) findViewById(R.id.Cardc1l12);
        card12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilAsalto.this, desc13.class);
                startActivity(i);
            }
        });




    }
}