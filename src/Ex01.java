public class Ex01 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, soma = 0, multiplicacao = 0, subtracao = 0;
        float divisao = 0;

        num1 = 11;
        num2 = 5;
        soma = num1 + num2;
        multiplicacao = num1 * num2;
        subtracao = num1 - num2;
        divisao = (float) num1 / (float) num2;

        System.out.println("A soma é " + soma);
        System.out.println("A multiplicacao é " + multiplicacao);
        System.out.println("A subtracao é " + subtracao);
        System.out.println("A divisao é " + divisao);
    }

}
