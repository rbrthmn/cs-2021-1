public class Estado {
    private String nome;
    private Pais pais;
    private List<Cidade> cidades;

    public List<Cidade> consultaCidades() {
        return cidades;
    }
}