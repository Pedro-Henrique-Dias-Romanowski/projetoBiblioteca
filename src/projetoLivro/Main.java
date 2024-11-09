package projetoLivro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcao;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1 - Adicionar Cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Remover Clientes");
            System.out.println("4- Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    CadastroCliente.adicionarCliente();
                    break;
                case 2:
                    CadastroCliente.listarClientes();
                    break;
                case 3:
                    CadastroCliente.removerCliente();
                    break;
                case 4:
                    System.out.println("Você escolheu sair.....");
                    break;
            }
        } while (opcao != 4);
    }
}
