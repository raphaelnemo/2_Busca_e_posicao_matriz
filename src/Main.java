import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de linha da matriz: ");
        int m = scanner.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz: ");
        int n = scanner.nextInt();
        int[][] mat = new int[m][n];
        //System.out.printf("%d, %d", m,n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                System.out.printf("Digite o " + (j+1) + "º valor da matriz:  ");
                mat[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                System.out.println("Número:  " + mat[i][j] + "");
                if (j > 0) System.out.println("Esquerda: " + mat[i][j-1]);
                if (i > 0) System.out.println("Acima: " + mat[i-1][j]);
                if (j < n -1) System.out.println("Direita: " + mat[i][j+1]);
                if (i < n - 1) System.out.println("Abaixo: " + mat[i+1][j]);
                System.out.println("----------");
            }
        }

    }
}