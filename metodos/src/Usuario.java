public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        

        // System.out.println("Tv ligada? " + smartTv.ligada);
        // System.out.println("Canal atual: " + smartTv.canal);
        // System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(35);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
    }
}
