
public class OperadoresBasico {
    public static void main(String[] args) throws Exception {
        
        String nome = "Vitor";
        int idade = 23;
        double peso = 70.40;
        char sexo = 'M';
        boolean doadorOrgao = false;
        /*
        atribuição do tipo construtor, ainda sera abordado durante o curso
        Date dataNascimento = new Date();
        */

        double soma = 10.2 + 15.7;
        int subtracao = 10 - 9;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);
        
        System.out.print("Nome: " + nome +
                        "\nIdade: " + idade +
                        "\nPeso: " + peso + 
                        "\nSexo: " + sexo +
                        "\nDoador: " + doadorOrgao);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Modulo: " + modulo);
        System.out.println("Resultado: " + resultado);


        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
        
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+1+"1"+1;
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);


    }
}
