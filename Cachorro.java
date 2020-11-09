public class Cachorro {
    private String Nome;
    private float Peso;
    private String Cor;

    public Cachorro() {

    }

    public Cachorro(String nome, float peso, String cor) {
      Nome = nome;
      Peso = peso;
      Cor = cor;
    }

    public void setNome(String nome) {
      Nome = nome;
    }

    public void setPeso(float peso) {
      Peso = peso;
    }

    public String getNome() {
      return Nome;
    }

    public float getPeso() {
      return Peso;
    }

    public void setCor(String cor) {
      Cor = cor;
    }

    public String getCor() {
      return Cor;
    } 

    public void latir() {
        System.out.println("O cachorro está latindo ...");
    }

    public void correr() {
        System.out.println("O cachorro está correndo ...");
    }   

    public void comer() {
      System.out.println("O cachorro está comendo ...");
    }
}