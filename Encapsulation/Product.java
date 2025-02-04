package Techmm;

public class Product {
    private String Productname;
    private int Productid;
    private int Productprice;

    Product(String Productname, int Productid, int Productprice){
        this.Productname = Productname;
        this.Productid = Productid;
        this.Productprice = Productprice;
    }
    public String getProductname() {
        return Productname;
    }
    public void setProductname(String Productname) {
        this.Productname = Productname;
    }
    public int getProductid() {
        return Productid;
    }
    public void setProductid(int Productid) {
        this.Productid = Productid;
    }
    public int getProductprice() {
        return Productprice;
    }
    public void setProductprice(int Productprice) {
        this.Productprice = Productprice;
    }
    public void displayProduct(){
        System.out.println("Product Name: " + Productname);
        System.out.println("Product ID: " + Productid);
        System.out.println("Product Price: " + Productprice);
    }
}


