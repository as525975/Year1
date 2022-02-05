import java.util.Scanner;

public class W05Practical{
 
    
    

    //Can't reference a non-static variable in the static main method.
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in); //Asks user for input
        System.out.println("Enter distance in metres ");
        int distanceMetres = reader.nextInt();
        
        //This if statement only calls the methods if the input is valid 
        if (distanceMetres <= 0) {
            System.out.println("Invalid input!");
        }
        else{
        
        //Created an object to invoke methods from the converter class
        Converter imperial = new Converter();    //Object name: imperial
        imperial.convert(distanceMetres);
        imperial.print();
       
        //Invoked both the methods from the converter class. 
        }
        

    }
}