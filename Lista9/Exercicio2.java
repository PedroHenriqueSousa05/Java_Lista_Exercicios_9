import java.io.FileWriter;
import java.io.PrintWriter;

public class Exercicio2 {
        public static void main(String[] nargs) {

            try{
                FileWriter fileWriter = new FileWriter("C:\\Users\\usuario\\Desktop\\itens_supermercado.txt");
                PrintWriter printWriter = new PrintWriter(fileWriter);

                fileWriter.write("Item 1: Óleo\nPreço: R$8,50");
                fileWriter.write("\n");
                fileWriter.write("Item 2: Arroz\nPreço: R$10,99");
                fileWriter.write("\n");
                fileWriter.write("Item 3: Feijão\nPreço: R$9,90");
                fileWriter.write("\n");
                fileWriter.write("Item 4: Detergente Ypê\nPreço: R$3,39");
                fileWriter.write("\n");
                fileWriter.write("Item 5: Papel Higiênico\nPreço: R$18,99");
                fileWriter.write("\n");
                fileWriter.write("Item 6: Sal\nPreço: R$2,50");
                fileWriter.write("\n");
                fileWriter.write("Item 7: Açúcar\nPreço: R$3,29");
                fileWriter.write("\n");
                fileWriter.write("Item 8: Leite Integral\nPreço: 1L por R$4,79");
                fileWriter.write("\n");
                fileWriter.write("Item 9: Desodorante\nPreço: R$19,29 Kit Aerossol");
                fileWriter.write("\n");
                fileWriter.write("Item 10: Sucrilhos\nPreço: 1kg por R$29,99");
                fileWriter.write("\n");

                fileWriter.close();
                printWriter.close();

                }catch(Exception e){
                    System.out.println("Erro" + e.getMessage());
        }
    }
}