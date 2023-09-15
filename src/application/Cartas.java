package application;

public class Cartas {
    // Atributos: País, títulos, participações, gols sofridos em copas e gols marcados em copas
    // Argentina, frança, croácia, marrocos, holanda, inglaterra, brasil, portugal, japão, senegal
    private String pais;
    private int titulos;
    private int vitorias;
    private int participacoesCopa;
    private int golsMarcadosCopa;
    private int golsSofridosCopa;
    private int contadorVitoria = 0;

    public int getContadorVitoria() {
        return contadorVitoria;
    }

    public void setContadorVitoria(int contadorVitoria) {
        this.contadorVitoria = contadorVitoria;
    }

    public int getContadorDerrota() {
        return contadorDerrota;
    }

    public void setContadorDerrota(int contadorDerrota) {
        this.contadorDerrota = contadorDerrota;
    }

    private int contadorDerrota = 0;

    public Cartas(String pais, int titulos, int vitorias, int participacoesCopa, int golsMarcadosCopa, int golsSofridosCopa) {
        this.pais = pais;
        this.titulos = titulos;
        this.vitorias = vitorias;
        this.participacoesCopa = participacoesCopa;
        this.golsMarcadosCopa = golsMarcadosCopa;
        this.golsSofridosCopa = golsSofridosCopa;
    }

    public Cartas() {
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getParticipacoesCopa() {
        return participacoesCopa;
    }

    public void setParticipacoesCopa(int participacoesCopa) {
        this.participacoesCopa = participacoesCopa;
    }

    public int getGolsMarcadosCopa() {
        return golsMarcadosCopa;
    }

    public void setGolsMarcadosCopa(int golsMarcadosCopa) {
        this.golsMarcadosCopa = golsMarcadosCopa;
    }

    public int getGolsSofridosCopa() {
        return golsSofridosCopa;
    }

    public void setGolsSofridosCopa(int golsSofridosCopa) {
        this.golsSofridosCopa = golsSofridosCopa;
    }
    @Override
    public String toString() {
        return "País: " + pais +
                "\nTítulos: " + titulos +
                "\nVitórias: " + vitorias +
                "\nParticipações em Copas: " + participacoesCopa +
                "\nGols Marcados em Copas: " + golsMarcadosCopa +
                "\nGols Sofridos em Copas: " + golsSofridosCopa;
    }
}
