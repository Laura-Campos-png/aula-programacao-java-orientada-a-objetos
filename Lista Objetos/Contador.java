public class Contador {

    private int valor;

    public Contador() {
        valor = 0;
    }

    public void zerar() {
        valor = 0;
    }

    public void incrementar() {
        valor = valor + 1;
    }

    public int getValor() {
        return valor;
    }
}
