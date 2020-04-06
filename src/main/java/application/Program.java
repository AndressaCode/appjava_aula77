package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                
        System.out.println("-=Product Data=-");
        System.out.printf("%n");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        
        Product product = new Product(name, price);
        
        System.out.print("Product data: " + product);
        
        System.out.printf("%n%n");
        
        System.out.print("Number of products to be added in the stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);
        
        System.out.print("Updated data: " + product);
        
        System.out.printf("%n%n");
        System.out.print("Number of products to be removed from the stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.print("Updated data: " + product);
        
        sc.close();
    
    }    
}
