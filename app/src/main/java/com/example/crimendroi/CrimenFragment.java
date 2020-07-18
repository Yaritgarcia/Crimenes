package com.example.crimendroi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class CrimenFragment extends Fragment {

    private EditText tituloTxt;
    private Button agregarFechaBtn;
    private CheckBox resueltoCh;

    public CrimenFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crimen, container, false);
        tituloTxt = view.findViewById(R.id.titulo_text);
        agregarFechaBtn = view.findViewById(R.id.agregar_fecha_btn);
        resueltoCh = view.findViewById(R.id.resuelto_ch);
        return view;
    }
}