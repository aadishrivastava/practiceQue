package dev.lpa;
import java.util.*;
public class Main434 {
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Product[] product=new Product[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            String name=sc.next();
            double price=sc.nextDouble();
            double discount=sc.nextDouble();
            product[i]=new Product(id,name,price,discount);
        }

        double minPrice=Double.MAX_VALUE;
        String str=null;
        for(int i=0;i<n;i++){
            if(str==null || product[i].getFinalPrice()<minPrice){
                minPrice=product[i].getFinalPrice();
                str=product[i].getName();
            }else if(product[i].getFinalPrice()==minPrice){
                String s=product[i].getName();
                if(s.compareTo(str)<1){
                    str=s;
                }
            }
        }
        System.out.println(str+" "+minPrice);
    }
}
class Product{
    private int id;
    private String name;
    private double price;
    private double discount;

    public Product(int id, String name, double price, double discount){
        this.id=id;
        this.name=name;
        this.price=price;
        this.discount=discount;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double getDiscount(){
        return discount;
    }

    public double getFinalPrice(){
        return (price - (price * discount / 100));
    }
}
