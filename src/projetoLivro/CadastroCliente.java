package projetoLivro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {
    static Scanner scanner = new Scanner(System.in);
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static String dataNascimentoClienteString;
    static LocalDate data;
    static ArrayList<Cliente> clientes = new ArrayList<>();
    public CadastroCliente(){

    }


    public static  String perguntarNomeCliente(){
        System.out.println("Qual é o nome do cliente? ");
        return scanner.nextLine();
    }

    public static  String pergunutarDataNascimentoCliente(){
            System.out.println("Qual é a data de nascimento do cliente? ");
            dataNascimentoClienteString = scanner.nextLine();
            data = LocalDate.parse(dataNascimentoClienteString, dateTimeFormatter);
            dataNascimentoClienteString = data.format(dateTimeFormatter);
            return dataNascimentoClienteString;
    }

    public static  String perguntarSenhaCliente(){
        System.out.println("Qual será a senha do cliente? ");
        return scanner.nextLine();
    }

    public static  String perguntarCpfCliente(){
        System.out.println("Qual é o CPF do cliente");
        return scanner.nextLine();
    }

    public static void adicionarCliente(){
        Boolean clienteJaCadastrado = false;
        String nomeCliente = CadastroCliente.perguntarNomeCliente();
        String dataNascimento = CadastroCliente.pergunutarDataNascimentoCliente();
        String senhaCliente = CadastroCliente.perguntarSenhaCliente();
        String cpfCliente = CadastroCliente.perguntarCpfCliente();
        Cliente cliente = new Cliente(nomeCliente,cpfCliente ,senhaCliente, dataNascimento);
        for (Cliente c : clientes){
            if (c.equals(cliente)){
                System.out.println("Nós já temos um CPF igual a esse cadastrado, tente novamente");
                clienteJaCadastrado = true;
                break;
            }
        }
        if (!clienteJaCadastrado){
            clientes.add(cliente);
        }
    }


    public static void listarClientes(){
        if (!clientes.isEmpty()){
            for (Cliente cliente : clientes){
                System.out.println(cliente.toString());
            }
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void removerCliente(){
        ArrayList<Cliente> clientesParaSeremRemovidos = new ArrayList<>();
        if (!clientes.isEmpty()){
            System.out.println("Qual o nome do cliente que você deseja remover? ");
            String nomeCliente = scanner.nextLine();
            for (Cliente cliente : clientes){
                if(cliente.getNomeCliente().equals(nomeCliente)){
                    clientesParaSeremRemovidos.add(cliente);
                }
            }
            if(!clientesParaSeremRemovidos.isEmpty()){
                clientes.removeAll(clientesParaSeremRemovidos);
                System.out.println("Cliente removido com sucesso");
            } else {
                System.out.println("Cliente não encontrado, tente novamente");
            }
        } else {
            System.out.println("A lista está vazia, tente novamente");
        }
    }

    public static void atualizarCliente(){
        if(!clientes.isEmpty()){
            System.out.println("Qual o nome do cliente que você deseja alterar? ");
            String nomeCliente  = scanner.nextLine();
            for (Cliente cliente : clientes){
                if (cliente.getNomeCliente().equals(nomeCliente)){
                    int index = clientes.indexOf(cliente);
                    String novoNomeCliente = CadastroCliente.perguntarCpfCliente();
                    String novoCpfCliente = CadastroCliente.perguntarCpfCliente();
                    String novaDataNascimentoCliente = CadastroCliente.pergunutarDataNascimentoCliente();
                    String novaSenhaCliente = CadastroCliente.perguntarSenhaCliente();
                    cliente.setNomeCliente(novoNomeCliente);
                    cliente.setCpfCliente(novoCpfCliente);
                    cliente.setDataNascimentoCliente(novaDataNascimentoCliente);
                    cliente.setSenhaCliente(novaSenhaCliente);
                } else {
                    System.out.println("O nome que você digitou não corresponde a nenhum nome encontrado em nossa lista, tente novamente");
                }
            }
        } else {
            System.out.println("Não é possível alterar um cliente, pois a pois a lista de clientes está vazia no momento");
        }
    }



}
