import java.util.Scanner;

public class Converter{

    double distanceInches;
    int distanceYards;
    int feet;
    int remInches;
    String y = "y";
    String f = "f";
    String i = "i";
    String d = "d";
    int distanceMetres;
     
    
    // Defines method for conversion. It is a void as it doesn't need to return anything.
    //Some problem with the calculation
    public void convert(int distanceMetres){

        this.distanceMetres = distanceMetres;
        //double 
        distanceInches = distanceMetres*39.37008 ;//Converts the distance in metres to inches
        //int 
        distanceYards = (int)Math.round(distanceInches)  /36;
        //int 
        remInches = (int)Math.round(distanceInches)-(distanceYards*36);
        //int 
        feet = (int)Math.round(remInches)/12;
        
        remInches = remInches - (feet*12);
        
    }
    
    //Method to print the final converted distance.
    public void print(){
                                  
        //Used switch statement for different cases 
        switch (feet) {
            
            case 0 :    {
                            f = "";                            
                            break;
                        }

            case 1 :    {
                            f =  feet + " foot ";
                            break;
                        }

            default :   {
                            f = feet + " feet ";
                            break;
                        }                          
        }

        switch (distanceYards) {

            case 0 :    {
                            y = "";
                            break;
                        }

            case 1 :    {
                            if (feet >= 1) {
                                y = distanceYards + " yard, ";
                            }
                            else {
                                y = distanceYards + " yard ";
                            }   
                            break;
                        }
            
            default :   {
                            //Added an if-else statement to factor in the punctuation
                            if (feet >= 1){
                                y = distanceYards + " yards, ";
                            }
                            else {
                                y = distanceYards + " yards ";
                            }
                            break;
                        }            
        }

        
        // Added spaces in the string itself to keep the grammar correct
        
        if (remInches == 1) {
            i = remInches + " inch";
        }
        else if (remInches <=0) {
            y = distanceYards + " yards and ";
            i = "";
        }
        else {
            i = "and "  + remInches + " inches";
        }
        
        switch(distanceMetres) {
            
            case 0 :     {
                          d = distanceMetres +  " metres" ;
                          break; 
                        }
            case 1 :     {
                          d = distanceMetres + " metre";
                          break;
                        }
            default :    { 
                          d = distanceMetres + " metres";
                          break;
                        }                        
            }                        
        
        
        //Can't print the user input

        System.out.println(d + " in yards, feet and inches is: " );
        System.out.println(y  + f  + i + " ");
    
    }
        
}
    
    
    