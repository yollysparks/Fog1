/*
 * Diclaimer: This is a class that assumes that
 * the carport is acctually composed of just the same part.
 * Imagine a lego with hundreds of the same lego brick.
 * We assume that the price of a single part is 50 kr.
 * This class is neither SOLID nor tested well enough.
 *
 * What is this class supposed to at the end of the project: It will calculate
 * all the need parts, and it will return a list of all of the individula parts
 * their exact number, single and total price(of a batch of the same part),
 * as well the final price of all of them, according to their value in 
 * the database;
 */
package Utilities;

/**
 *
 * @author mre44
 */
public class CarportCalculator {
    
    double wigth;
    double length;
    boolean isFlat; //  This valuse is used to check if the rooftop is falt or not.

    public CarportCalculator(double wigth, double length, boolean isFlat) {
        this.wigth = wigth;
        this.length = length;
        this.isFlat = isFlat;
    }
    
    /*
    This method calculate the final price of the shed, based on all the parts
    that will be needed to build the carport, accordin to its wight and lenght.
    We assume that a single part costs 50 kr. In case the roof is nonflat (naming ?)
    We call a separate method to calculate those prices ass well.
    */
    public double calculatePrice(){  
        double priceOfAPart = 50;
        
        return (calculateParts() * priceOfAPart);
    }
    
    
    /*
    Used to calculate the needed parts. Can be called later, to list the exact
    number of parts
    */
    public int calculateAllParts(){
        if (!isFlat){
            return (calculateParts() + calculateBigRoofParts());
        }
        return calculateParts();
    }
    /*
    This method calculate the parts need under the assumption, that each
   single meter of length it will take 10 parts to build, while each single
    meter of wigth will take 30 parts to build.
    The Math.ceil(Double n) rounds a double number to the next round double.
    For example a double value of 2.1 will return 3.0 , but a value of 4.0
    will stay 4.0. And then we cast it to int. We do this, to make sure, that the
    client of the company will get the extra parts, that they will need to "cut"
    */
    public int calculateParts(){
        
        double lengthParts, wightParts = 0;
        lengthParts = (length * 20); // adding 0.5 to be abble to add 
        wightParts = (wigth * 20);
        return ((int)Math.ceil(lengthParts + wightParts));
    }
    
    
    /*
    This method is used to calculate the numbers of parts, that will be needed
    for the non-flat (names ?) rooftop. It assumes that each square meter takes 
    the same amount of parts to build.
    Math.ceil is used again, for the same reason as in the previous class.
    */
    public int calculateBigRoofParts(){
        double sizeOfRoof = wigth * length;
       int partsPerSquareMeter = 100;
       
       /*
       The 0.5 allue is added to 
       */
       return (int) Math.ceil(sizeOfRoof * partsPerSquareMeter);
    }
    
}
