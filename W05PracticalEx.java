import java.util.Scanner;

public class W05PracticalEx{

      
    public static void main(String[] args){

        //Asks user to choose
        Scanner choose = new Scanner(System.in);
        System.out.println("Choose conversion type: 1. Metric to Imperial   2. Imperial to metric");
        int option = choose.nextInt();

        //Use if-else to remove invalid input
        if (option >2 || option <= 0){
        System.out.println("Invalid input!");
        }   
        else{
        
            //Used switch to work on the user input
            switch (option) {
                case 1 : {
                    
                    Scanner read = new Scanner(System.in); //Asks user for input
                    System.out.println("Enter distance in metres ");
                    int distanceMetres = read.nextInt();

                    Converter MetrictoImperial = new Converter();
                    MetrictoImperial.convert(distanceMetres);
                    MetrictoImperial.print();        
                    break;
                }

                case 2 : { 

                    //Asked for the user input thrice
                    Scanner input1 = new Scanner(System.in);
                    System.out.print("Enter the yards part of the distance: ");
                    int distYards = input1.nextInt();

                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Enter the feet part of the distance: ");
                    int distFeet = input2.nextInt();
    
                    Scanner input3 = new Scanner(System.in);
                    System.out.print("Enter the inches part of the distance: ");
                    double distInches = input3.nextDouble();

                    //Create object to invoke operations from the ConverterEx class
                    ConverterEx ImperialToMetric = new ConverterEx(); //Object name: ImperialToMetric
                    ImperialToMetric.convert2(distYards, distInches, distFeet);
                    ImperialToMetric.print2();
                    
                    //No default statement
                }
            
            }  
        }

    }
}