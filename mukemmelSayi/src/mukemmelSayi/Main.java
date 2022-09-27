package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		  //6  --> 1,2,3 (1+2+3 = 6)
        //28 --> 1,2,4,7,14 (1+2+4+7+14 = 28)

        int number = 496;
        int total = 0;
        System.out.println(number+" sayısının bölenleri :");
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                System.out.print(i + " ");
                total += i;
            }
        }
        System.out.println("\n");
        System.out.println(number+" sayısının bölenlerinin toplamı : "+total+" olur.Bu yüzden;");
        if (total == number) {
            System.out.println(number + " sayısı muhteşem sayıdır.");
        } else {
            System.out.println(number + " sayısı muhteşem sayı değildir.");
        }

	}

}
