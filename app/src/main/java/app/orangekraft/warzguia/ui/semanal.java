package app.orangekraft.warzguia.ui;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import app.orangekraft.warzguia.R;

public class semanal extends AppCompatActivity implements ValueEventListener {
    ImageView atras;
    private AdView mAdView;
    TextView textView;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference firstDatabase = databaseReference.child("misiones");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semanal);
        textView = (TextView)findViewById(R.id.semanita);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        atras = (ImageView) findViewById(R.id.donate);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void atras (View view) {
        onBackPressed();
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

        if (dataSnapshot.getValue(String.class)!=null){
            String key = dataSnapshot.getKey();
            if (key.equals("misiones")){
                String semanita = dataSnapshot.getValue(String.class);
                textView.setText(semanita);
            }
        }

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
    @Override
    protected  void  onStart() {

        super.onStart();
        firstDatabase.addValueEventListener(this);
    }
}