public class Main {
    public static void main(String[] args) {
        //Criação da personagem Arthus instaciando o objeto e exibição de seus status.
        Guerreiro p1= new Guerreiro("Arthus",
                20,
                5,
                80,
                25);

        //Criação dO personagem Davi instaciando o objeto e exibição de seus status.
        Mago p2 = new Mago("Elenara",
                20,
                5,
                80,
                25);

        //Criação do array dos objetos criados
        Personagem[] personagens = {p1, p2};

        for(Personagem p : personagens) {
            System.out.println(p.usarHabilidadeEspecial());
        }

    }
}

