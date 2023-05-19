/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pi2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wwwfi
 */
public class Pi2 {

    public static void main(String[] args) {
        do {
            menu();
            jogo();
        } while (Repetir == 'S' || Repetir == 'R');
    }

    public static void MaisdeUmaLetra(int falha) {
    }
    static char Repetir;
    static int num;
    static boolean letraDuplicada = false;
    static String forca = "", palavrasDigitadas = "", letra;
    static String forca2 = "", palavrasDigitadas2 = "", letra2;
    static String forca3 = "", palavrasDigitadas3 = "", letra3;
    static String forca4 = "", palavrasDigitadas4 = "", letra4;
    static String forca5 = "", palavrasDigitadas5 = "", letra5;

    public static void menu() {
        System.out.println(" ");
        System.out.println("      JOGO DA FORCA      ");
        System.out.println("+ --------------------- +");
        System.out.println("|  1 - Inicio do jogo   |");
        System.out.println("|-----------------------|");
        System.out.println("|    2 - Instrucoes     |");
        System.out.println("|-----------------------|");
        System.out.println("|     3 - Creditos      |");
        System.out.println("|-----------------------|");
        System.out.println("|   4 - Sair do jogo    |");
        System.out.println("+ --------------------- +");
        System.out.println(" ");
        System.out.println("Selecione o numero desejado (1, 2, 3 e 4):");
        System.out.println(" ");
    }

    public static void Instruções() {
        System.out.println("Instrucoes do Game:");
        System.out.println(" ");
        System.out.println("DIGITE APENAS UMA LETRA POR VEZ!!!");
        System.out.println("Existem temas que sao necessarios digitar o espaco.");
        Repetir();
    }

    public static void Dicas1(String tema1) {
        if (tema1.equals("PICHU")) {
            System.out.println("Dica: Da choque e tem a cor amarela.");
        } else if (tema1.equals("CHARIZARD")) {
            System.out.println("Dica: E um dragao bem quente.");
        } else if (tema1.equals("BULBASAUR")) {
            System.out.println("Dica: Tem uma planta nas costas.");
        } else if (tema1.equals("SQUIRTLE")) {
            System.out.println("Dica: E uma tartaruga.");
        }
    }

    public static void Dicas2(String tema2) {
        if (tema2.equals("TITANIC")) {
            System.out.println("Dica: E o navio mais famoso do mundo.");
        } else if (tema2.equals("VINGADORES ULTIMATO")) {
            System.out.println("Dica: Thanos.");
        } else if (tema2.equals("FROZEN")) {
            System.out.println("Dica: Leri Gol.");
        } else if (tema2.equals("JURASSIC WORLD")) {
            System.out.println("Dica: Parque tematico de dinossauros com mutacoes e distruicao.");
        }
    }

    public static void Dicas3(String tema3) {
        if (tema3.equals("MESSI")) {
            System.out.println("Dica: Unico jogador com duas Bolas de Ouro da Copa do Mundo.");
        } else if (tema3.equals("NEYMAR")) {
            System.out.println("Dica: Saudades do que a gente nao viveu ainda.");
        } else if (tema3.equals("CRISTIANO RONALDO")) {
            System.out.println("Dica: Siuuu!!!");
        } else if (tema3.equals("VINICIUS JUNIOR")) {
            System.out.println("Dica: Jogador mais criticado da Europa.");
        }
    }

    public static void Dicas4(String tema4) {
        if (tema4.equals("NIKE")) {
            System.out.println("Dica: Seu logotipo e baseado nas asas da deusa Nice.");
        } else if (tema4.equals("ADIDAS")) {
            System.out.println("Dica: As tres listras.");
        } else if (tema4.equals("GUCCI")) {
            System.out.println("Dica: Marca com o duplo G.");
        } else if (tema4.equals("PUMA")) {
            System.out.println("Dica: Marca é representada por um animal.");
        }
    }

    public static void Dicas5(String tema5) {
        if (tema5.equals("HOMEM DE FERRO")) {
            System.out.println("Dica: Um genio, bilionario, playboy, filantropo.");
        } else if (tema5.equals("HULK")) {
            System.out.println("Dica: Esmaga.");
        } else if (tema5.equals("THOR")) {
            System.out.println("Dica: Filho de Odin.");
        } else if (tema5.equals("DOUTOR ESTRANHO")) {
            System.out.println("Dica: Fez parte do grupo Illuminati.");
        }
    }

