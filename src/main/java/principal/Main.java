package principal;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas: ");
        int n = input.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite a altura da pessoa ");
        vect[i] = input.nextDouble();

        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double media = soma / n;
        System.out.printf("Media: %.2f%n", media);
        input.close();
    }
}