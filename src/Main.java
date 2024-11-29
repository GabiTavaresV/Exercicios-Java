import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Digite um número para o cálculo do Fatorial: ");
        int fatorial = inputUser.nextInt();
        long result = Fatorial.execute(fatorial);

        System.out.println("O Fatorial do número " + fatorial + " é: " + result);

        Scanner inputUser1 = new Scanner(System.in);
        System.out.println("Digite um número para o cálculo da tabuada: ");
        int tabuada = inputUser1.nextInt();
        ArrayList<Integer> resTabuada = Tabuada.execute(tabuada);

        System.out.println("A Tabuada do número " + tabuada + " é: " + resTabuada);
    }
}
