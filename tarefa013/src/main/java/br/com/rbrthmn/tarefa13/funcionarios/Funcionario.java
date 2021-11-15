package br.com.rbrthmn.tarefa13.funcionarios;

public class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected double rendaBasica;
    protected Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
        this.rendaBasica = 1000 + comissao.valor;
    }

    @Override
    public String toString() {
        return String.format("Funcionário: %s \n" +
                "Comissao: %s \n" +
                "Salário total: %s \n", this.nome, this.comissao.valor, this.rendaBasica);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public void setRendaBasica(double rendaBasica) {
        this.rendaBasica = rendaBasica;
    }

    public Comissao getComisssao() {
        return comissao;
    }

    public void setComisssao(Comissao comissao) {
        this.comissao = comissao;
    }
}
