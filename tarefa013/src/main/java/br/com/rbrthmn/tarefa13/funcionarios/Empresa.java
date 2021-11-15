package br.com.rbrthmn.tarefa13.funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        var joao = new FuncionarioComEnsBasico("joao", 1, new Surpevisor(), "escolao");
        var jessica = new FuncionarioComEnsBasico("jessica",2, new Vendedor(), "escolao");
        var matheus = new FuncionarioComEnsBasico("matheus", 3, new Vendedor(), "escolao");
        var jorge = new FuncionarioComEnsBasico("jorge", 4, new Vendedor(), "escolao");
        var jose = new FuncionarioComEnsMedio("jose", 5, new Vendedor(), "escolao", "bagunca");
        var maria = new FuncionarioComEnsMedio("maria", 5, new Vendedor(), "escolao", "bagunca");
        var carla = new FuncionarioComEnsMedio("carla", 5, new Vendedor(), "escolao", "bagunca");
        var vitor = new FuncionarioComEnsMedio("vitor", 5, new Vendedor(), "escolao", "bagunca");
        var pedro = new FuncionarioComGraduacao("pedro", 5, new Gerente(), "escolao", "bagunca", "balburdia");
        var lisa = new FuncionarioComGraduacao("lisa", 5, new Surpevisor(), "escolao", "bagunca", "balburdia");
        funcionarios = new ArrayList<>();
        funcionarios.add(joao);
        funcionarios.add(jessica);
        funcionarios.add(matheus);
        funcionarios.add(jorge);
        funcionarios.add(jose);
        funcionarios.add(maria);
        funcionarios.add(carla);
        funcionarios.add(vitor);
        funcionarios.add(pedro);
        funcionarios.add(lisa);
    }

    public static void main(String[] args) {
        var empresa = new Empresa();

        var gastos = empresa.calculaCustos();
//        System.out.println(gastos);
        empresa.listaFuncionarios();
    }

    public Double calculaCustos() {
        double gastoTotal = 0;
        for (Funcionario funcionario :
                funcionarios) {
            gastoTotal += funcionario.getRendaBasica();
        }

        return gastoTotal;
    }

    public void listaFuncionarios() {
        for (Funcionario funcionario :
                funcionarios) {
            System.out.println(funcionario.toString());
        }
    }
}

