public class Mago extends Personagem{
    double forca;

    // Constructor da classe utilizando o método super para adicionar valores aos atributos
    public Mago(String nome,
                int nivel,
                int pontosDeVida,
                double poderBase,
                double forca) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }


    //Override do método abstrato da classe Personagem
    @Override
    public String usarHabilidadeEspecial() {
        return classe + " " + nome + " lança Bola de Fogo!";
    }
}
