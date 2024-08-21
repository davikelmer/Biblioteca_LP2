package br.ufrn.imd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import br.ufrn.imd.Pessoas.Cliente;

public class Biblioteca {
    //Estante.carregarEstante("src/main/resources/banco_de_dados_livros.txt");
    ArrayList<Cliente> clientes = new ArrayList<>();



    void carregarClientes() {
        try (BufferedReader leitor = new BufferedReader(new FileReader("src/main/resources/banco_de_dados_clientes.txt"))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dadosCliente = linha.split(", ");
                if(!dadosCliente[0].equals("Nome")) {
                    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String nome = dadosCliente[0];
                    String cpf = dadosCliente[1];
                    LocalDate dataNascimento = LocalDate.parse(dadosCliente[2], formatoData);
                    String telefone = dadosCliente[3];
                    String email = dadosCliente[4];
                    String rua = dadosCliente[5];
                    String numero = dadosCliente[6];
                    String bairro = dadosCliente[7];
                    String cidade = dadosCliente[8];
                    String estado = dadosCliente[9];
                    String cep = dadosCliente[10];

                    clientes.add(new Cliente(nome, cpf, dataNascimento, telefone, email, rua, numero, bairro, cidade, estado, cep));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        clientes.forEach(e -> System.out.println(e.getNome()));
    }

    public void buscarClienteNome(){ //vai receber uma Nome ou CPF

    }

    public void alterarCliente(Cliente cliente) { //Vai receber um CPF

    }
}
