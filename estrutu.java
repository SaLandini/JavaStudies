import java.util.Scanner;
public class estrutu {
    public static void main(String args[]) {
        int idade = 50;
        int idade2 = 50;

        //If, Else if, Else --
        if(idade > idade2) {
            System.out.println("primeira idade é maior que segunda idade");
        } else if (idade < idade2) {
            System.out.println("segunda idade é maior que a primeira");
        } else {
            System.out.println("segunda idade é igual a primeira");
        }

        //Ternário --
        idade = idade2 + 20;
        int idadeMaior;

        // a idadeMaior vai receber o valor de idade caso a condição for verdadeira
        // no caso se idade for maior que idade2
        // caso contrario recebe o valor de idade2

        idadeMaior = (idade > idade2 ? idade : idade2);
        System.out.println(idadeMaior);


        //Switch case --
        Scanner ler = new Scanner(System.in);

        int caso = 0;
        System.out.println("Digite 1 para mostrar o caso 1, 2 para mostrar o caso 2, e 3 para o caso 3");
        caso = ler.nextInt();

        switch (caso) {
            case 1:
                System.out.println("Caso 1");
                break;
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                System.out.println("Caso 3");
                break;
            default:
                System.out.println("Nenhum caso seu boboca");
        }
    }
}