public class Ex01 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, soma = 0, multiplicacao = 0, subtracao = 0;
        float divisao = 0;

        num1 = 13;
        num2 = 2;
        soma = num1 + num2;
        multiplicacao = num1 * num2;
        subtracao = num1 - num2;
        divisao = (float) num1 / (float) num2;

        System.out.println("A soma ? " + soma);
        System.out.println("A multiplicacao ? " + multiplicacao);
        System.out.println("A subtracao ? " + subtracao);
        System.out.println("A divisao ? " + divisao);
    }

}
