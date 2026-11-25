package usingswitch;
import java.util.Scanner;
public class Shopping {
	public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the category of the products you would like to purchase:");
        System.out.println("Categories are:\n Electronics \n Clothing \n Books \n Groceries" );
        String cat=object.nextLine();
        switch(cat) {
        case "Electronics":{
        	System.out.println("Products of Electronics are:\n Fridge \n Washing Machine \n Television" );
        	System.out.println("Select the product you would like to purchase:");
            String prod=object.nextLine();
            switch(prod) {
            case "Fridge":
            	double p=1000;
            	System.out.println("Select number of products you would like to purchase:");
            	int n=object.nextInt();
            	double total_price=p*n;
            	System.out.println("Total price= "+total_price+" AED");
            	break;
            case "Washing Machine":
            	double p1=700;
            	System.out.println("Select number of products you would like to purchase:");
            	int n1=object.nextInt();
            	double total_price1=p1*n1;
            	System.out.println("Total price= "+total_price1+" AED");
            	break;
            case "Television":
            	double p2=1000;
            	System.out.println("Select number of products you would like to purchase:");
            	int n2=object.nextInt();
            	double total_price2=p2*n2;
            	System.out.println("Total price= "+total_price2+" AED");
            	break;
            default:
            	System.out.println("Invalid product");
            	break;}
            break;
            }
        case "Clothing":{
        	System.out.println("Products of Clothing are: \n Traditional wear \n Summer clothes \n Swim wear");
        	System.out.println("Select the clothing product you would like to purchase:");
            String prod1=object.nextLine();
            switch(prod1) {
            case "Traditional wear":
            	double p=300;
            	System.out.println("Select number of products you would like to purchase:");
            	int n=object.nextInt();
            	double total_price=p*n;
            	System.out.println("Total price= "+total_price+" AED");
            	break;
            case "Summer clothes":
            	double p1=150;
            	System.out.println("Select number of products you would like to purchase:");
            	int n1=object.nextInt();
            	double total_price1=p1*n1;
            	System.out.println("Total price= "+total_price1+" AED");
            	break;
            case "Swim wear":
            	double p2=100;
            	System.out.println("Select number of products you would like to purchase:");
            	int n2=object.nextInt();
            	double total_price2=p2*n2;
            	System.out.println("Total price= "+total_price2+" AED");
            	break;
            default:
            	System.out.println("Invalid product");
            	break;}
            break;
            }
        case "Books":{
        	System.out.println("Types of Books available are: \n Novels \n Encyclopedia \n Children's books");
        	System.out.println("Select the type of book you would like to purchase:");
            String prod2=object.nextLine();
            switch(prod2) {
            case "Novels":
            	double p=80;
            	System.out.println("Select number of products you would like to purchase:");
            	int n=object.nextInt();
            	double total_price=p*n;
            	System.out.println("Total price= "+total_price+" AED");
            	break;
            case "Encyclopedia":
            	double p1=100;
            	System.out.println("Select number of products you would like to purchase:");
            	int n1=object.nextInt();
            	double total_price1=p1*n1;
            	System.out.println("Total price= "+total_price1+" AED");
            	break;
            case "Children's books":
            	double p2=50;
            	System.out.println("Select number of products you would like to purchase:");
            	int n2=object.nextInt();
            	double total_price2=p2*n2;
            	System.out.println("Total price= "+total_price2+" AED");
            	break;
            default:
            	System.out.println("Invalid product");
            	break;}
            break;
            }
        case "Groceries":{
        	System.out.println("Types of groceries available are:\n Milk \n Vegetables \n Bread");
        	System.out.println("Select the grocery item you would like to purchase:");
            String prod3=object.nextLine();
            switch(prod3) {
            case "Milk":
            	double p=15;
            	System.out.println("Select number of products you would like to purchase:");
            	int n=object.nextInt();
            	double total_price=p*n;
            	System.out.println("Total price= "+total_price+" AED");
            	break;
            case "Vegetables":
            	double p1=10;
            	System.out.println("Select number of products you would like to purchase:");
            	int n1=object.nextInt();
            	double total_price1=p1*n1;
            	System.out.println("Total price= "+total_price1+" AED");
            	break;
            case "Bread":
            	double p2=5;
            	System.out.println("Select number of products you would like to purchase:");
            	int n2=object.nextInt();
            	double total_price2=p2*n2;
            	System.out.println("Total price= "+total_price2+" AED");
            	break;
            default:
            	System.out.println("Invalid product");
            	break;}
            break;
            }
        default:
        	System.out.println("Invalid category");
        	break;
        }
        object.close();
	}
}
