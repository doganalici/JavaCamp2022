package stringsDemo;

public class Main {

	public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı = " + mesaj.length()); //mesajın kaç elemandan oluştuğunu belirtir
        System.out.println("5. eleman = " + mesaj.charAt(4)); //mesaj içerisindeki 4.indisi bulur
        System.out.println(mesaj.concat(" Yaşasın!")); //İlk string ile Yaşasın kelimesini birleştirir
        System.out.println(mesaj); //mesaj.concat yeni bir değişkene atanmadığı için asıl mesaj metni değişmez
        System.out.println(mesaj.startsWith("B")); //mesaj metninin B harfi ile başlayıp başlamadığını boolean olarak (True/False) gösterir
        System.out.println(mesaj.endsWith(".")); //mesaj metni nokta ile bitiyor mu diye kontrol edip boolean olarak gösterir
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); //mesaj içindeki ilk bulduğu a harfinin kaçıncı indis olduğunu gösterir gerisiyle ilgilenmez ve aramayı bitirir
        System.out.println(mesaj.lastIndexOf("e")); //lastIndexOf ile aramaya sağdan başlar fakat indis numarasını yine soldan sayarak hesaplar

        String yeniMesaj = mesaj.replace(' ', '-'); //boşlukları '-' işareti ile değiştirip düzenler
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2)); //2.indexten itibaren mesajı yazdırır
        System.out.println(mesaj.substring(2, 5)); //2.indexten itibaren mesajı kes ve 5.indise kadar yazdır (5. index dahil değildir)

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);    // split ile boşluk karakteri gördüğü her yerde metni parçaladı ve alt alta yazdı
        }

        System.out.println(mesaj.toLowerCase()); //Kelimenin bütün harflerini küçük harfe çevirir
        System.out.println(mesaj.toUpperCase()); //Kelimenin bütün harflerini büyük harfe çevirir

        System.out.println(mesaj.trim()); //kelimenin başında ve sonunda boşluk varsa bu boşlukları atarak metni yazar


	}

}
