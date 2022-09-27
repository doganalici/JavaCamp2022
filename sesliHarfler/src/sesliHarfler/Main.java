package sesliHarfler;

public class Main {
	 public static void main(String[] args) {
	        char harf = 'k';

	        switch (harf) {
	            case 'A', 'a':
	            case 'I', 'ı':
	            case 'O', 'o':
	            case 'U', 'u':
	                System.out.println("Kalın sesli harf");
	                break;
	            case 'E','e':
	            case 'İ','i':
	            case 'Ö','ö':
	            case 'Ü','ü':
	                System.out.println("İnce sesli harf");
	                break;
	            default:
	                System.out.println("Sessiz bir harf girişi yapıldı");
	        }

	    }
}
