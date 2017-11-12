package com.carlosalejandroriosoviedo.android.contadorfragmentos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ContadorFragment extends Fragment{

    private EditText mCampoContador;
    private Button mBotonContar, mBotonReiniciar;
    Contador C = new Contador();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmento_contador, container, false);

        mCampoContador = (EditText) v.findViewById(R.id.CampoConteo);
        mBotonContar = (Button) v.findViewById(R.id.BotonContar);
        mBotonReiniciar = (Button) v.findViewById(R.id.BotonReiniciar);
        C.Iniciar();

        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                C.SetCuenta();
                mCampoContador.setText(Integer.toString(C.GetConteo()));
            }
        });

        mBotonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                C.Reinicio();
                mCampoContador.setText(Integer.toString(C.GetConteo()));
            }
        });




        return v;
    }

    public class Contador {
        private int contador;

        public void Iniciar(){
            this.contador = 0;
        }

        public void SetCuenta (){
            this.contador = this.contador +1;
        }
        public int GetConteo(){
            return this.contador;
        }
        public void Reinicio(){
            this.contador = 0;
        }
    }

}
