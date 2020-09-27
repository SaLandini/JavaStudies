import java.io.*;
import java.util.Scanner;

public class arqui {
    public static void leitor() throws IOException {
        BufferedReader ler = new BufferedReader(new FileReader("./Jorge.txt"));

        String linha = "";
        while (true) {
            if (linha != null){
                System.out.println(linha);
            } else {
                break;
            }
            linha = ler.readLine();
        }
        ler.close();
    }
    public static void escre() throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter("./Jorge.txt"));
        String linha ="";

        Scanner leit = new Scanner(System.in);

        System.out.println("Escreva algo ae: ");
        linha = leit.nextLine();

        escritor.append(linha + "\n");
        escritor.close();
    }
    public static void main(String args[]) throws IOException {
        escre();
        leitor();
    }
}