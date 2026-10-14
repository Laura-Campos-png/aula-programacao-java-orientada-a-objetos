public class NumeroComplexo {

    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

   
    public void somar(NumeroComplexo outro) {
        real = real + outro.real;
        imaginario = imaginario + outro.imaginario;
    }

    
    public void subtrair(NumeroComplexo outro) {
        real = real - outro.real;
        imaginario = imaginario - outro.imaginario;
    }

   
    public void multiplicar(NumeroComplexo outro) {
        double a = real;
        double b = imaginario;
        double c = outro.real;
        double d = outro.imaginario;

        // guardei a,b,c,d antes pra nao perder o valor original
        real = a * c - b * d;
        imaginario = a * d + b * c;
    }

    // (a+bi)/(c+di) = (ac+bd)/(c2+d2) + (bc-ad)/(c2+d2)i
    public void dividir(NumeroComplexo outro) {
        double a = real;
        double b = imaginario;
        double c = outro.real;
        double d = outro.imaginario;

        double baixo = c * c + d * d;

        real = (a * c + b * d) / baixo;
        imaginario = (b * c - a * d) / baixo;
    }

    public boolean equals(Object o) {
        if (!(o instanceof NumeroComplexo)) {
            return false;
        }
        NumeroComplexo outro = (NumeroComplexo) o;
        if (real == outro.real && imaginario == outro.imaginario) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (imaginario >= 0) {
            return real + " + " + imaginario + "i";
        } else {
            return real + " - " + (-imaginario) + "i";
        }
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginario * imaginario);
    }
}
