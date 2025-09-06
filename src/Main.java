import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*gerarTabuada();*/
        /*calcularIMC();*/
        exibirParesEImpares();
    }

    public static void gerarTabuada() {
        System.out.println("Informe a tabuada que você quer gerar: ");
        int numeroTabuada = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            int resultado = i * numeroTabuada;
            System.out.printf("%d * %d = %d\n", i, numeroTabuada, resultado);
        }
    }

    public static void calcularIMC() {
        System.out.println("Informe o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Inforome a sua altura: ");
        double altura = scanner.nextDouble();

        scanner.close();

        final var _IMC = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n\n", _IMC);

        if (_IMC <= 18.5) System.out.println("Abaixo do peso ideal");
        else if (_IMC > 18.5 && _IMC <= 24.9) System.out.println("Peso ideal");
        else if (_IMC > 24.9 && _IMC <= 29.9) System.out.println("Levemente acima do peso");
        else if (_IMC > 29.9 && _IMC <= 34.9) System.out.println("Obesidade Grau I");
        else if (_IMC > 34.9 && _IMC <= 39.9) System.out.println("Obesidade Grau II (Severa");
        else System.out.println("Obesidade III (Mórbida");

    }

    public static void exibirParesEImpares(){
        System.out.println("Informe um número inteiro do início do intervalo: ");
        int inicioIntervalo = scanner.nextInt();

        System.out.println("Informe um número inteiro que será o final do intervalo: ");
        int finalIntervalo = scanner.nextInt();

        boolean par = scanner.nextBoolean();
        scanner.nextLine();

        for(int i = inicioIntervalo; i <= finalIntervalo; i++) {
            if(par){
                if(i % 2 == 0) {
                    System.out.println(i);
                }
            } else {
                System.out.println(i);
            }
        }

    }
}