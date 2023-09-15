package application;

import java.util.*;

public class Main extends Cartas implements Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cartas> listaSelecoes = new ArrayList<>();
        Cartas pais1 = new Cartas("Brasil", 5, 73, 21, 227, 113);
        Cartas pais2 = new Cartas("Argentina", 3, 47, 18, 152, 101);
        Cartas pais3 = new Cartas("Franca", 2, 30, 14, 109, 74);
        Cartas pais4 = new Cartas("Croacia", 0, 13, 6, 41, 29);
        Cartas pais5 = new Cartas("Marrocos", 0, 5, 5, 20, 27);
        Cartas pais6 = new Cartas("Holanda", 0, 30, 11, 96, 52);
        Cartas pais7 = new Cartas("Inglaterra", 1, 32, 16, 104, 68);
        Cartas pais8 = new Cartas("Portugal", 0, 17, 8, 61, 41);
        Cartas pais9 = new Cartas("Japao", 0, 7, 7, 25, 33);
        Cartas pais10 = new Cartas("Senegal", 0, 5, 3, 16, 17);

        listaSelecoes.addAll(Arrays.asList(pais1, pais2, pais3, pais4, pais5, pais6, pais7, pais8, pais9, pais10));
        Main main = new Main();

        System.out.println("----------SEJA BEM VINDO AO SUPER TRUNFO SELECOES----------");
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite uma opção: 1- jogar // 2 - embaralhar // 3 - sair e mostrar resultados");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1 -> {
                    System.out.println("Que comecem os jogos! Sua carta é:");
                    main.jogar(listaSelecoes);
                }
                case 2 -> {
                    System.out.println("Você escolheu embaralhar as cartas.");
                    main.embaralhar(listaSelecoes);
                }
                case 3 -> {
                    System.out.println("Você escolheu sair do jogo. Obrigado por jogar!");
                    if (main.getContadorVitoria() != 0 || main.getContadorDerrota() != 0) {
                        System.out.println("Você ganhou " + main.getContadorVitoria() + " partidas e perdeu " + main.getContadorDerrota() + " partidas.");
                    } else {
                        System.out.println("Você não jogou nenhuma partida.");
                    }
                    continuar = false;
                }

                default -> System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }


    @Override
    public void embaralhar(ArrayList<Cartas> listaSelecoes) {
        Collections.shuffle(listaSelecoes);
    }


    @Override
    public void jogar(ArrayList<Cartas> listaSelecoes) {
        Scanner sc = new Scanner(System.in);
        Cartas paisNaPosicao0 = listaSelecoes.get(0);
        Cartas paisNaPosicao1 = listaSelecoes.get(1);
        System.out.println(paisNaPosicao0.toString());
        System.out.println("Escolha um atributo para duelar: \n1- Titulos // 2- Vitorias // 3- Participacoes // 4- Gols Marcados em Copas // 5- Gols Sofridos em Copas");
        int escolhaAtributo = sc.nextInt();
        int atributoEscolhido;
        switch (escolhaAtributo) {
            //t v pc gm gs
            case 1:
                if (paisNaPosicao0.getTitulos() > paisNaPosicao1.getTitulos()) {
                    System.out.println("Você ganhou! Sua carta possui mais títulos que a do adversário!");
                    setContadorVitoria(getContadorVitoria() + 1);
                } else {
                    System.out.println("==========Você PERDEU!==========");
                    setContadorDerrota(getContadorDerrota() + 1);
                }
                break;
            case 2:
                if (paisNaPosicao0.getVitorias() > paisNaPosicao1.getVitorias()) {
                    System.out.println("==========Você GANHOU!==========");
                    setContadorVitoria(getContadorVitoria() + 1);
                } else {
                    System.out.println("==========Você PERDEU!==========");
                    setContadorDerrota(getContadorDerrota() + 1);
                }
                break;
            case 3:
                if (paisNaPosicao0.getParticipacoesCopa() > paisNaPosicao1.getParticipacoesCopa()) {
                    System.out.println("==========Você GANHOU!==========");
                    setContadorVitoria(getContadorVitoria() + 1);
                } else {
                    System.out.println("==========Você PERDEU!==========");
                    setContadorDerrota(getContadorDerrota() + 1);
                }
                break;
            case 4:
                if (paisNaPosicao0.getGolsMarcadosCopa() > paisNaPosicao1.getGolsMarcadosCopa()) {
                    System.out.println("==========Você GANHOU!==========");
                    setContadorVitoria(getContadorVitoria() + 1);
                } else {
                    System.out.println("==========Você PERDEU!==========");
                    setContadorDerrota(getContadorDerrota() + 1);
                }
                break;
            case 5:
                if (paisNaPosicao0.getGolsSofridosCopa() < paisNaPosicao1.getGolsSofridosCopa()) {
                    System.out.println("==========Você GANHOU!==========");
                    setContadorVitoria(getContadorVitoria() + 1);
                } else {
                    System.out.println("==========Você PERDEU!==========");
                    setContadorDerrota(getContadorDerrota() + 1);
                }
                break;
            default:
                System.out.println("Digite um número inteiro de 1 a 5");

        }
        System.out.println(paisNaPosicao1.toString());
    }
}