package br.ufrn.imd;

import br.ufrn.imd.Pessoas.Funcionario;

public class Main {
    public static void main(String[] args) {
        Estante.carregarEstante("src/main/resources/banco_de_dados_livros.txt");

        EstanteController estanteController = new EstanteController();

        // Listar os livros carregados
        estanteController.listarLivros();

        Funcionario funcionario = new Funcionario();
        funcionario.biblioteca.carregarClientes();
        funcionario.biblioteca.listarClientes();


    }
}