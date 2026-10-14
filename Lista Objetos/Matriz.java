public class Matriz {

    private double[][] dados;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        dados = new double[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public double get(int i, int j) {
        return dados[i][j];
    }

    public void set(int i, int j, double valor) {
        dados[i][j] = valor;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Matriz)) {
            return false;
        }
        Matriz outra = (Matriz) o;
        if (linhas != outra.linhas || colunas != outra.colunas) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (dados[i][j] != outra.dados[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public Matriz transposta() {
        Matriz t = new Matriz(colunas, linhas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                t.dados[j][i] = dados[i][j];
            }
        }
        return t;
    }

   
    public Matriz oposta() {
        Matriz op = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                op.dados[i][j] = -dados[i][j];
            }
        }
        return op;
    }
    
    public Matriz nula() {
        return new Matriz(linhas, colunas); 
    }

    private boolean ehQuadrada() {
        return linhas == colunas;
    }

    
    public boolean ehIdentidade() {
        if (!ehQuadrada()) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j && dados[i][j] != 1) {
                    return false;
                }
                if (i != j && dados[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    
    public boolean ehDiagonal() {
        if (!ehQuadrada()) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i != j && dados[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean ehSingular() {
        if (!ehDiagonal()) {
            return false;
        }
        for (int i = 1; i < linhas; i++) {
            if (dados[i][i] != dados[0][0]) {
                return false;
            }
        }
        return true;
    }


    public boolean ehSimetrica() {
        if (!ehQuadrada()) {
            return false;
        }
        return this.equals(transposta());
    }

    
    public boolean ehAntiSimetrica() {
        if (!ehQuadrada()) {
            return false;
        }
        return oposta().equals(transposta());
    }

    public boolean somar(Matriz outra) {
        if (linhas != outra.linhas || colunas != outra.colunas) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] = dados[i][j] + outra.dados[i][j];
            }
        }
        return true;
    }

    public boolean subtrair(Matriz outra) {
        if (linhas != outra.linhas || colunas != outra.colunas) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] = dados[i][j] - outra.dados[i][j];
            }
        }
        return true;
    }
    public boolean multiplicar(Matriz outra) {
        if (colunas != outra.linhas) {
            return false;
        }
        double[][] novo = new double[linhas][outra.colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < outra.colunas; j++) {
                double soma = 0;
                for (int k = 0; k < colunas; k++) {
                    soma = soma + dados[i][k] * outra.dados[k][j];
                }
                novo[i][j] = soma;
            }
        }
        dados = novo;
        colunas = outra.colunas;
        return true;
    }

   
    public Matriz copia() {
        Matriz c = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                c.dados[i][j] = dados[i][j];
            }
        }
        return c;
    }

    public String toString() {
        String texto = "";
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                texto = texto + dados[i][j] + " ";
            }
            texto = texto + "\n";
        }
        return texto;
    }
}
