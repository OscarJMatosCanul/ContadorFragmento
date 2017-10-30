package com.oscarmatos.android.contadorfragmentos.ContadorFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.oscarmatos.android.contadorfragmentos.R;

/**
 * Created by oscar on 29/10/2017.
 */

public class java extends Fragment {

    private int conteo;
    EditText mCampoContador;
    Button mBotonContar;
    Button mBotonLimpiar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_contador,container,false);

        mCampoContador=(EditText)v.findViewById(R.id.campo_Conteo);
        mBotonContar=(Button)v.findViewById(R.id.boton_Contar);
        mBotonLimpiar=(Button)v.findViewById(R.id.boton_Reiniciar);
        conteo=0;

        mBotonContar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                conteo++;
                mCampoContador.setText(Integer.toString(conteo));
            }
        });

        mBotonLimpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mCampoContador.setText("0");
                conteo=0;
            }
        });

        return v;
    }
}
