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
import app.orangekraft.warzguia.descripcion.cat5.descc5l0;
import app.orangekraft.warzguia.descripcion.cat5.descc5l1;
import app.orangekraft.warzguia.descripcion.cat5.descc5l2;
import app.orangekraft.warzguia.descripcion.cat5.descc5l3;
import app.orangekraft.warzguia.descripcion.cat5.descc5l4;
import app.orangekraft.warzguia.descripcion.cat5.descc5l5;
import app.orangekraft.warzguia.descripcion.cat6.descc6l0;
import app.orangekraft.warzguia.descripcion.cat6.descc6l1;
import app.orangekraft.warzguia.descripcion.cat6.descc6l2;
import app.orangekraft.warzguia.descripcion.cat6.descc6l3;

public class FusilPrecision extends AppCompatActivity {
    ImageView IvRegresar;
    CardView card0,card1,card2,card3;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fusil_precision);

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

        card0 = (CardView) findViewById(R.id.Cardc6l0);
        card0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilPrecision.this, descc6l0.class);
                startActivity(i);
            }
        });

        card1 = (CardView) findViewById(R.id.Cardc6l1);
        card1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilPrecision.this, descc6l1.class);
                startActivity(i);
            }
        });

        card2 = (CardView) findViewById(R.id.Cardc6l2);
        card2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilPrecision.this, descc6l2.class);
                startActivity(i);
            }
        });

        card3 = (CardView) findViewById(R.id.Cardc6l3);
        card3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(FusilPrecision.this, descc6l3.class);
                startActivity(i);
            }
        });



    }
}