public class Salary {
    public static void main(String[] args) {


        CalculateSalary(34, 7);
        /*
        Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0

         */
    }

    public static void CalculateSalary(double hourlyRate, int weeklyHours) {
        double salary = hourlyRate*weeklyHours*52;

        System.out.println("You Name $" + hourlyRate +"per hours");
        System.out.println("You Work " + weeklyHours + "hours per week");
        System.out.println("Your gross incomee is $" + salary);

    }
}
