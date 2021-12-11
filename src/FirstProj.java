import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstProj {

    public static final int MEDIA = 6; // media necessária
    public static final int MAX_FALTAS = 15; // máximo de faltas

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Nota do aluno: ");
                float nota = scanner.nextFloat();
                System.out.print("Quantidade de faltas: ");
                int faltas = scanner.nextInt();

                if (nota >= MEDIA && faltas <= MAX_FALTAS) {
                    System.out.println("Aprovado");
                }
                else {
                    System.out.println("Reprovado");
                }
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Informe apenas numeros, tente novamente.");
                // ex.printStackTrace();
                System.out.println("============================");
            }
        }
    }
}

