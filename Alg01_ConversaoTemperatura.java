import java.util.Scanner;

public class Alg01_ConversaoTemperatura {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        System.out.println("Digite temperatura em Celsius");
        double celsius = scanner.nextDouble();

        double kelvin = celsius + 273.15;

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("A temperatura em Kelvin é: %.2f K\n",kelvin);
        System.out.printf("A temperatura em Fahrenheit é: %.2f F\n",fahrenheit);

        scanner.close();

    } 
    
}
