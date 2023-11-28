public class Day {
    public static void main(String[] args) {

        dayNumber(9);


        /*
        Create a method named day that can display the name of the day
        based on the given number to the method, if the number is invalid,
        then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday

         */


    }

    public static void dayNumber(int number) {
        String Day;

        switch (number){
            case 1: Day = "Monday";
            break;
            case 2: Day = "Tuesday";
                break;
            case 3: Day = "Wednesday";
                break;
            case 4: Day = "Thursday";
                break;
            case 5: Day = "Friday";
                break;
            case 6: Day = "Saturday";
                break;
            case 7: Day = "Sunday";
                break;

            default: Day = "Invalid Number";


        }
        System.out.println(Day);

    }
}
