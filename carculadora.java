import java.util.Scanner;

public class carculadora {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.println("Bom dia, fala o primeiro numero: ");
        int num1 = ler.nextInt();
        System.out.println("Fala o segundo numero: ");
        int num2 = ler.nextInt();

        System.out.println("Blz, mas voce quer que some(digite 1), que subtraia(digite 2)");
        System.out.println("que multiplique(digite 3) ou que divida(digite 4)");
        int caos = ler.nextInt();

        switch (caos){
            case 1:
                int resultad1 = num1 + num2;
                System.out.println("A soma de "+num1+"+"+num2+" = "+resultad1);
                break;
            case 2:
                int resultad2 = num1 - num2;
                System.out.println("A subtracao de "+num1+"-"+num2+" = "+resultad2);
                break;
            case 3:
                int resultad3 = num1 * num2;
                System.out.println("A multiplicacao de "+num1+"x"+num2+" = "+resultad3);
                break;
            case 4:
                int resultad4 = num1 / num2;
                System.out.println("A divicao de "+num1+"/"+num2+" = "+resultad4);
                break;
            default:
                System.out.println("Escolhe certo o boco");
        }
    }
}