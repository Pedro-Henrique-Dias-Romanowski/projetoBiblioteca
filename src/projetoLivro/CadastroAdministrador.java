package projetoLivro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastroAdministrador {
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String perguntarNomeAdministrador(){
        System.out.println("Qual é o nome do/a administrador ou admnistradora");
        return scanner.nextLine();
    }

    public String perguntarDataNascimentoAdministrador(String dataNascimentoAdministrador, LocalDate data){
        System.out.println("Qual é a data de nascimento do/a administrador ou administradora?");
        dataNascimentoAdministrador = scanner.nextLine();
        data = LocalDate.parse(dataNascimentoAdministrador, dateTimeFormatter);
        dataNascimentoAdministrador = data.format(dateTimeFormatter);
        return dataNascimentoAdministrador;
    }

    public String perguntarSenhaAdministrador(){
        System.out.println("Qual é a senha do administrador? ");
        return  scanner.nextLine();
    }

    public String perguntarCpfAdministrador(){
        System.out.println("Qual é o CPF do adminstrador? ");
        return scanner.nextLine();
    }
}
