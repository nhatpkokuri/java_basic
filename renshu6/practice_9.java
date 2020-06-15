package renshu6;
import java.util.Scanner;
public class practice_9 {
    public static void main(String[] args) {
        try {
            Scanner nc = new Scanner(System.in);
            System.out.println("月、火、水、木、金、土、日一つ入力ください："); 
            String txt = nc.next();
            switch (txt) {
            case "月曜日":
            case "水曜日":
            case "木曜日":
            case "土曜日":
                System.out.println("ようやくが可能");    
                break;
            case "日曜日":
            case "金曜日":
            case "火曜日":
                System.out.println("休診");
                break;
            default:
                System.out.println("正しく入力ください");
                break;
            }
            nc.close();
        } catch (Exception e) {
           System.out.println("もう一度入力ください");
        }
    }
}