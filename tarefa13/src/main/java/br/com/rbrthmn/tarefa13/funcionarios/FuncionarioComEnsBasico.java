package br.com.rbrthmn.tarefa13.funcionarios;

public class FuncionarioComEnsBasico extends Funcionario {
    protected String escolaEnsBasico;

    public FuncionarioComEnsBasico(
            String nome,
            int codigoFuncional,
            Comissao comissao,
            String escolaEnsBasico
    ) {
        super(nome, codigoFuncional, comissao);
        this.escolaEnsBasico = escolaEnsBasico;
        this.rendaBasica *= 1.1;
    }

    public String getEscolaEnsBasico() {
        return escolaEnsBasico;
    }

    public void setEscolaEnsBasico(String escolaEnsBasico) {
        this.escolaEnsBasico = escolaEnsBasico;
    }
}
