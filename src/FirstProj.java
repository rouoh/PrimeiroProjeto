import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstProj {

    public static final int MEDIA = 6; // media necessária
    public static final int MAX_FALTAS = 15; // máximo de faltas

    public static void main(String[] args) {
        while (true) { // caso a entrada de dados for inválida, o while executará novamente o programa.
            Scanner scanner = new Scanner(System.in); //iniciando scanner
            try { // tente fazer isso

                System.out.print("Nota do aluno: ");
                float nota = scanner.nextFloat(); // linha de entrada de float
                System.out.print("Quantidade de faltas: ");
                int faltas = scanner.nextInt(); // linha de entrada de int

                if (nota >= MEDIA && faltas <= MAX_FALTAS) { // se (nota for maior ou igual a media E as faltas menores ou iguais o maximo de faltas)
                    System.out.println("->Aprovado");
                }
                else { // senão
                    System.out.println("->Reprovado");
                }
                break; // para o laço
            } catch (InputMismatchException ex) { // pega o erro; InputMismatchException é o erro
                System.out.println("Informe apenas numeros, tente novamente."); // mensagem de erro
                // ex.printStackTrace();
                System.out.println("============================");
            }
        }
    }
}

