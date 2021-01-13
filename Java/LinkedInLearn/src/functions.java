import java.util.Scanner;
public class functions {
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }
        public static void main(String[] args){
            System.out.println("welcome to your interview!");

            announceDeveloperTeaTime();

            System.out.println("Write code here");
            System.out.println("Review code here");

            announceDeveloperTeaTime();
        }
}
