public class Main {
    public static void main(String[] args) {
        //Criação da personagem Arthemis instaciando o objeto e exibição de seus status.
        Personagem p1= new Personagem("Arthemis",
                "Arqueira",
                5,
                80,
                12.5);

        p1.exibirStatus();



        //Criação dO personagem Davi instaciando o objeto e exibição de seus status.
        Personagem p2= new Personagem("Davi",
                "Guerreiro",
                5,
                80,
                25);

        p2.exibirStatus();

    }
}

