import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; //NUMERO ENTRE 1 E 100
        int tentativas = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos jogar! Tente adivinhar o número que estou pensando (de 1 a 100).");

        while (true) {
            System.out.print("Digite o seu palpite: ");
            int chute = sc.nextInt(); // Lê o chute do jogador
            tentativas++; //INCREMENTA O CONTADOR DE TENTATIVAS

            //VE SE O CHUTE TA CERTO, OU SE O NUMERO EMAIOR OU MENOR
            if (chute < numeroSecreto) {
                System.out.println("O número é maior! Tente novamente.");
            } else if (chute > numeroSecreto) {
                System.out.println("O número é menor! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas!");
                break; //SAI DO LOOP QND O JOGADOR ACERTA
            }
        }
    }
}
