package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends AppCompatActivity {
        Formulario formulario;
    private Button salvarBt;
    private Button limparBt;
    private Spinner opcoesSp;
    private TextView nomeCompletoEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private RadioGroup radioRg;
    private EditText cidadeEt;
    private CheckBox selecionadoCb;
    private String genero;
    private boolean emailLista;
    private String uf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        salvarBt = findViewById(R.id.salvarBt);
        salvarBt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                telefoneEt=findViewById(R.id.telefoneEt);
                emailEt=findViewById(R.id.emailEt);
                cidadeEt=findViewById(R.id.cidadeEt);
                nomeCompletoEt=findViewById(R.id.nomeCompletoEt);


                selecionadoCb=findViewById(R.id.selecionadoCb);
               if (selecionadoCb.isChecked()){
                  formulario.setEmailLista(emailLista =true);
               }

                radioRg=findViewById(R.id.radioRg);
                radioRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        RadioButton button = (RadioButton) group.findViewById(checkedId);
                         genero = button.getText().toString();
                         formulario.setGenero(genero);
                    }

                });
                opcoesSp=findViewById(R.id.opcoesSp);
                opcoesSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        uf= ((TextView)view).getText().toString();
                        formulario.setUf(uf);

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });




            }
        });


    }





}