public class Pais {

    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao; 

    private Pais[] vizinhos = new Pais[40]; 
    private int qtdVizinhos = 0;

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    
    public void adicionarVizinho(Pais outro) {
        if (qtdVizinhos < 40 && !ehLimitrofe(outro)) {
            vizinhos[qtdVizinhos] = outro;
            qtdVizinhos++;
        }
    }

    public boolean equals(Object o) {
        if (!(o instanceof Pais)) {
            return false;
        }
        Pais outro = (Pais) o;
        return codigoISO.equals(outro.codigoISO);
    }

    
    public boolean ehLimitrofe(Pais outro) {
        for (int i = 0; i < qtdVizinhos; i++) {
            if (vizinhos[i].equals(outro)) {
                return true;
            }
        }
        return false;
    }

   
    public double densidade() {
        return populacao / dimensao;
    }

    public Pais[] vizinhosComuns(Pais outro) {
        // primeiro conto quantos sao
        int cont = 0;
        for (int i = 0; i < qtdVizinhos; i++) {
            if (outro.ehLimitrofe(vizinhos[i])) {
                cont++;
            }
        }

        Pais[] comuns = new Pais[cont];
        int pos = 0;
        for (int i = 0; i < qtdVizinhos; i++) {
            if (outro.ehLimitrofe(vizinhos[i])) {
                comuns[pos] = vizinhos[i];
                pos++;
            }
        }
        return comuns;
    }

    public String toString() {
        return nome + " (" + codigoISO + ")";
    }
}
