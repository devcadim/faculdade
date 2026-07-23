public class Personagem {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    //Método para exibir o status
    void exibirStatus() {
        System.out.println("======== Exibição de Status =======");
        System.out.println("Nome: " + nome +
                "\nClasse: " + classe +
                "\nNível: " + nivel +
                "\nPontos de Vida: " + pontosDeVida +
                "\nPoder Base: " + poderBase);
    }

    //Constructor para facilitar a criação dos personagens
    public Personagem(String nome,
                      String classe,
                      int nivel,
                      int pontosDeVida,
                      double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;

    }
}
