public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        

        String meuNome = "Vitor Bando";

        double salarioMinimo = 2500.33;
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        
        int numero1 = 1;
        numero1 = 2;
        
        int numero2 = 5;
        
        numero2 = 10;
        
        System.out.println(numero2);
        
        final double VALOR_DE_PI = 3.14;
        
        //VALOR_DE_PI = 10.33;
        
        System.out.print("Meu nome é: " + meuNome + 
                        "\nO salario minimo é: " + salarioMinimo +
                        "\nO numero curto é: " + numeroCurto2 +
                        "\nNumero um é: " + numero1 +
                        "\nE o valor de PI é: " + VALOR_DE_PI);
        
        
    }
}
