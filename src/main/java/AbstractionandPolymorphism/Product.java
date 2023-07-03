package main.java.AbstractionandPolymorphism;

public class Product
{
    double price =25.245;
    public Double getPrice() {
        return price;
    }
    public Double getPrice(int Quantity)
    {
        return price*Quantity;
    }
    public Double getPrice(int Quantity1, int Quantity2)
    {
        return price*(Quantity1+Quantity2);

    }


    public Double setPrice(double p) {
        return p;
    }
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println("price before change is: "+p.getPrice());
        System.out.println("price after change is: "+p.setPrice(27.21));
        System.out.println("price before change with given quantity is: "+p.getPrice(10));
        System.out.println("price before change with given quantity is: "+p.getPrice(1,2));
    }


}
