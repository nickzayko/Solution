public class Plus {
    public double param1 = 0;
    public double param2 = 0;

    public Plus(double param1, double param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public Plus () {}

    public double getParam1() {
        return param1;
    }

    public void setParam1(double param1) {
        this.param1 = param1;
    }

    public double getParam2() {
        return param2;
    }

    public void setParam2(double param2) {
        this.param2 = param2;
    }

    public double Plus (double param1, double param2){
        return param1 + param2;
    }

}
