package projetoLivro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastroLivro {
    Scanner scanner = new Scanner(System.in);
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public CadastroLivro(){

    }

    public String perguntarNomeLivro() {
        System.out.println("Qual é o nome do livro? ");
        return scanner.nextLine();
    }

    public String perguntarAnoLancamentoLivro(String anoLancamentoLivroString , LocalDate data) {
        System.out.println("Qual é o ano de lançamento do livro? ");
        anoLancamentoLivroString = scanner.nextLine();
        data = LocalDate.parse(anoLancamentoLivroString, dateTimeFormatter);
        anoLancamentoLivroString = data.format(dateTimeFormatter);
        return anoLancamentoLivroString;
    }


    public String perguntarNomeAutorLivro() {
        System.out.println("Qual é o nome do autor do livro? ");
        return scanner.nextLine();
    }
}
