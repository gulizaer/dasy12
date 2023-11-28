public class eligibileTovote {
    public static void main(String[] args) {

        eligibleTovote(35, true);


        /*
        Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote

         */
    }

    public static void eligibleTovote(int age, boolean isGermany) {

        if(age >= 18 && isGermany){
            System.out.println("You are eligible to vote");

        }else {
            System.out.println("You are not eligible to vote");}

    }

}
