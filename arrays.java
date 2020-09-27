public class arrays {
    public static int somatudo(int[] idadeAlunos){
        int acumulaSoma = 0;

        for(int i = 0; i < 5; i++){
            acumulaSoma = acumulaSoma + idadeAlunos[i];
        }
        return acumulaSoma;
    }

    public static void main(String args[]) {
        int[] idadeAlunos = new int[5];
        idadeAlunos[0] = 10;
        idadeAlunos[1] = 12;
        idadeAlunos[2] = 10;
        idadeAlunos[3] = 15;
        idadeAlunos[4] = 9;

        int somaDasIdades = somatudo(idadeAlunos);

        System.out.println(idadeAlunos.length);
        System.out.println(Arrays.toString(idadeAlunos));

        int[] idadeAlunos2 = Arrays.copyOf(idadeAlunos, 10);

        Arrays.sort(idadeAlunos);
    }
}