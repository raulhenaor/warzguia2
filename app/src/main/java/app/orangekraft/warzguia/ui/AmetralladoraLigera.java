package app.orangekraft.warzguia.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import app.orangekraft.warzguia.R;
import app.orangekraft.warzguia.descripcion.cat1.desc1;
import app.orangekraft.warzguia.descripcion.cat1.desc2;
import app.orangekraft.warzguia.descripcion.cat1.desc3;
import app.orangekraft.warzguia.descripcion.cat1.desc4;
import app.orangekraft.warzguia.descripcion.cat1.desc5;
import app.orangekraft.warzguia.descripcion.cat1.desc6;
import app.orangekraft.warzguia.descripcion.cat1.desc7;
import app.orangekraft.warzguia.descripcion.cat4.descc4l0;
import app.orangekraft.warzguia.descripcion.cat4.descc4l1;
import app.orangekraft.warzguia.descripcion.cat4.descc4l2;
import app.orangekraft.warzguia.descripcion.cat4.descc4l3;
import app.orangekraft.warzguia.descripcion.cat4.descc4l4;
import app.orangekraft.warzguia.descripcion.cat4.descc4l5;
import app.orangekraft.warzguia.descripcion.cat4.descc4l6;

public class AmetralladoraLigera extends AppCompatActivity {
    ImageView IvRegresar;
    CardView card0,card1,card2,card3,card4,card5,card6;
    private static final String TAG = "MainActivity";
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ametralladora_ligera);

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

        card0 = (CardView) findViewById(R.id.Cardc4l0);
        card0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(AmetralladoraLigera.this, descc4l0.class);
                startActivity(i);
            }
        });

        card1 = (CardView) findViewById(R.id.Cardc4l1);
        card1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(AmetralladoraLigera.this, descc4l1.class);
                startActivity(i);
            }
        });

        card2 = (CardView) findViewById(R.id.Cardc4l2);
        card2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(AmetralladoraLigera.this, descc4l2.class);
                startActivity(i);
            }
        });

        card3 = (CardView) findViewById(R.id.Cardc4l3);
        card3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(AmetralladoraLigera.this, descc4l3.class);
                startActivity(i);
            }
        });

        card4 = (CardView) findViewById(R.id.Cardc4l4);
        card4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(AmetralladoraLigera.this, descc4l4.class);
                startActivity(i);
            }
        });

        card5 = (CardView) findViewById(R.id.Cardc4l5);
        card5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(AmetralladoraLigera.this, descc4l5.class);
                startActivity(i);
            }
        });

        card6 = (CardView) findViewById(R.id.Cardc4l6);
        card6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(AmetralladoraLigera.this, descc4l6.class);
                startActivity(i);
            }
        });

    }
}