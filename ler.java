import java.util.Scanner;
public class ler {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("FALA O NOME: ");
        String nome = ler.nextLine();

        System.out.println("DOSAGEM DO ALPRAZOLAM: ");
        String dose = ler.nextLine();

        System.out.println("O Paciente "+nome+" toma a dosagem de "+dose+" de Alprazolam");
    }
}