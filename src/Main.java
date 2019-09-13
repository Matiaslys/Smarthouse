public class Main {
    public static void main(String[] args){
        Remote tv1 = new Remote();
        tv1.tv = true;
        tv1.start();
        if (tv1.tv == true) {
            System.out.println("tv'et er nu tændt");
        } else {
            System.out.println("tv'et er slukket");
        }
        Remote termostat = new Remote();
        // her fortæller jeg hvor varmt det er og personen vil så have mulighed for at ændre tempuratur.
        System.out.println("dit indeklima er " + termostat.termostat + " grader");
    }
}
