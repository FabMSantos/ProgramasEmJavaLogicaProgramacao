public class Alg02_CalculoIMC {

    public static void main(String[] args) {
        double peso = 100;
        double altura = 1.80;
        double imc = peso / (altura * altura);
        System.out.println(imc);

        if (imc >= 18.5) {
            System.out.println("Sua Classificação é de Magro");
        } else if (imc <= 18.5 && imc >= 24.9) ;{
            System.out.println("Sua Classificação Está Dentro do Normal");
        } if (imc <= 25.0 && imc >= 29.9) {
            System.out.println("Sua Classificação é de Sobrepeso");
        } else if (imc <= 30.0 && imc >= 39.9) {
            System.out.println("Sua Classificação é Obesidade I");
        } else if (imc <= 40.0 ) {
            System.out.println("Sua Classificação é Obesidade Grave II");
        }
    }
}