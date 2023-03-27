import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[] randomNum = new int[20];

        for(int i = 0 ; i < randomNum.length ; i++){
            int numero = random.nextInt(100);
            randomNum[i] = numero;
        } 
        
        System.out.print("\nNumeros Sucessores: ");
        for (int numero : randomNum) {
            System.out.print((numero+1) + " ");
        }

        System.out.print("\nNumero   Aleatorios: ");
        for (int numero : randomNum) {
            System.out.print(numero + " ");
        }
        
        System.out.print("\nNumeros antecessores: ");
        for (int numero : randomNum) {
            System.out.print((numero-1) + " ");
        }
    }
}
