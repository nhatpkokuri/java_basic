import java.util.Scanner;
public class renshu5 {
    public static void main(String[] args) {
        try {
            System.out.println("パスワード登録：");
            Scanner sc = new Scanner(System.in);
            int pass = sc.nextInt();
            if (pass>999&&pass<100000000) {
                System.out.println("パスワード登録しました。");
            }else{
                System.out.println("もう一度やり直してください");
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("入力数値が誤りです");
        }
        












        
    }
}