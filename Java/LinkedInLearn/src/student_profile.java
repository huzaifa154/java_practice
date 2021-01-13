public class student_profile {
    String FirstName;
    String LastName;
    String DeclaredMajor;
    double gpa;
    int gradyear;

    public student_profile(String FirstName, String LastName, String DeclaredMajor, double gpa, int gradyear){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.DeclaredMajor=DeclaredMajor;
        this.gpa=gpa;
        this.gradyear=gradyear;
    }
    public void incrementgradyear(){
    this.gradyear=this.gradyear+1;
    }
}
