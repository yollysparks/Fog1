/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author felesiah
 */
public class Carport {
    private Carport_Dimension carportDimension;
    private double carportCost;

    public Carport(Carport_Dimension carportDimension, double carportCost) {
        this.carportDimension = carportDimension;
        this.carportCost = carportCost;
    }

    public Carport(Carport carportPrice) {
    }
    
     public double getTotalCost() 
        {
            return carportCost * carportDimension.getArea();
        }
     public Carport_Dimension getSize()
        {
            return carportDimension;
        } 
     public double getCarportCost()
        {
            return carportCost;
        }

    @Override
    public String toString() {
        return "" + carportDimension + ", Carport cost per square feet = dkk" + carportCost + ", " + "Total cost = dkk" + getTotalCost() + "";
    }
     
}
