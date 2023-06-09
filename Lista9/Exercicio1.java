import java.io.FileWriter;
import java.io.PrintWriter;

public class Exercicio1 {
    public static void main(String[] args) {

    try{
        FileWriter fileWriter = new FileWriter("C:\\Users\\usuario\\Desktop\\aluno_universidade.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        fileWriter.write("Aluno 1: Kevin\n:Nota: 90");
        fileWriter.write("\n");
        fileWriter.write("Aluno 2: Pedro\n:Nota: 80");
        fileWriter.write("\n");
        fileWriter.write("Aluno 3: Matheus\n:Nota: 99");
        fileWriter.write("\n");
        fileWriter.write("Aluno 4: Jobson\n:Nota: 50");
        fileWriter.write("\n");
        fileWriter.write("Aluno 5: Cleyton\n:Nota: 25");
        fileWriter.write("\n");

        fileWriter.close();
        printWriter.close();

        }catch(Exception e){
            System.out.println("Erro" + e.getMessage());
        }
    }
}