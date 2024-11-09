package projetoLivro;

import java.util.Objects;

public class Cliente  {
    private String nomeCliente;
    private String cpfCliente;
    private String senhaCliente;
    private String dataNascimentoCliente;

    public Cliente(String nomeCliente, String cpfCliente, String senhaCliente, String dataNascimentoCliente){
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.senhaCliente = senhaCliente;
        this.dataNascimentoCliente =  dataNascimentoCliente;
    }

    public Cliente(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpfCliente, cliente.cpfCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpfCliente);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }

    public String getDataNascimentoCliente() {
        return dataNascimentoCliente;
    }

    public void setDataNascimentoCliente(String dataNascimentoCliente) {
        this.dataNascimentoCliente = dataNascimentoCliente;
    }



    @Override
    public String toString() {
        return  "Nome do  Cliente: " + getNomeCliente() + '\n' +
                "Cpf Cliente: " + getCpfCliente() + '\n' +
                "Senha do Cliente:" + getSenhaCliente() + '\n' +
                "Data de Nascimento Cliente:" + getDataNascimentoCliente() + '\n';
    }

}
