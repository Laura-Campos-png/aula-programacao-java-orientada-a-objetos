public class Reta {

    
    private double a; 
    private double b; 

    public Reta(double a, double b) {
        this.a = a;
        this.b = b;
    }

   
    public Reta(Ponto2D p1, Ponto2D p2) {
        if (p1.getX() == p2.getX()) {
            
            throw new IllegalArgumentException("Reta vertical nao e suportada");
        }
        
        a = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
       
        b = p1.getY() - a * p1.getX();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    
    public boolean pertence(Ponto2D p) {
        double yDaReta = a * p.getX() + b;
        double diferenca = Math.abs(yDaReta - p.getY());
        
        if (diferenca < 0.000001) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (b >= 0) {
            return "y = " + a + "x + " + b;
        } else {
            return "y = " + a + "x - " + (-b);
        }
    }

    
    public Ponto2D intersecao(Reta outra) {
        if (a == outra.a) {
            return null;
        }
        double x = (outra.b - b) / (a - outra.a);
        double y = a * x + b;
        return new Ponto2D(x, y);
    }
}
