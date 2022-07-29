package VendingMachines;

import Products.Product;

import java.util.ArrayList;

public class Drawer {

    Code code;
    int price;
    ArrayList<Product> products;

    public Drawer(Code code, int price) {
        this.code = code;
        this.price = price;
        this.products = new ArrayList<Product>();
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addOneProduct(Product product){
        this.products.add(product);
    }

    public void removeOneProduct() {
        if (this.products.size() > 0) {
            this.products.remove(0);
        }
    }
}
