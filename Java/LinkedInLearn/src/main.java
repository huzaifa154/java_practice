import java.util.Scanner;
public class main {

    public static void main(String[] args) {
       int studentage = 15;
       double studentgpa = 3.45;
       boolean PerfectAtten = true;
       String StudentFName = "Huzaifa";
       String StudentLName = "Ali";
        char studentFirstIn = StudentFName.charAt(0);
        char studentLastIn = StudentLName.charAt(0);
        System.out.println(StudentFName+"'s" + " age: " +studentage);
        System.out.println("Did " + StudentFName + " have perfect attendence?: " + PerfectAtten);
        System.out.println(StudentFName + " " + StudentLName + " " + "(" + studentFirstIn + "." + studentLastIn + ")" + " has a GPA of " + studentgpa);
        System.out.println("what do you want to update it to?");
        Scanner input=new Scanner(System.in);
        studentgpa=input.nextDouble();
        System.out.println(StudentFName + " " + StudentLName + " now has a GPA of " +studentgpa);

    }
}
