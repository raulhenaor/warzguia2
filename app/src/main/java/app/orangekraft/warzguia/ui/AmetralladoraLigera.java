package app.orangekraft.warzguia.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import app.orangekraft.warzguia.R;

public class AmetralladoraLigera extends AppCompatActivity {
    ImageView IvRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ametralladora_ligera);

        IvRegresar = (ImageView) findViewById(R.id.botonatras);
        IvRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}