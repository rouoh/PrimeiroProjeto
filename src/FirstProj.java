import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Controle de Notas e Faltas
 *
 * @author Rodrigo Doná Tavares
 */
public class FirstProj {
    /**
     * Média necessária
     */
    public static final int MEDIA = 6;
    /**
     * Máximo de faltas permitidas
     */
    public static final int MAX_FALTAS = 15;

    public static void main(String[] args) {
        // Caso a entrada de dados for inválida, o while executará novamente o programa
        while (true) {
            // Iniciando scanner
            Scanner scanner = new Scanner(System.in);
            try {
                // Tente fazer isso

                System.out.print("Nota do aluno: ");
                // Linha de entrada de float
                float nota = scanner.nextFloat();
                System.out.print("Quantidade de faltas: ");
                // linha de entrada de int
                int faltas = scanner.nextInt();

                if (nota >= MEDIA && faltas <= MAX_FALTAS) {
                    System.out.println("->Aprovado");
                }
                else {
                    System.out.println("->Reprovado");
                }
                // Para o laço
                break;
            } catch (InputMismatchException ex) {
                // Pega o erro; InputMismatchException é o erro
                System.out.println("Informe apenas numeros, tente novamente.");
                System.out.println("============================");
            }
        }
    }
}

