package br.com.rbrthmn.tarefa13.funcionarios;

public class FuncionarioComGraduacao extends FuncionarioComEnsMedio {
    protected String universidade;

    public FuncionarioComGraduacao(
            String nome,
            int codigoFuncional,
            Comissao comissao,
            String escolaEnsBasico,
            String escolaEnsMedio,
            String universidade
    ) {
        super(nome, codigoFuncional, comissao, escolaEnsBasico, escolaEnsMedio);
        this.universidade = universidade;
        this.rendaBasica *= 2;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}
