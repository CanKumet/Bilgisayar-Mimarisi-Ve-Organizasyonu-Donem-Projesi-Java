import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class __21010310010_main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        File file = new File("Ram.txt");
        Scanner sc = new Scanner(file);
        System.out.println("Ram.txt Okundu.");

        _21010310010_Buyruklar buyruklar = new _21010310010_Buyruklar();
        _21010310010_Decoder3x8 decoder3x8 = new _21010310010_Decoder3x8();
        _21010310010_Decoder4x16 decoder4x16 = new _21010310010_Decoder4x16();
        _21010310010_SequenceCounter counter = new _21010310010_SequenceCounter();

        while(sc.hasNextLine()) {
            String buyrukTablosu = sc.nextLine();
            String buyruk = buyruklar.BuyruklarıAlma(buyrukTablosu);

            String IElemanı = buyrukTablosu.substring(0, 1);
            String Dbiti = buyrukTablosu.substring(1, 4);
            String adres = buyrukTablosu.substring(4, 16);

            String[] Dbit = decoder3x8.decode(Dbiti);
            String[] satırSayisi = decoder4x16.decoder(counter.getCountInBinary());

            System.out.println("T" + satırSayisi[0] + " zamanında I=" + IElemanı + " D"+ Dbit[0] + " aktif IR(11-0)= " + adres + " buyruk = " + buyruk);
            Thread.sleep(1000);
        }

    }
}
