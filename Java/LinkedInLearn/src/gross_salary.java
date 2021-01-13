public class gross_salary {
    public static double totalsalary(double hoursperweek, double wageperhour, double vacationdays){
       if (hoursperweek <0){
           return -1;
       }
       if (wageperhour <0){
           return -1;
       }
       if (vacationdays <0){
           return -1;
       }
        double vacaydays= 8*wageperhour*vacationdays;
        double totalsalary= hoursperweek*wageperhour*52-vacaydays;
        return totalsalary;
    }

    public static void main(String[] args) {
       double salary= totalsalary(-31, 25,0);
        System.out.println(salary);
    }
}
