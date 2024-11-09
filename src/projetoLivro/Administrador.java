package projetoLivro;

import java.util.Date;

public class Administrador {
    private String  nomeAdministardor;
    private String  cpfAdmnistrador;
    private String senha;
    private String dataNascimentoAdministradorString;

    public Administrador(String nomeAdministardor, String cpfAdmnistrador, String senha, String dataNascimentoAdministradorString){
        this.nomeAdministardor = nomeAdministardor;
        this.cpfAdmnistrador = cpfAdmnistrador;
        this.senha = senha;
        this.dataNascimentoAdministradorString = dataNascimentoAdministradorString;
    }

    public Administrador(){

    }

    public String getNomeAdministardor() {
        return nomeAdministardor;
    }

    public void setNomeAdministardor(String nomeAdministardor) {
        this.nomeAdministardor = nomeAdministardor;
    }

    public String getCpfAdmnistrador() {
        return cpfAdmnistrador;
    }

    public void setCpfAdmnistrador(String cpfAdmnistrador) {
        this.cpfAdmnistrador = cpfAdmnistrador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataNascimentoAdministradorString() {
        return dataNascimentoAdministradorString;
    }

    public void setDataNascimentoAdministradorString(String dataNascimentoAdministradorString) {
        this.dataNascimentoAdministradorString = dataNascimentoAdministradorString;
    }

    @Override
    public String toString() {
        return "Nome do Administador: " + getNomeAdministardor() + '\n' +
                "Cpf do Admnistrador: " + getCpfAdmnistrador() + '\n' +
                "DataNascimento do Administrador: " + getCpfAdmnistrador() ;
    }
}
