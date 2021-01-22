/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuandm.dtos;

/**
 *
 * @author ASUS
 */
public class Cart {
    private int productid;
    private String productName;
    private String productImage;
    private double productPrice;
    private int productQuantity;
    private int quantity;
    private double totalPrice;

    public Cart() {
    }

    public Cart(int productid, String productName, String productImage, double productPrice, int productQuantity, int quantity, double totalPrice) {
        this.productid = productid;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" + "productid=" + productid + ", productName=" + productName + ", productImage=" + productImage + ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + ", quantity=" + quantity + ", totalPrice=" + totalPrice + '}';
    }

    
}
