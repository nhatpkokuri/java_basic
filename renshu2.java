import java.util.Scanner;
public class renshu2 {
    public static void main(String[] args) {
        System.out.println("あなた何歳ですか　？");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("あなたのなは　：");
        Scanner scan2 = new Scanner(System.in);
        int num = scan1.nextInt();
        String txt = scan2.next();
        System.out.println(txt + "さん"+num + "歳") ;
        scan1.close();
        scan2.close();



    }
}