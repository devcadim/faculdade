public class Mago extends Personagem{
    double forca;

    public Mago(String nome,
                int nivel,
                int pontosDeVida,
                double poderBase,
                double forca) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    @Override
    public String usarHabilidadeEspecial() {
        return classe + " " + nome + " lança Bola de Fogo!";
    }
}
