public class Continente {

    private String nome;
    private Pais[] paises = new Pais[48]; 
    private int qtd = 0;

    public Continente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }



    public void adicionarPais(Pais p) {
        if (qtd < 48) {
            paises[qtd] = p;
            qtd++;
        }
    }




    public double dimensaoTotal() {
        double soma = 0;
        for (int i = 0; i < qtd; i++) {
            soma = soma + paises[i].getDimensao();
        }
        return soma;
    }





    public long populacaoTotal() {
        long soma = 0;
        for (int i = 0; i < qtd; i++) {
            soma = soma + paises[i].getPopulacao();
        }
        return soma;
    }

    public double densidade() {
        return populacaoTotal() / dimensaoTotal();
    }


    
    public Pais maiorPopulacao() {
        if (qtd == 0) {
            return null;
        }
        Pais maior = paises[0];
        for (int i = 1; i < qtd; i++) {
            if (paises[i].getPopulacao() > maior.getPopulacao()) {
                maior = paises[i];
            }
        }
        return maior;
    }

    public Pais menorPopulacao() {
        if (qtd == 0) {
            return null;
        }
        Pais menor = paises[0];
        for (int i = 1; i < qtd; i++) {
            if (paises[i].getPopulacao() < menor.getPopulacao()) {
                menor = paises[i];
            }
        }
        return menor;
    }

    public Pais maiorDimensao() {
        if (qtd == 0) {
            return null;
        }
        Pais maior = paises[0];
        for (int i = 1; i < qtd; i++) {
            if (paises[i].getDimensao() > maior.getDimensao()) {
                maior = paises[i];
            }
        }
        return maior;
    }

    public Pais menorDimensao() {
        if (qtd == 0) {
            return null;
        }
        Pais menor = paises[0];
        for (int i = 1; i < qtd; i++) {
            if (paises[i].getDimensao() < menor.getDimensao()) {
                menor = paises[i];
            }
        }
        return menor;
    }
    public double razaoTerritorial() {
        return maiorDimensao().getDimensao() / menorDimensao().getDimensao();
    }
}
