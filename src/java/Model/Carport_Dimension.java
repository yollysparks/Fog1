/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;

/**
 *
 * @author felesiah
 */
public class Carport_Dimension {
    // the instance variables
    private double length, width;

   
    public double getLength() {
        return length;
    }

    
//    public void setLength(Scanner scan) {
//    System.out.print("Enter length");
//    this.length = scan.nextDouble();
//    }
   
    public double getWidth() {
        return width;
    }

    
//    public void setWidth(Scanner scan) {
//    System.out.print("Enter width");
//    this.width = scan.nextDouble();
//    }

       public Carport_Dimension(Carport_Dimension carportDimensions)
        {

        }
    
    
    public double getArea() {
        // A = w * l
        return width * length;
    }

    @Override
    public String toString() {
        return "Carport_Dimension{" + "length=" + length + ", width=" + width + '}';
    }
    
}
