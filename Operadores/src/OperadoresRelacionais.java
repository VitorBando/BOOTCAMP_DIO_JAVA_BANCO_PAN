public class OperadoresRelacionais {
    public static void main(String[] args) {
        
        String nomeUm = "Vitor";
        String nomeDois = new String("Vitor");

        System.out.println(nomeUm.equalsIgnoreCase(nomeDois));



        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        
        if (numero1 == numero2) {
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numero1 é igual o numero2? " +simNao);
        
        simNao = numero1 != numero2;
        
        System.out.println("numero1 é diferente do numero2? " +simNao);
        
        simNao = numero1 > numero2;
        
        System.out.println("numero1 é maior que o numero2? " +simNao);
        
        simNao = numero1 < numero2;
        
        System.out.println("numero1 é menor que o numero2? " +simNao);
    }
    
}
