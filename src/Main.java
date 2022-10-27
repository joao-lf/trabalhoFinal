import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double[] valor;
        double soma = 0;
        double media;
        String tipoDeMedia;
        double inverso;


        System.out.println("Que tipo de média você deseja calcular? ARITMETICA ou HARMONICA\n");
        tipoDeMedia = sc.next();

        if (tipoDeMedia.equals("ARITMETICA")) {
            System.out.print("Informe quantos números serão digitados: ");
            n = sc.nextInt();

            if (n >= 2) {
                valor = new double[n];
                for (int i = 0; i < valor.length; i++) {
                    System.out.print("Digite o " + (i + 1) + "º número: ");
                    valor[i] = sc.nextDouble();

                    soma += valor[i];
                }
                media = soma / n;
                System.out.print("A média aritmética é: " + media);
            }

        } else if (tipoDeMedia.equals("HARMONICA")) {

            System.out.print("Informe quantos números serão digitados: ");
            n = sc.nextInt();

            if (n >= 2) {
                valor = new double [n];
                for (int i = 0; i < valor.length; i++) {
                    System.out.print("Digite o " + (i + 1) + "º número: ");
                    valor[i] = sc.nextDouble();

                    soma += (1/valor[i]);
                }
                media = n / soma;
                System.out.print("A média harmônica é: " + media);

            } else {
                System.out.print("Informe um tipo de média válido: ARITMETICA ou HARMONICA");

            }
        }
    }
}
