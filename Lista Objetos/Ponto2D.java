public class Ponto2D {

    private double x;
    private double y;

    
    public Ponto2D() {
        x = 0;
        y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D outro) {
        this.x = outro.x;
        this.y = outro.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void mover() {
        x = 0;
        y = 0;
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(Ponto2D outro) {
        this.x = outro.x;
        this.y = outro.y;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Ponto2D)) {
            return false;
        }
        Ponto2D outro = (Ponto2D) o;
        if (x == outro.x && y == outro.y) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distancia(Ponto2D outro) {
        double dx = outro.x - x;
        double dy = outro.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Ponto2D clonar() {
        return new Ponto2D(x, y);
    }
}
