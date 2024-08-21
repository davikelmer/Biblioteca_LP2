package br.ufrn.imd;

import br.ufrn.imd.Pessoas.Funcionario;
import br.ufrn.imd.Pessoas.Pessoa;
import br.ufrn.imd.Pessoas.Cliente;


public class Main {
    public static void main(String[] args) {
        Estante.carregarEstante("src/main/resources/banco_de_dados_livros.txt");
        Funcionario funcionario = new Funcionario();
        funcionario.biblioteca.carregarClientes();


    }
}