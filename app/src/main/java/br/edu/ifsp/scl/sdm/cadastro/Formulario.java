package br.edu.ifsp.scl.sdm.cadastro;


import android.widget.EditText;


/**
 *
 */
public class Formulario {


    private String nomeCompletoEt;
    private String telefoneEt;
    private String emailEt;
    private String cidadeEt;
    private String genero;
    private String emailLista;
    private String uf;


    public Formulario(String nomeCompletoEt, String telefoneEt, String emailEt, String cidadeEt, String genero, String emailLista, String uf) {
    this.nomeCompletoEt=nomeCompletoEt;
    this.telefoneEt=telefoneEt;
    this.emailEt=emailEt;
    this.cidadeEt=cidadeEt;
    this.genero=genero;
    this.emailLista=emailLista;
    this.uf=uf;

    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmailLista() {
        return emailLista;
    }

    public void setEmailLista(String emailLista) {
        this.emailLista = emailLista;
    }


    public String getNomeCompletoEt() {
        return nomeCompletoEt;
    }

    public void setNomeCompletoEt(String nomeCompletoEt) {
        this.nomeCompletoEt = nomeCompletoEt;
    }

    public String getTelefoneEt() {
        return telefoneEt;
    }

    public void setTelefoneEt(String telefoneEt) {
        this.telefoneEt = telefoneEt;
    }

    public String getEmailEt() {
        return emailEt;
    }

    public void setEmailEt(String emailEt) {
        this.emailEt = emailEt;
    }

    public String getCidadeEt() {
        return cidadeEt;
    }

    public void setCidadeEt(String cidadeEt) {
        this.cidadeEt = cidadeEt;
    }
}
