public class Main {
    public static void main(String args[]) {
        Computador pcFodao = new Computador(false, "Intel Core i5", 8);
        Computador pcFodao1 = new Computador();

        pcFodao.ligar();
        
        pcFodao1.setLigado(true);
        pcFodao1.setMemoria(16);
        pcFodao1.setProcessador("intel core i9");
        
        System.out.println("pcFodao ");
        System.out.println("pc esta ligado? " + pcFodao.isLigado());
        System.out.println("processador: " + pcFodao.getProcessador());
        System.out.println("memoria ram: " + pcFodao.getMemoria() + "GB");
        
        System.out.println("pcFodao1 ");
        System.out.println("pc esta ligado? " + pcFodao1.isLigado());
        System.out.println("processador: " + pcFodao1.getProcessador());
        System.out.println("memoria ram: " + pcFodao1.getMemoria() + "GB");

        pcFodao1.desligar();

         System.out.println("\n");

        Gato Cat = new Gato("Bob", 7, "Amarelo");
        Gato Cat1 = new Gato();
        
        Cat1.miar();

        Cat1.setNome("Bob ");
        Cat1.setPeso(7);
        Cat1.setCor("Amarelo ");

        System.out.println("Gato ");
        System.out.println("Nome: " + Cat1.getNome());
        System.out.println("Peso: " + Cat1.getPeso());
        System.out.println("Cor: " + Cat1.getCor());

        Cat1.correr();
        Cat1.comer();

        System.out.println("\n");

        Cachorro Dog = new Cachorro("Bob", 7, "Marrom");
        Cachorro Dog1 = new Cachorro();
        
        Dog1.latir();

        Dog1.setNome("Bob ");
        Dog1.setPeso(7);
        Dog1.setCor("Marrom");

        System.out.println("Cachorro ");
        System.out.println("Nome: " + Dog1.getNome());
        System.out.println("Peso: " + Dog1.getPeso());
        System.out.println("Cor: " + Dog1.getCor());

        Dog1.correr();
        Dog1.comer();
    }
}