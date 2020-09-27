public class exec{
    public static void main(String args[]) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        } catch (Exception  e) {
            System.out.println("A frase inicial é nula, para resolver, foi dado um atributo default.");
            frase = "Frase Vazia";
            novaFrase = frase.toUpperCase();
        } finally {
            System.out.println("Frase antiga: "+ frase);
            System.out.println("Frase nova: "+ novaFrase);
        }
    }
}