/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author 张睿哲
 */
public class ProductInfo {
    private String prodName;
    private int prodAvailability;
    private double prodPrice;
    private String prodDescription;

    public ProductInfo(String name,int availability,double price,String description)
    {
        this.prodName=name;
        this.prodAvailability=availability;
        this.prodPrice=price;
        this.prodDescription=description;
    }
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdAvailability() {
        return prodAvailability;
    }

    public void setProdAvailability(int prodAvailability) {
        this.prodAvailability = prodAvailability;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDecription(String prodDescription) {
        this.prodDescription = prodDescription;
    }
    
    @Override
    public String toString()
    {
        return this.prodName;
    }
    
}
