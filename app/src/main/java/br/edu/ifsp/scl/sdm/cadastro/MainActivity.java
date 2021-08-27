package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
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


public class MainActivity extends AppCompatActivity {

    private Button salvarBt;
    private Button limparBt;
    private Spinner opcoesSp;
    private EditText nomeCompletoEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private RadioGroup radioRg;
    private EditText cidadeEt;
    private CheckBox selecionadoCb;
    private String genero;
    private String emailLista;
    private String uf;
    private RadioButton  feminino;
    private RadioButton  masculino;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telefoneEt=findViewById(R.id.telefoneEt);
        emailEt=findViewById(R.id.emailEt);
        cidadeEt=findViewById(R.id.cidadeEt);
        nomeCompletoEt=findViewById(R.id.nomeCompletoEt);
        feminino=findViewById(R.id.femininoRb);
        masculino=findViewById(R.id.masculinoRb);


        selecionadoCb=findViewById(R.id.selecionadoCb);
        if (selecionadoCb.isChecked()) {
            emailLista = "Sim";
        } else if (selecionadoCb.isChecked()) {
            emailLista = "Não";
        }


        radioRg=findViewById(R.id.radioRg);
        radioRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton button = (RadioButton) group.findViewById(checkedId);
                genero = button.getText().toString();

            }

        });
        opcoesSp=findViewById(R.id.opcoesSp);
        opcoesSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                uf= ((TextView)view).getText().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this,
                        "Escolha um Estado!",
                        Toast.LENGTH_SHORT).show();
            }
        });



        salvarBt = findViewById(R.id.salvarBt);
        salvarBt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Formulario formulario = new Formulario(nomeCompletoEt.getText().toString(), telefoneEt.getText().toString(), emailEt.getText().toString(), cidadeEt.getText().toString(), genero, emailLista, uf);

                StringBuffer stringBuffer = new StringBuffer();

                stringBuffer.append("Nome Completo: ");
                stringBuffer.append(formulario.getNomeCompletoEt());
                stringBuffer.append('\n');
                stringBuffer.append(", Telefone: ");
                stringBuffer.append(formulario.getTelefoneEt());
                stringBuffer.append('\n');
                stringBuffer.append(", E-mail: ");
                stringBuffer.append(formulario.getEmailEt());
                stringBuffer.append('\n');
                stringBuffer.append(", Inserir na lista de E-mail: ");
                stringBuffer.append(formulario.getEmailLista());
                stringBuffer.append('\n');
                stringBuffer.append(", Gênero: ");
                stringBuffer.append(formulario.getGenero());
                stringBuffer.append('\n');
                stringBuffer.append(", Cidade: ");
                stringBuffer.append(formulario.getCidadeEt());
                stringBuffer.append('\n');
                stringBuffer.append(", Estado: ");
                stringBuffer.append(formulario.getUf());

                Toast.makeText(MainActivity.this, stringBuffer.toString(), Toast.LENGTH_LONG).show();

            }
        });


        limparBt = findViewById(R.id.limparBt);
        limparBt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                telefoneEt.getText().clear();
                emailEt.getText().clear();
                cidadeEt.getText().clear();
                nomeCompletoEt.getText().clear();
                cidadeEt.getText().clear();
                selecionadoCb.setChecked(false);
                feminino.setChecked(false);
                masculino.setChecked(false);
                opcoesSp.setSelection(0);



            }
        });

    }





}