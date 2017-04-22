/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author mre44
 */
public class CarportCalculator {
    
    double wigth;
    double length;
    boolean isFlat = true;    

    public CarportCalculator(double wigth, double length, boolean isFlat) {
        this.wigth = wigth;
        this.length = length;
        this.isFlat = true;
    }
    
    public double calculatePrice(){
        double result = (wigth * length) * 1000;
        
        if (!isFlat){
            result = (result * 1.2);
        }
        return result;
    }
    
    public int calculateParts(){
        
        double parts;
        parts = ((wigth * length) * 20) + 0.5 ; // adding 0.5 to be abble to add 
        
        return ((int) Math.round(parts));
    }
    
    
}
