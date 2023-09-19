package application;

public class Jogador extends Pessoa{
    private int vitorias;
    private int idade;

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Jogador(String nome , int vitorias , int idade) {
        super(nome);
        this.vitorias = vitorias;
        this.idade = idade;
    }
}
