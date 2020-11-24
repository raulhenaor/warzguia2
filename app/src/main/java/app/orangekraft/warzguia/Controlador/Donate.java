package app.orangekraft.warzguia.Controlador;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import app.orangekraft.warzguia.R;
import app.orangekraft.warzguia.ui.AmetralladoraLigera;
import app.orangekraft.warzguia.ui.FusilAsalto;
import app.orangekraft.warzguia.ui.FusilPrecision;
import app.orangekraft.warzguia.ui.FusilTactico;
import app.orangekraft.warzguia.ui.SubFusil;
import app.orangekraft.warzguia.ui.drop;
import app.orangekraft.warzguia.ui.escopeta;
import app.orangekraft.warzguia.ui.noticias;
import app.orangekraft.warzguia.ui.semanal;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Donate#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Donate extends Fragment implements View.OnClickListener{
    CardView card1, card2, card3;
    private InterstitialAd mInterstitialAd;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Donate() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Donate.
     */
    // TODO: Rename and change types and number of parameters
    public static Donate newInstance(String param1, String param2) {
        Donate fragment = new Donate();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-6141328272992308/5405135693");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-6141328272992308/5405135693");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });



        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_donate, container, false);



        card1 = (CardView) view.findViewById(R.id.noticias);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }


                Intent in = new Intent(getActivity(), noticias.class);
                in.putExtra("some","some data");
                startActivity(in);




            }
        });

        card2 = (CardView) view.findViewById(R.id.semanal);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }


                Intent in = new Intent(getActivity(), semanal.class);
                in.putExtra("some","some data");
                startActivity(in);




            }
        });

        card3 = (CardView) view.findViewById(R.id.drop);
        card3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                Intent in = new Intent(getActivity(), drop.class);
                in.putExtra("some", "some data");
                startActivity(in);
            }
        });


        return view;
    }
    @Override
    public void onClick(View v) {

    }
}