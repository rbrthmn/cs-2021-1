public class CadastroEndereco implements Endereco Service{
    private String tipoEndereco;
    private String tipoLogradouro;
    private String nomeLogradouro;
    private int numero;
    private String complementoNumero;
    private String complementoEndereço;
    private Bairro bairro;
    private Integer CEP;
    private Cidade cidade;
    private Estado estado;
    private Pais pais;

    @Override
    public List<Logradouro> consultaPorTipo(TipoLogradouro tipoLogradouro) {
        return null;
    }

    @Override
    public List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco) {
        return null;
    }

    @Override
    public List<Endereco> consultaPorCep(int cep) {
        return null;
    }

    @Override
    public List<Endereco> consultaPorLogradouro(Logradouro logradouro) {
        return null;
    }

    @Override
    public List<Endereco> consultaPorBairro(Bairro bairro) {
        return null;
    }

    @Override
    public List<Endereco> consultaPorCidade(Cidade cidade) {
        return cidade.getEnderecos();
    }

    @Override
    public List<Cidade> listaCidadesPorEstado(Estado estado) {
        return estado.consultaCidades();
    }

    @Override
    public List<Estado> consultaPorPais(Pais pais) {
        return pais.getEstados();
    }
}
