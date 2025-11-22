import java.util.Scanner;
public class RickshawFare
{
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    double basefare=100.00;
    double rateperkm=20.00;
    double ratepermin=2.0;
    
    System.out.println("-------------Rickshaw Fare Rules----------------");
    System.out.println("BASE FARE="+basefare);
    System.out.println("RATE PER KILOMETER="+rateperkm);
    System.out.println("RATE PER MINUTES="+ratepermin);
    
    System.out.println("-------------Rickshaw Fare Input-------------");
    System.out.println("Enter the distance in kilometer:");
    double km= scan.nextDouble();
    
    System.out.println("Enter the time in minutes:");
    double time= scan.nextDouble();
    
    double totalfare= basefare+(km*rateperkm)+(time*ratepermin);
    System.out.println("Total fare for traveller="+totalfare);
    
    System.out.println("------------Rickshaw Fare Calculator------------");
    scan.nextLine(); 
    System.out.println("Is the traveller local?(Yes/No) \n");
    String local= scan.nextLine();
    double disforlocal= (0.10*totalfare); //10% of totalfare
    double totaldis= (local.equals("Yes"))? disforlocal: 0.0;
    System.out.println("Your total discount is Rs.="+totaldis);

    System.out.println("Are you a night traveller?(Yes/No) \n");
    String night= scan.nextLine();
    double nightrate= (0.20*totalfare); //20% of totalfare
    double surcharge= (night.equals("Yes"))? nightrate: 0.0;
    
    double Final= (totalfare-totaldis+surcharge);
    System.out.println("Your final fare= "+Final);
    System.out.println("------------------------------------------------");
}
}