    public static void Instruções2() {
        System.out.println("Instrucoes do Game:");
        System.out.println(" ");
        System.out.println("DIGITE APENAS UMA LETRA POR VEZ!!!");
        System.out.println("Existem temas que sao necessarios digitar o espaco.");
    }

    public static void desenhoForca(int erros) {
        System.out.println();
        switch (erros) {
            case 1:
                System.out.println("|---   ");
                System.out.println("|  o   ");
                System.out.println("|      ");
                System.out.println("|      ");
                System.out.println("|      ");
                break;
            case 2:
                System.out.println("|---   ");
                System.out.println("|  o   ");
                System.out.println("|  |   ");
                System.out.println("|      ");
                System.out.println("|      ");
                break;
            case 3:
                System.out.println("|---   ");
                System.out.println("|  o   ");
                System.out.println("| /|   ");
                System.out.println("|      ");
                System.out.println("|      ");
                break;
            case 4:
                System.out.println("|---   ");
                System.out.println("|  o   ");
                System.out.println("| /|\\ ");
                System.out.println("|      ");
                System.out.println("|      ");
                break;
            case 5:
                System.out.println("ESSE E SUA ULTIMA CHANCE!!!");
                System.out.println("");
                System.out.println("|---   ");
                System.out.println("|  o   ");
                System.out.println("| /|\\ ");
                System.out.println("| /    ");
                System.out.println("|      ");
                break;
            case 6:
                System.out.println("|---   ");
                System.out.println("|  o   ");
                System.out.println("| /|\\ ");
                System.out.println("| / \\ ");
                System.out.println("|      ");
                break;
        }
        System.out.println();
    }

    public static String tema1() {
        String tema1;
        String[] pokemons = {"PICHU", "CHARIZARD", "SQUIRTLE", "BULBASAUR"};
        Random aleatorio = new Random();
        int indice = aleatorio.nextInt(4);
        tema1 = pokemons[indice];
        return tema1;
    }

    public static String tema2() {
        String tema2;
        String[] filmes = {"TITANIC", "VINGADORES ULTIMATO", "FROZEN", "JURASSIC WORLD"};
        Random aleatorio2 = new Random();
        int indice2 = aleatorio2.nextInt(4);
        tema2 = filmes[indice2];
        return tema2;
    }

    public static String tema3() {
        String tema3;
        String[] JogadoresDeFutebol = {"MESSI", "NEYMAR", "CRISTIANO RONALDO", "VINICIUS JUNIOR"};
        Random aleatorio3 = new Random();
        int indice3 = aleatorio3.nextInt(4);
        tema3 = JogadoresDeFutebol[indice3];
        return tema3;
    }

    public static String tema4() {
        String tema4;
        String[] Marcas = {"NIKE", "ADIDAS", "GUCCI", "PUMA"};
        Random aleatorio4 = new Random();
        int indice4 = aleatorio4.nextInt(4);
        tema4 = Marcas[indice4];
        return tema4;
    }

    public static void Repetir() {
        System.out.println("Deseja voltar para o menu?");
        System.out.println("Se sim, digite 'S'");
        System.out.println("Se nao, digite 'N'");
        System.out.println("");
        Scanner imput = new Scanner(System.in);
        Repetir = imput.next().toUpperCase().charAt(0);
    }

    public static String tema5() {
        String tema5;
        String[] Herois = {"HOMEM DE FERRO", "HULK", "THOR", "DOUTOR ESTRANHO"};
        Random aleatorio5 = new Random();
        int indice5 = aleatorio5.nextInt(4);
        tema5 = Herois[indice5];
        return tema5;
    }

