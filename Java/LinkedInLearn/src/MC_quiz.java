import java.util.Scanner;

public class MC_quiz {
    public static void main(String[] args) {

        System.out.println("Which of the following car manufacturer's are German?");
        String ans1= "toyota";
        String ans2= "lexus";
        String ans3= "volkswagen";
        String ans4= "ford";
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        String CorrectAns=ans3;
        Scanner input=new Scanner(System.in);
        String UserInput=input.next();

        if (UserInput.toLowerCase().equals(CorrectAns)){
            System.out.println("You are Correct! Big Brain Moves");
        } else {
            System.out.println("You are a dumba** the correct answer is Volkswagen");
        }

    }
}
