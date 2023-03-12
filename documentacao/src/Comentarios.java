

public class Comentarios {
    public static void main(String[] args) {
        // Olá eu sou um comentário e uma única linha

        /*
         * Eu sou um comentário 
         * que posso ser detalhado
         * quando necessário
         */

    }


    /*
     * Esse método foi feito com pressa
     * por isso foi abreviado o nome das
     * variaveis, ele tem a finalidade de 
     * somar ou multiplicar dois números
     */
    public int somaMultiplica (int n, int x, String m){
        int r = 0;
        if (m == "M") {
            r = n * x;            
        } else {
            r = n + x;
        }
        return r;
    }
    /**
     * Essas duas estrelinhas consideram uma documentação da linguagem
     */
    public void metodo(){

    }
}
