public class carculo {
    public static void main(String args[]) {
        //soma

        int soma = 5 + 3;
        System.out.println("Soma de 5 mais 3 e "+soma);
        //ou
        int num1, num2;
        num1 = 2;
        num2 = 8;
        int soma2 = num1 + num2;
        System.out.println("Soma de "+num1+" + "+num2+" = "+soma2);

        //subtração

        int sub = 43 - 3;
        System.out.println("43 - 3 = "+sub);
        //ou
        int numI, numII;
        numI = 2;
        numII = 8;
        int sub2 = numI - numII;
        System.out.println("Subtracao de "+numI+" + "+numII+" = "+sub2);

        //multiplicação

        int mult = 43 * 3;
        System.out.println("43 x 3 = "+mult);
        //ou
        int numIII, numIV;
        numIII = 2;
        numIV = 8;
        int mult2 = numIII * numIV;
        System.out.println("Multiplicacao de "+numIV+" x "+numIII+" = "+mult2);

        //Divisão

        int divisao = 10/5;
        System.out.println("O valor da divisao 10 / 5 = " + divisao);
        //ou
        int numV = 10;
        int numVI = 5;
        int divisao2 = numV / numVI;
        System.out.println("O valor da divisao entre " + num1 + " / " + num2 + " = " + divisao2);

        //Modulo

        int mod = 13%3;
        System.out.println("O valor da divisão 10 / 5 = " + mod);

        //Incremento e Decremento

        int variavel1 = 10;
        System.out.println(variavel1);
        variavel1++;
        System.out.println(variavel1);

        int variavel2 = 20;
        System.out.println(variavel2);
        variavel2--;
        System.out.println(variavel2);
    }
}