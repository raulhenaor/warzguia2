package app.orangekraft.warzguia.descripcion.cat2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import app.orangekraft.warzguia.R;

public class descc2l4 extends AppCompatActivity {
    ImageView atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descc2l4);

        atras = (ImageView) findViewById(R.id.btnc1a1d1);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}