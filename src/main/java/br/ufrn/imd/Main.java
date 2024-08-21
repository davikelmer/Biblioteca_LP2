package br.ufrn.imd;

import br.ufrn.imd.Controller.ClienteController;
import br.ufrn.imd.Controller.LivroController;
import br.ufrn.imd.Pessoas.Funcionario;

import java.util.Scanner;

import static br.ufrn.imd.Controller.LivroController.*;
import static br.ufrn.imd.Controller.LivroController.adicionarLivro;

public class Main {
    public static void main(String[] args) {

        carregarEstante("src/main/resources/banco_de_dados_livros.txt");
        Funcionario funcionario = new Funcionario();
        ClienteController clienteController = new ClienteController();
        LivroController livroController = new LivroController();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("----- Menu Principal -----");
            System.out.println("1. Gerenciar Livros");
            System.out.println("2. Gerenciar Clientes");
            System.out.println("3. Alugar/Devolver Livros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    gerenciarLivros(livroController, scanner);
                    break;
                case 2:
                    //gerenciarClientes(clienteController, scanner);
                    break;
                case 3:
                    //gerenciarAluguel(aluguel, estanteController, biblioteca, scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void gerenciarLivros(LivroController livroController, Scanner scanner){
        int opcaoLivros;
        do {
            System.out.println("----- Gerenciar Livros -----");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Excluir Livro");
            System.out.println("4.Filtrar Livro por ISBN");
            System.out.println("5. Filtrar Livro por Nome");
            System.out.println("6.. Filtrar Livro por Gênero");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcaoLivros = Integer.parseInt(scanner.nextLine());

            switch (opcaoLivros) {
                case 1:
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de Publicação: ");
                    int ano = Integer.parseInt(scanner.nextLine());
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());

                    Livro livro = new Livro(isbn, titulo, autor, ano, genero, quantidade);
                    adicionarLivro(livro);
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    System.out.print("ISBN do livro a ser excluído: ");
                    String isbnExcluir = scanner.nextLine();
                    excluirLivro(isbnExcluir);
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcaoLivros != 0);


    }
    //private static void gerenciarClientes(ClienteController clienteController, Scanner scanner){

    //}
}