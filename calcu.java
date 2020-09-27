public class calcu {
    public static double calcu(int[] idadeAlunos) {
        int acumula = 0;
        for(int i = 0; i < idadeAlunos.length; i++) {
            acumula += idadeAlunos[i];
        }
        return acumula/idadeAlunos.length;
    }
    public static  int quant(int[] idadeAlunos, double media) {
        int cont = 0;
        for (int i = 0; i < idadeAlunos.length; i++) {
            if (idadeAlunos[i]>media){
                cont++;
            }
        }
        return cont;
    }
    public static void main(String args[]) {
        int[] idadeAlunos = {11, 12, 13, 14, 11, 15};
        double media = calcu(idadeAlunos);
        int quant = quant(idadeAlunos, media);

        System.out.println("A media de idade dos alunos e " + media + " e temos " + quant + " acima da media");
    }
}