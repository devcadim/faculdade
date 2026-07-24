import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Personagem> membros = new ArrayList<>();

    public List<Personagem> listarPersonagens() {
        return membros;
    }

    public void adicionarPersonagem(Personagem personagem) {
        membros.add(personagem);
    }

    public void batalhar(Personagem a, Personagem b) {
        if(a.poderTotal > b.poderTotal) {
            System.out.println(a.classe + " " + a.nome + " venceu! | Poder total: " + a.poderTotal);
        }else if(b.poderTotal > a.poderTotal) {
            System.out.println(b.classe + " " + b.nome + " venceu! | Poder total: " + b.poderTotal);
        } else {
            System.out.println("Empate entre " + a.nome + " e " + b.nome + " | Poder total: " + a.poderTotal);
        }

    }

}