    public static void jogo() {
        String tema1 = tema1();
        String tema2 = tema2();
        String tema3 = tema3();
        String tema4 = tema4();
        String tema5 = tema5();
        Scanner scanmenu = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        int escolhaMenu = scanmenu.nextInt();
        System.out.println(" ");
        if (escolhaMenu >= 1 && escolhaMenu <= 4) {                                                                  //SWITCH MENU
            switch (escolhaMenu) {
                case 1:
                    Random random = new Random();
                    int num = random.nextInt(5) + 1;
                    if (num == 1) {
                        Instruções2();
                        System.out.println("O tema sorteado foi 'Pokemon'");
                        System.out.println("");
                        Dicas1(tema1);
                        System.out.println("");
                        String forca = "";
                        System.out.println("");
                        for (int i = 0; i < tema1.length(); i++) {
                            forca += "_";
                        }
                        int falha = 0;
                        int erros = 0;
                        while (erros < 6 && forca.contains("_") && falha != 1) {
                            System.out.println("Palavra: " + forca);
                            System.out.println("Erros: " + erros);
                            System.out.println(" ");
                            System.out.print("Digite uma letra: ");
                            Scanner entTema1 = new Scanner(System.in);
                            String letra = entTema1.nextLine().toUpperCase();
                            if (letra.equals("PICHU") || letra.equals("CHARIZARD") || letra.equals("BULBASAUR") || letra.equals("SQUIRTLE")) {
                                falha = 1;
                            }
                            System.out.println(" ");
                            if (palavrasDigitadas.indexOf(letra) != -1) { //letra repetida
                                // ja digitou a palavra
                                System.out.println("Letra ja digitada... Digite novamente, por favor");
                                System.out.println(" ");
                                letraDuplicada = true;
                            } else {
                                palavrasDigitadas = palavrasDigitadas + letra;
                            }
                            if (tema1.contains(letra)) {
                                for (int i = 0; i < tema1.length(); i++) {
                                    if (tema1.charAt(i) == letra.charAt(0)) {
                                        forca = forca.substring(0, i) + letra + forca.substring(i + 1);
                                    }
                                }
                            } else {
                                erros++;
                                desenhoForca(erros);
                            }
                        }
                        if (falha == 1) {
                            System.out.println("Digite apenas uma letra por vez");
                            System.out.println("Digite R para o jogo ser reiniciado");
                            System.out.println("");
                            Scanner imput = new Scanner(System.in);
                            Repetir = imput.next().toUpperCase().charAt(0);
                        } else if (erros == 6) {
                            System.out.println("Poxa que pena, voce atingiu o maximo de erros... Por favor, tente novamente :]");
                            System.out.println("");
                            Repetir();
                        } else {
                            System.out.println("Parabens, voce ganhou! A palavra era " + tema1 + " :)");
                            System.out.println("");
                            Repetir();
                        }
                    } else if (num == 2) {
                        Instruções2();
                        System.out.println("O tema sorteado foi 'Filmes'");
                        System.out.println("");
                        Dicas2(tema2);
                        String forca2 = "";
                        System.out.println("");
                        for (int i = 0; i < tema2.length(); i++) {
                            forca2 += "_";
                        }
                        int falha = 0;
                        int erros = 0;
                        while (erros < 6 && forca2.contains("_") && falha != 1) {
                            System.out.println("Palavra: " + forca2);
                            System.out.println("Erros: " + erros);
                            System.out.println(" ");
                            System.out.print("Digite uma letra: ");
                            Scanner entTema2 = new Scanner(System.in);
                            String letra2 = entTema2.nextLine().toUpperCase();
                            if (letra2.equals("TITANIC") || letra2.equals("VINGADORES ULTIMATO") || letra2.equals("FROZEN") || letra2.equals("JURASSIC WORLD")) {
                                falha = 1;
                            }
                            System.out.println(" ");
                            if (palavrasDigitadas2.indexOf(letra2) != -1) { //letra repetida
                                // ja digitou a palavra
                                System.out.println("Letra ja digitada... Digite novamente, por favor");
                                System.out.println(" ");
                                letraDuplicada = true;
                            } else {
                                palavrasDigitadas = palavrasDigitadas + letra;
                            }
                            if (tema2.contains(letra2)) {
                                for (int i = 0; i < tema2.length(); i++) {
                                    if (tema2.charAt(i) == letra2.charAt(0)) {
                                        forca2 = forca2.substring(0, i) + letra2 + forca2.substring(i + 1);
                                    }
                                }
                            } else {
                                erros++;
                                desenhoForca(erros);
                            }
                        }
                        if (falha == 1) {
                            System.out.println("Digite apenas uma letra por vez");
                            System.out.println("Digite R para o jogo ser reiniciado");
                            System.out.println("");
                            Scanner imput = new Scanner(System.in);
                            Repetir = imput.next().toUpperCase().charAt(0);
                        } else if (erros == 6) {
                            System.out.println("Poxa que pena, voce atingiu o maximo de erros... Por favor, tente novamente :]");
                            System.out.println("");
                            Repetir();
                        } else {
                            System.out.println("Parabens, voce ganhou! A palavra era " + tema2 + " :)");
                            System.out.println("");
                            Repetir();
                        }
                    } else if (num == 3) {
                        Instruções2();
                        System.out.println("O tema sorteado foi 'Jogador de Futebol'");
                        System.out.println("");
                        Dicas3(tema3);
                        String forca3 = "";
                        System.out.println(" ");
                        for (int i = 0; i < tema3.length(); i++) {
                            forca3 += "_";
                        }
                        int falha = 0;
                        int erros = 0;
                        while (erros < 6 && forca3.contains("_") && falha != 1) {
                            System.out.println("Palavra: " + forca3);
                            System.out.println("Erros: " + erros);
                            System.out.println(" ");
                            System.out.print("Digite uma letra: ");
                            Scanner entTema3 = new Scanner(System.in);
                            String letra3 = entTema3.nextLine().toUpperCase();
                            if (letra3.equals("MESSI") || letra3.equals("NEYMAR") || letra3.equals("CRISTIANO RONALDO") || letra3.equals("VINICIUS JUNIOR")) {
                                falha = 1;
                            }
                            System.out.println(" ");
                            if (palavrasDigitadas3.indexOf(letra3) != -1) { //letra repetida
                                // ja digitou a palavra
                                System.out.println("Letra ja digitada... Digite novamente, por favor");
                                System.out.println(" ");
                                letraDuplicada = true;
                            } else {
                                palavrasDigitadas3 = palavrasDigitadas3 + letra3;
                            }
                            if (tema3.contains(letra3)) {
                                for (int i = 0; i < tema3.length(); i++) {
                                    if (tema3.charAt(i) == letra3.charAt(0)) {
                                        forca3 = forca3.substring(0, i) + letra3 + forca3.substring(i + 1);
                                    }
                                }
                            } else {
                                erros++;
                                desenhoForca(erros);
                            }
                        }
                        if (falha == 1) {
                            System.out.println("Digite apenas uma letra por vez");
                            System.out.println("Digite R para o jogo ser reiniciado");
                            System.out.println("");
                            Scanner imput = new Scanner(System.in);
                            Repetir = imput.next().toUpperCase().charAt(0);
                        } else if (erros == 6) {
                            System.out.println("Poxa que pena, voce atingiu o maximo de erros... Por favor, tente novamente :]");
                            System.out.println("");
                            Repetir();
                        } else {
                            System.out.println("Parabens, voce ganhou! A palavra era " + tema3 + " :)");
                            System.out.println("");
                            Repetir();
                        }
                    } else if (num == 4) {
                        Instruções2();
                        System.out.println("O tema sorteado foi 'Marca'");
                        System.out.println("");
                        Dicas4(tema4);
                        String forca4 = "";
                        System.out.println("");
                        for (int i = 0; i < tema4.length(); i++) {
                            forca4 += "_";
                        }
                        int falha = 0;
                        int erros = 0;
                        while (erros < 6 && forca4.contains("_") && falha != 1) {
                            System.out.println("Palavra: " + forca4);
                            System.out.println("Erros: " + erros);
                            System.out.println(" ");
                            System.out.print("Digite uma letra: ");
                            Scanner entTema4 = new Scanner(System.in);
                            String letra4 = entTema4.nextLine().toUpperCase();
                            if (letra4.equals("NIKE") || letra4.equals("ADIDAS") || letra4.equals("PUMA") || letra4.equals("GUCCI")) {
                                falha = 1;
                            }
                            System.out.println(" ");
                            if (palavrasDigitadas4.indexOf(letra4) != -1) { //letra repetida
                                System.out.println("Letra ja digitada... Digite novamente, por favor");
                                System.out.println(" ");
                                letraDuplicada = true;
                            } else {
                                palavrasDigitadas4 = palavrasDigitadas4 + letra4;
                            }
                            if (tema4.contains(letra4)) {
                                for (int i = 0; i < tema4.length(); i++) {
                                    if (tema4.charAt(i) == letra4.charAt(0)) {
                                        forca4 = forca4.substring(0, i) + letra4 + forca4.substring(i + 1);
                                    }
                                }
                            } else {
                                erros++;
                                desenhoForca(erros);
                            }
                        }
                        if (falha == 1) {
                            System.out.println("Digite apenas uma letra por vez");
                            System.out.println("Digite R para o jogo ser reiniciado");
                            System.out.println("");
                            Scanner imput = new Scanner(System.in);
                            Repetir = imput.next().toUpperCase().charAt(0);
                        } else if (erros == 6) {
                            System.out.println("Poxa que pena, voce atingiu o maximo de erros... Por favor, tente novamente :]");
                            System.out.println("");
                            Repetir();

                        } else {
                            System.out.println("Parabens, voce ganhou! A palavra era " + tema4 + " :)");
                            System.out.println("");
                            Repetir();
                        }
                    } else if (num == 5) {
                        Instruções2();
                        System.out.println("O tema sorteado foi 'Heroi da Marvel'");
                        System.out.println("");
                        Dicas5(tema5);
                        String forca5 = "";
                        System.out.println("");
                        for (int i = 0; i < tema5.length(); i++) {
                            forca5 += "_";
                        }
                        int falha = 0;
                        int erros = 0;
                        while (erros < 6 && forca5.contains("_") && falha != 1) {
                            System.out.println("Palavra: " + forca5);
                            System.out.println("Erros: " + erros);
                            System.out.println(" ");
                            System.out.print("Digite uma letra: ");
                            Scanner entTema5 = new Scanner(System.in);
                            String letra5 = entTema5.nextLine().toUpperCase();
                            if (letra5.equals("HOMEM DE FERRO") || letra5.equals("HULK") || letra5.equals("THOR") || letra5.equals("DOUTOR ESTRANHO")) {
                                falha = 1;
                            }
                            System.out.println(" ");
                            if (palavrasDigitadas5.indexOf(letra5) != -1) { //letra repetida
                                // ja digitou a palavra
                                System.out.println("Letra ja digitada... Digite novamente, por favor");
                                System.out.println(" ");
                                letraDuplicada = true;
                            } else {
                                palavrasDigitadas5 = palavrasDigitadas5 + letra5;
                            }
                            if (tema5.contains(letra5)) {
                                for (int i = 0; i < tema5.length(); i++) {
                                    if (tema5.charAt(i) == letra5.charAt(0)) {
                                        forca5 = forca5.substring(0, i) + letra5 + forca5.substring(i + 1);
                                    }
                                }
                            } else {
                                erros++;
                                desenhoForca(erros);
                            }
                        }
                        if (falha == 1) {
                            System.out.println("Digite apenas uma letra por vez");
                            System.out.println("Digite R para o jogo ser reiniciado");
                            System.out.println("");
                            Scanner imput = new Scanner(System.in);
                            Repetir = imput.next().toUpperCase().charAt(0);
                        } else if (erros == 6) {
                            System.out.println("Poxa que pena, voce atingiu o maximo de erros... Por favor, tente novamente :]");
                            System.out.println("");
                            Repetir();
                        } else {
                            System.out.println("Parabens, voce ganhou! A palavra era " + tema5 + " :)");
                            System.out.println("");
                            Repetir();
                        }
                    }
                    break;
                case 2:
                    Instruções();
                    break;
                case 3:
                    creditos();
                    break;
                case 4:
                    sair();
            }
        } else {
            System.out.println("Infelizmente nao temos essa opcao :/");
        }
        System.out.println("");
        System.out.println("Obrigado por jogar, espero que tenha gostado :)");
    }

    public static void sair() {
        System.out.println("Ja vai jogador? :(");
        System.out.println("Agradecemos por ter jogado nosso game :)");
        System.out.println("");
    }

    public static void creditos() {
        System.out.println("Esse trabalho foi desenvolvido pelos seguintes integrantes:");
        System.out.println("");
        System.out.println("Christian Mol");
        System.out.println("Enzo Amorim");
        System.out.println("Fernando Santos");
        System.out.println("Gustavo Freire");
        System.out.println("Vitor Conceicao");
        System.out.println("");
        Repetir();
    }
}
