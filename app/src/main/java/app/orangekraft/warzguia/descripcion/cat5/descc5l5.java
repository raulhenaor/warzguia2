package app.orangekraft.warzguia.descripcion.cat5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import app.orangekraft.warzguia.R;

public class descc5l5 extends AppCompatActivity {
    ImageView atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descc5l5);

        atras = (ImageView)findViewById(R.id.btnc1a1d1);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}