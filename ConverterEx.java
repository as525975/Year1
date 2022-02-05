import java.util.Scanner;

public class ConverterEx{
    
    double distMetres;
    int distFeet;
    double distInches;
    int distYards;

    public void convert2(int distYards, double distInches, int distFeet) { 
        //used this. to store the values in the variables declared globally and so that it is easier to print
        this.distFeet = distFeet;
        this.distInches = distInches;
        this.distYards = distYards;
        distFeet =  distYards*3;
        distInches = distFeet*12;
        distMetres = distInches/39.37008;
        distMetres = (int)Math.round(distMetres);

    }

    public void print2(){
        
        //Used two lines like the first task
        System.out.println(distYards + " yards, " + distFeet + " feet and " + (int)Math.round(distInches) + " inches in metres is: ");
        System.out.println((int)Math.round(distMetres) + " metres");
    }


}