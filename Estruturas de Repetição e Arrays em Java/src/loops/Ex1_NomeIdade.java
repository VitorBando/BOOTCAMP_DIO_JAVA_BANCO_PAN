import java.util.Scanner;

/**
 * @author Vitor Bando
 * @version 19.0.1
 * @since 03/03/2023
 */

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;

        while (true) {
            
            System.out.println("Digite seu nome:"  );
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Digite seu idade:"  );
            idade = scan.nextInt();
            System.out.print("Nome: " + nome + "\nIdade: "+ idade);
        }
        
        System.out.println("Continua aqui...");
        
        scan.close();
    }
}
