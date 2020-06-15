package renshu6;
import java.util.Scanner;
public class practice_9 {
    public static void main(String[] args) {
        try {
            Scanner nc = new Scanner(System.in);
            System.out.println("月、火、水、木、金、土、日一つ入力ください："); 
            String txt = nc.next();
            switch (txt) {
            case "月":
                System.out.println("ようやくが可能");    
                break;
            case "火":
                System.out.println("休診");
                break;
            case "水":
                System.out.println("ようやくが可能");
                break;
            case "木":
                System.out.println("ようやくが可能");
                break;
            case "金":
                System.out.println("休診");
                break;
            case "土":
                System.out.println("ようやくが可能");
                break;
            case "日":
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