import java.util.Scanner;

public class calculaRidade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá Guerreiro, Digite o seu nome!!!");
        String nome = scanner.next();
        System.out.println("Olá " + nome+ " É um prazer conhece-lo, meu nome é CHRONOS!");

        System.out.println("Vou calcular a sua idade na velocidade de um TITAN! ");

        System.out.println("Em que ano você Nasceu Guerreiro?");
        int idade = scanner.nextInt();


        int resultado = 2019 - idade;

        System.out.println("Você tem " + resultado + " Anos de Idade GUERREIRO!");


    }
}