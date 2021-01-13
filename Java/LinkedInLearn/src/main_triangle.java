public class main_triangle {

    public static void main(String[] args) {
        triangle triangleA= new triangle(15,10,15,5,5);
        triangle triangleB=new triangle(3,2.98,3,2,2);

       double triangleAArea= triangleA.FindArea();
       System.out.println(triangleAArea);

       double triangleBArea= triangleB.FindArea();
       System.out.println(triangleBArea);

       System.out.println(triangleA.base);
       System.out.println(triangleA.numofsides);

    }
}
