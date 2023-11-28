public class month {
    public static void main(String[] args) {

       MonthNumber("March");
        /*
        Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
         */
    }

    public static void MonthNumber(String month) {
        String monthnumber= "";

        switch (month){

            case "January": monthnumber= " is 31 day";
            break;
            case "Fabruary": monthnumber= " is 28 day";
                break;
            case "March": monthnumber= " is 31 day";
                break;
            case "April": monthnumber= " is 30 day";
                break;
            case "May": monthnumber= " is 31 day";
                break;
            case "June": monthnumber= " is 30 day";
                break;
            case "July": monthnumber= " is 31 day";
                break;
            case "August": monthnumber= " is 31 day";
                break;
            case "September": monthnumber= " is 30 day";
                break;
            case "October": monthnumber= " is 31 day";
                break;
            case "Novemvber": monthnumber= " is 30 day";
                break;
            case "December": monthnumber= " is 31 day";
                break;

            default:
                System.err.println("Invalid Number");






        }
        System.out.println(month+ monthnumber);

    }
}
