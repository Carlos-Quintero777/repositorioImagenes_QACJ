package com.example.repositorioimagenes_qacj;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.HashMap;

public class PrincipalActivity extends AppCompatActivity {

    private HashMap<String, String> imagenesPrimos;

    private EditText busquedaPrimo;
    private Button botonBuscar;
    private ImageView imagenPrimo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        inicializarImagenesPrimos();


        busquedaPrimo = findViewById(R.id.busqueda_primo);
        botonBuscar = findViewById(R.id.boton_buscar);
        imagenPrimo = findViewById(R.id.imagen_primo);


        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarImagenPrimo();
            }
        });
    }

    private void inicializarImagenesPrimos() {
        imagenesPrimos = new HashMap<>();
        imagenesPrimos.put("Aaron", "https://drive.google.com/uc?id=1fDY74jdw2q_nJ_PpmzO61ZxIHeXpX0yv");
        imagenesPrimos.put("Adair", "https://drive.google.com/uc?id=1EMzViEG6Sc5tP_Qp3HQqIOBnZWVUoHVS");
        imagenesPrimos.put("Aldair", "https://drive.google.com/uc?id=1cC285QGGG7lVFuRH32aI3xEtayUFQvrl");
        imagenesPrimos.put("Alfredo", "https://drive.google.com/uc?id=1JqSX5G2_YFXqefG2jnD-h5sFSykxGLon");
        imagenesPrimos.put("Anahi", "https://drive.google.com/uc?id=1p8g1NXQdRanzGsIU9llE2tiladLhZ1B5");
        imagenesPrimos.put("Angel", "https://drive.google.com/uc?id=12EbSOvcCYGIDIDQ-5Ra9g29PhCjs0_Df");
        imagenesPrimos.put("Brayan", "https://drive.google.com/uc?id=1RDf4ryEkzJi3lewT-SNVTV_tYl-fE5OP");
        imagenesPrimos.put("YoMeroCaguamero", "https://drive.google.com/uc?id=19IDVCF282Stu9ETpMHzy6byZVoXWHPfZ");
        imagenesPrimos.put("Cesar", "https://drive.google.com/uc?id=19IDVCF282Stu9ETpMHzy6byZVoXWHPfZ");
        imagenesPrimos.put("Emiliano", "https://drive.google.com/uc?id=1t-LyHgmYcQiectBUycCNPNc-7iiKKw_H");
        imagenesPrimos.put("Fabian", "https://drive.google.com/uc?id=1Wx6FU8RKlDQNz1OY8RpYfP5O19-PYWza");
        imagenesPrimos.put("Juan", "https://drive.google.com/uc?id=1e4f2JrcRa4Hk6g0Yn9nJkn3dSSK77Gnb");
        imagenesPrimos.put("Lesli", "https://drive.google.com/uc?id=13AtCZ6cRN5FhuT_XuyAw98LfkXJ9XwfN");
        imagenesPrimos.put("Mariana", "https://drive.google.com/uc?id=1smcm8_CRB-VBUqBSnVh64QHzxj0Vsa-6");
        imagenesPrimos.put("Mauricio", "https://drive.google.com/uc?id=1riOiCECN6TpID1EU7tMCXHzYV8DD4-xR");
        imagenesPrimos.put("Misael", "https://drive.google.com/uc?id=1KFxwd21gvBFodny6Q5zM_vEab0JIfzxG");
        imagenesPrimos.put("Moises", "https://drive.google.com/uc?id=1SD6MsF5K1rfghl7g0CIfAsAs01a9OExR");
        imagenesPrimos.put("Rafael", "https://drive.google.com/uc?id=13mzG2HNKKzMaGlKLfU6q2JDMEQmvAm9S");
        imagenesPrimos.put("Wendy", "https://drive.google.com/uc?id=1i6-uObnR9m3Cs_HbEJ2DlpnzwfxhLXt4");
        imagenesPrimos.put("Victor", "https://drive.google.com/uc?id=1MWlzsWAK1ntvjA-oWX09zhKE3c9o06hk");

    }


    private void buscarImagenPrimo() {
        String nombrePrimo = busquedaPrimo.getText().toString().trim();

        if (imagenesPrimos.containsKey(nombrePrimo)) {
            String urlImagen = imagenesPrimos.get(nombrePrimo);


            Picasso.get()
                    .load(urlImagen)
                    .into(imagenPrimo);
        } else {
            Toast.makeText(this, "No se encontró la imagen de " + nombrePrimo, Toast.LENGTH_SHORT).show();
        }
    }
}
