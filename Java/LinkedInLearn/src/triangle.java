public class triangle {
    static int numofsides=3;

    double base;
    double height;
    double sidelen1;
    double sidelen2;
    double sidelen3;

    public triangle(double base, double height, double sidelen1, double sidelen2, double sidelen3){
        this.base=base;
        this.height=height;
        this.sidelen1=sidelen1;
        this.sidelen2=sidelen2;
        this.sidelen3=sidelen3;
    }

    public double FindArea(){
        return (this.base*this.height)/2;
    }
}
