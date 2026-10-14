public class Conjunto {

    private String[] elementos = new String[2];
    private int qtd = 0;

    public int getQtd() {
        return qtd;
    }

    public String get(int i) {
        return elementos[i];
    }

    public boolean contem(String e) {
        for (int i = 0; i < qtd; i++) {
            if (elementos[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public boolean adicionar(String e) {
        if (contem(e)) {
            return false;
        }
        if (qtd == elementos.length) {
            String[] novo = new String[elementos.length * 2];
            for (int i = 0; i < qtd; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }

        elementos[qtd] = e;
        qtd++;
        return true;
    }

    public Conjunto uniao(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < qtd; i++) {
            resultado.adicionar(elementos[i]);
        }
        for (int i = 0; i < outro.qtd; i++) {
            resultado.adicionar(outro.elementos[i]); 
        }
        return resultado;
    }

    public Conjunto inter(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < qtd; i++) {
            if (outro.contem(elementos[i])) {
                resultado.adicionar(elementos[i]);
            }
        }
        return resultado;
    }

    public Conjunto menos(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < qtd; i++) {
            if (!outro.contem(elementos[i])) {
                resultado.adicionar(elementos[i]);
            }
        }
        return resultado;
    }

    public String toString() {
        String texto = "{";
        for (int i = 0; i < qtd; i++) {
            texto = texto + elementos[i];
            if (i < qtd - 1) {
                texto = texto + ", ";
            }
        }
        texto = texto + "}";
        return texto;
    }
}
