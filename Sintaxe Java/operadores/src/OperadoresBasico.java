import java.sql.Date;

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
