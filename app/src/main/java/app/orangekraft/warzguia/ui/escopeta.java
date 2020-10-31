package app.orangekraft.warzguia.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import app.orangekraft.warzguia.R;

import app.orangekraft.warzguia.R;
import app.orangekraft.warzguia.descripcion.cat2.descc2l0;
import app.orangekraft.warzguia.descripcion.cat2.descc2l1;
import app.orangekraft.warzguia.descripcion.cat2.descc2l2;
import app.orangekraft.warzguia.descripcion.cat2.descc2l3;
import app.orangekraft.warzguia.descripcion.cat2.descc2l4;
import app.orangekraft.warzguia.descripcion.cat2.descc2l5;
import app.orangekraft.warzguia.descripcion.cat3.descc3l0;
import app.orangekraft.warzguia.descripcion.cat3.descc3l1;
import app.orangekraft.warzguia.descripcion.cat3.descc3l2;
import app.orangekraft.warzguia.descripcion.cat3.descc3l3;
import app.orangekraft.warzguia.descripcion.cat3.descc3l4;
import app.orangekraft.warzguia.descripcion.cat3.descc3l5;

public class escopeta extends AppCompatActivity {
    ImageView IvRegresar;
    CardView card0, card1,card2, card3, card4, card5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escopeta);

        IvRegresar = (ImageView) findViewById(R.id.botonatras);
        IvRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        card0 = (CardView) findViewById(R.id.Cardc3l0);
        card0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(escopeta.this, descc3l0.class);
                startActivity(i);
            }
        });

        card1 = (CardView) findViewById(R.id.Cardc3l1);
        card1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(escopeta.this, descc3l1.class);
                startActivity(i);
            }
        });

        card2 = (CardView) findViewById(R.id.Cardc3l2);
        card2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(escopeta.this, descc3l2.class);
                startActivity(i);
            }
        });

        card3 = (CardView) findViewById(R.id.Cardc3l3);
        card3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(escopeta.this, descc3l3.class);
                startActivity(i);
            }
        });

        card4 = (CardView) findViewById(R.id.Cardc3l4);
        card4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(escopeta.this, descc3l4.class);
                startActivity(i);
            }
        });

        card5 = (CardView) findViewById(R.id.Cardc3l5);
        card5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(escopeta.this, descc3l5.class);
                startActivity(i);
            }
        });


    }
}