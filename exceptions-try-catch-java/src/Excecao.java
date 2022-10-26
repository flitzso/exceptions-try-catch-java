public class Excecao {

    public static void main(String[] args) {
        //Try catch permite que o programa seja executado mesmo com algum erro [exception] anulla o brak do erro
        try {
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Não será impresso!");
            //o erro foi adcionado seguido de exception
        } catch (ArrayIndexOutOfBoundsException exception) {
        System.out.println("Exceção ao acessar o vetor que não existe"); }

        System.out.println("Esse texto será impresso apos a execption");
    }
}
