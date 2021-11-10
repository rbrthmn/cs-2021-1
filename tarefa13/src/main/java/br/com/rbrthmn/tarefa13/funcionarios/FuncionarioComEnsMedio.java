package br.com.rbrthmn.tarefa13.funcionarios;

public class FuncionarioComEnsMedio extends FuncionarioComEnsBasico {
    protected String escolaEnsMedio;

    public FuncionarioComEnsMedio(
            String nome,
            int codigoFuncional,
            Comissao comissao,
            String escolaEnsBasico,
            String escolaEnsMedio
    ) {
        super(nome, codigoFuncional, comissao, escolaEnsBasico);
        this.escolaEnsMedio = escolaEnsMedio;
        this.rendaBasica *= 1.5;
    }

    public String getEscolaEnsMedio() {
        return escolaEnsMedio;
    }

    public void setEscolaEnsMedio(String escolaEnsMedio) {
        this.escolaEnsMedio = escolaEnsMedio;
    }
}
