public class Circulo {

    private double raio;
    private Ponto2D centro;

    public Circulo(double raio, Ponto2D centro) {
        this.raio = raio;
        this.centro = new Ponto2D(centro);
    }

    public Circulo(double raio) {
        this.raio = raio;
        this.centro = new Ponto2D(); 
    }




    public double getRaio() {
        return raio;
    }



    public void inflar(double valor) {
        raio = raio + valor;
    }



    public void desinflar(double valor) {
        raio = raio - valor;
    }


    public void inflar() {
        raio = raio + 1;
    }

    

    public void desinflar() {
        raio = raio - 1;
    }



    public void mover() {
        centro.mover();
    }

    public void mover(double x, double y) {
        centro.mover(x, y);
    }



    public void mover(Ponto2D p) {
        centro.mover(p);
    }

    
    public double area() {
        return Math.PI * raio * raio;
    }

    public String toString() {
        return "Circulo de raio " + raio + " com centro em " + centro;
    }
}
