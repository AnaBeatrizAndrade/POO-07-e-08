import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
            && l1 != l2) {
                this.aprovada = true;
                this.desafiado = l1;
                this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar() {
        if (aprovada) {
            System.out.println("===Desafiado===");
            this.desafiado.apresentar();
            System.out.println("===Desafiante===");
            this.desafiante.apresentar();

            Random alratorio = new Random();
            int vencedor = alratorio.nextInt(3); // 0 1 2
            System.out.println("======Resultado======");
            switch (vencedor) {
                case 0: // empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=====================");

        } else {
            System.out.println("A luta não pode acontecer");
        }
    }

    // Métodos especiais
    public Lutador getDesfiado() {
        return desafiado;
    }

    public void setDesfiado(Lutador desfiado) {
        this.desafiado = desfiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
