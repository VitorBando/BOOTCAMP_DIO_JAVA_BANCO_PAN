import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fat = scan.nextInt();
        int multi = 1;

        System.out.print(fat + "! = ");
        for(int i = fat ; i >= 1 ; i -- ){
            multi = multi * i;
        }
        
        System.out.println(multi);

        scan.close();
    }
}
