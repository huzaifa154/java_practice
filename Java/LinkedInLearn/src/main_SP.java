public class main_SP {
    public static void main(String[] args) {
        student_profile student1 = new student_profile("Huzaifa", "Ali", "Comp ENG", 3.5, 2023);
        student_profile student2 = new student_profile("Hamzah", "Ali", "High School", 3.5, 2023);

        student2.incrementgradyear();
        System.out.println(student2.gradyear);
    }
}

