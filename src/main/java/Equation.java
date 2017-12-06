public class Equation {
    public double a = 0;
    public double b = 0;
    public double c = 0;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Equation(){}

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String solution (){
        String solution = null;
        double discriminant, x1, x2;
        discriminant = b * b - (4 * a * c);
        if (discriminant > 0) {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            solution = ("Корнями уравнения вида " + a +" * x^2 + "+ b + " * x " + c + " = 0 " +
                    " являются: " + "x1 = " + x1 + " ; x2 = " + x2);
        }

        if (discriminant == 0) {
            x1 = x2 = -b / (2 * a);
            solution = ("Корнями уравнения вида " + a +" * x^2 + "+ b + " * x " + c + " = 0 " +
                    " являются: " + "x1 = x2 = " + x1);

        }
        if (discriminant < 0) {
            solution = ("Корнями уравнения вида " + a +" * x^2 + "+ b + " * x " + c + " = 0 " +
                    " являются: можество действительных чисел");
        }

        return solution;
    }
}
