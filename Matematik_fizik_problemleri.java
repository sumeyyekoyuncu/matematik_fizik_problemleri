
import java.util.Scanner;


public class Matematik_fizik_problemleri {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String islemler="*****islemler*****\n"+"1.daire alani hesaplama\n"+"2.ucgen cevresi hesaplama\n"+
                "3.vektorlerin ic carpimini bulma\n"+"4.programdan cik...\n";
        while (true) { 
            System.out.println(islemler);
            String islem=scanner.nextLine();
            
            if(islem.equals("4")){
                System.out.println("programdan cikiliyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("dairenin yaricapi: ");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                problem.matematik.daire_alan(yaricap);
            }
            else if(islem.equals("2")){
                System.out.println("ucgenin kenarlarini giriniz: ");
                int kenar1=scanner.nextInt();
                int kenar2=scanner.nextInt();
                int kenar3=scanner.nextInt();
                scanner.nextLine();
                problem.matematik.ucgen_cevresi(kenar1, kenar2, kenar3);
            }
            else if(islem.equals("3")){
                Vec vec1=new Vec("vektor1");
                Vec vec2=new Vec("vektor2");
                problem.fizik.iccarpim(vec1, vec2);
            }
            else{
                System.out.println("gecersiz islem...");
            }
        }
    }
}
