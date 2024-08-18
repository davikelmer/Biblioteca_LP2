package br.ufrn.imd.Pessoas;

import br.ufrn.imd.Biblioteca;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private int matricula;
    private String cargo;
    private LocalDate dataAdmissao;
    private double salario;

    public Funcionario(String nome, String cpf, LocalDate dataNascimento, double salario,
                       LocalDate dataAdmissao, String cargo, int matricula) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void cadastrarCliente(){

    }

    public void alterarDadosCliente(){

    }
}
