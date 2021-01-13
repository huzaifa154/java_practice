import java.util.Scanner;

public class while_loop {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Boolean Repeat= true;
        while (Repeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off repeat?");
            String UserInput= input.next();

            if (UserInput.equals("yes")) {
                Repeat=false;
            }
        }
        System.out.println("Playing Next Song");
    }
}
