public class Pessoa {

    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    
    public boolean equals(Object o) {
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa outra = (Pessoa) o;

        if (!nome.equals(outra.nome)) {
            return false;
        }

        
        if (mae == null && outra.mae == null) {
            return true;
        }
        if (mae == null || outra.mae == null) {
            return false;
        }
        return mae.equals(outra.mae);
    }

    public boolean ehIrma(Pessoa outra) {
        if (this == outra) {
            return false;
        }
        if (pai == null || mae == null || outra.pai == null || outra.mae == null) {
            return false;
        }
        if (pai.equals(outra.pai) && mae.equals(outra.mae)) {
            return true;
        }
        return false;
    }

    // verifica se p e antecessora de quem recebeu a mensagem
    public boolean ehAntecessora(Pessoa p) {
        if (pai != null) {
            if (pai.equals(p) || pai.ehAntecessora(p)) {
                return true;
            }
        }
        if (mae != null) {
            if (mae.equals(p) || mae.ehAntecessora(p)) {
                return true;
            }
        }
        return false;
    }
}
