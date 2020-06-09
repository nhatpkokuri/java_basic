import java.util.Scanner;
public class javaScanner {
    public static void main(String[] args) {
        //Scanner
        Scanner scan = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        System.out.println("チケットの枚数を入力ください：");
        int count = scan.nextInt();
        int money = 660*count;
        System.out.println("大人" + count + "枚の料金" + money + "円");
        System.out.println("名前入力ください：");
        String data = sd.next();
        String s = "こんにちは " + data + "さん";
        System.out.println(s + data);

        scan.close();
        sd.close();
        

    }
}