package projetoLivro;

public class Livro  {
    private String nomeLivro;
    private String anoLancamentoLivro;
    private String nomeAutor;
    // FALTA FAZER A VARIAVEL DO ENUM DO TIPO LIVRO, FALTA O MÉTODO NA OUTRA CLASSE TAMBÉM

    public Livro(String nomeLivro, String anoLancamentoLivro, String nomeAutor){
        this.nomeLivro = nomeLivro;
        this.anoLancamentoLivro = anoLancamentoLivro;
        this.nomeAutor = nomeAutor;
    }

    public Livro(){

    }


    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAnoLancamentoLivro() {
        return anoLancamentoLivro;
    }

    public void setAnoLancamentoLivro(String anoLancamentoLivro) {
        this.anoLancamentoLivro = anoLancamentoLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    @Override
    public String toString() {
        return "Nome do Livro: " + getNomeLivro() + '\n' +
                "Ano de Lançamento do Livro: " + getAnoLancamentoLivro() + '\n' +
                "Nome do Autor: " + getNomeAutor() + '\n';
    }

}
