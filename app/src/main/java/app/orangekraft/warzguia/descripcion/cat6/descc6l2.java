package app.orangekraft.warzguia.descripcion.cat6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import app.orangekraft.warzguia.R;

public class descc6l2 extends AppCompatActivity {
    ImageView atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descc6l2);

        atras = (ImageView)findViewById(R.id.btnc1a1d1);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}