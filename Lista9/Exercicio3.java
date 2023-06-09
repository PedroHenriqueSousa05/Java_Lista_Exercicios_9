import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe sua idade: ");
        int idade  = scanner.nextInt();

        System.out.println("Informe seu CPF: ");
        String cpf = scanner.next();

        System.out.println("Destinos disponíveis:");
        System.out.println("1- São Paulo: $250");
        System.out.println("2- Nova York: $2400");
        System.out.println("3- Berlim: $3800");

        System.out.println("Escolha um dos três lugares: ");
        int escolha = scanner.nextInt();
        scanner.close();

        String destino;
        double valorPassagem;
        
        switch (escolha) {
            case 1:
                destino = "São Paulo";
                valorPassagem = 250.0;
            break;
                                   
            case 2:
                destino = "Nova York";
                valorPassagem = 2400.0;
            break;
                        
            case 3:
                destino = "Berlim";
                valorPassagem = 3800.0;               
            break;

            default:
                System.out.println("Destino é inválido!");
            return;
        } 
        
        Random random = new Random();
        int numeroPoltrona = random.nextInt(20) + 1;
        
        System.out.println("\n");
        System.out.println("Recibo da viagem");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("CPF: " + cpf);
        System.out.println("Destino: " + destino);
        System.out.println("Valor da passagem: " + valorPassagem);
        System.out.println("Número da poltrona: " + numeroPoltrona);
        System.out.println("Recibo");
        System.out.println("\n");

        try{
            FileWriter fileWriter = new FileWriter("C:\\Users\\usuario\\Desktop\\recibo_viagem.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write("Recibo da Viagem");
            printWriter.write("\nNome: " + nome);
            printWriter.write("\nIdade: " + idade + " anos");
            printWriter.write("\nCPF: " + cpf);
            printWriter.write("\nDestino: " + destino);
            printWriter.write("\nValor da passagem: " + valorPassagem + " reais");
            printWriter.write("\nNúmero da Poltrona: " + numeroPoltrona);
            printWriter.write("\n");

            printWriter.close();
            fileWriter.close();

        }catch (Exception e) {
            System.out.println("e" + e);
        }
    
    }
    
}
