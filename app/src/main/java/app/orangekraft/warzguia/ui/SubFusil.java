package app.orangekraft.warzguia.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import app.orangekraft.warzguia.R;
import app.orangekraft.warzguia.descripcion.cat1.desc13;
import app.orangekraft.warzguia.descripcion.cat2.descc2l0;
import app.orangekraft.warzguia.descripcion.cat2.descc2l1;
import app.orangekraft.warzguia.descripcion.cat2.descc2l2;
import app.orangekraft.warzguia.descripcion.cat2.descc2l3;
import app.orangekraft.warzguia.descripcion.cat2.descc2l4;
import app.orangekraft.warzguia.descripcion.cat2.descc2l5;
import app.orangekraft.warzguia.descripcion.cat2.descc2l6;
import app.orangekraft.warzguia.descripcion.cat2.descc2l7;
import app.orangekraft.warzguia.descripcion.cat2.descc2l8;

public class SubFusil extends AppCompatActivity {
    ImageView IvRegresar;
    CardView card0, card1,card2, card3, card4, card5, card6, card7, card8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subfusil);

        IvRegresar = (ImageView) findViewById(R.id.botonatras);
        IvRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        card0 = (CardView) findViewById(R.id.Cardc2l0);
        card0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(SubFusil.this, descc2l0.class);
                startActivity(i);
            }
        });

        card1 = (CardView) findViewById(R.id.Cardc2l1);
        card1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(SubFusil.this, descc2l1.class);
                startActivity(i);
            }
        });

        card2 = (CardView) findViewById(R.id.Cardc2l2);
        card2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(SubFusil.this, descc2l2.class);
                startActivity(i);
            }
        });

        card3 = (CardView) findViewById(R.id.Cardc2l3);
        card3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(SubFusil.this, descc2l3.class);
                startActivity(i);
            }
        });

        card4 = (CardView) findViewById(R.id.Cardc2l4);
        card4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(SubFusil.this, descc2l4.class);
                startActivity(i);
            }
        });

        card5 = (CardView) findViewById(R.id.Cardc2l5);
        card5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(SubFusil.this, descc2l5.class);
                startActivity(i);
            }
        });

        card6 = (CardView) findViewById(R.id.Cardc2l6);
        card6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(SubFusil.this, descc2l6.class);
                startActivity(i);
            }
        });

        card7 = (CardView) findViewById(R.id.Cardc2l7);
        card7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(SubFusil.this, descc2l7.class);
                startActivity(i);
            }
        });

        card8 = (CardView) findViewById(R.id.Cardc2l8);
        card8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(SubFusil.this, descc2l8.class);
                startActivity(i);
            }
        });

    }
}