package kosulDeneme;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
	        int a,b;

	        System.out.println("A sayısını girin : ");
	        a=scanner.nextInt();

	        System.out.println("B sayısını girin : ");
	        b=scanner.nextInt();

	        System.out.println("Girilen A sayısı : "+a);
	        System.out.println("Girilen B sayısı : "+b+"\n");

	        System.out.println("A + B = "+ (a+b));
	}

}
