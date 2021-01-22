/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuandm.dtos;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class ProductDTO {
    private int productID;
    private String productName;
    private double price;
    private String description;
    private String image;
    private int quantity;
    private Date create_date;
    private boolean status;

    public ProductDTO() {
    }

    public ProductDTO(int productID, String productName, double price, String description, String image, int quantity, Date create_date, boolean status) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.image = image;
        this.quantity = quantity;
        this.create_date = create_date;
        this.status = status;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProductDTO{" + "productID=" + productID + ", productName=" + productName + ", price=" + price + ", description=" + description + ", image=" + image + ", quantity=" + quantity + ", create_date=" + create_date + ", status=" + status + '}';
    }
 
    
}