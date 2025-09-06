import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*gerarTabuada();*/
        /*calcularIMC();*/
        exibirParesEImpares();
    }

    public static void gerarTabuada() {
        System.out.println("Informe a tabuada que você quer gerar: ");
        int numeroTabuada;

        if(scanner.hasNextInt()){
            numeroTabuada = scanner.nextInt();
            for (int i = 1; i < 10; i++) {
                int resultado = i * numeroTabuada;
                System.out.printf("%d * %d = %d\n", i, numeroTabuada, resultado);
            }
        } else {
            System.out.println("Entrada inválida! Digite um número inteiro.");
        }
    }

    public static void calcularIMC() {
        double peso = lerDoublePositivo("Informe o seu peso: ");

        double altura = lerDoublePositivo("Informe a sua altura: ");

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n\n", imc);

        if (imc <= 18.5) System.out.println("Abaixo do peso ideal");
        else if (imc <= 24.9) System.out.println("Peso ideal");
        else if (imc <= 29.9) System.out.println("Levemente acima do peso");
        else if (imc <= 34.9) System.out.println("Obesidade Grau I");
        else if (imc <= 39.9) System.out.println("Obesidade Grau II (Severa)");
        else System.out.println("Obesidade III (Mórbida)");

    }

    private static double lerDoublePositivo(String mensagem){
        double valor = -1;
        while(valor <= 0) {
            System.out.println(mensagem);
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                if (valor <= 0) {
                    System.out.println("O valor deve ser maior que zero.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número");
                scanner.next();
            }
        }
        return valor;
    }

    public static void exibirParesEImpares(){
        int inicioIntervalo = lerInteiro("Informe o inicio do intervalo: ");
        int finalIntervalo = lerInteiro("Informe o final do intervalo: ");
        while(inicioIntervalo >= finalIntervalo) {
            System.out.println("Final intervalo deve ser maior que o início");
            finalIntervalo = lerInteiro("Informe o final do intervalo: ");
        }


        boolean exibirPares = lerBoolean("Deseja exibir pares? (true / false)");

        System.out.println("\nNúmeros " + (exibirPares ? "pares" : "impares") +
                            " no intervalo de " + inicioIntervalo + " até " + finalIntervalo + ":");

        for(int i = inicioIntervalo; i <= finalIntervalo; i++) {
            if(exibirPares && i % 2 == 0){
                    System.out.println(i);
            } else if(!exibirPares && i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    private static boolean lerBoolean(String mensagem) {
        System.out.println(mensagem);
        while(!scanner.hasNextBoolean()) {
            System.out.println("Entrada inválida! Digite 'true' ou 'false': ");
            scanner.next();
        }

        return scanner.nextBoolean();
    }

    private static int lerInteiro(String mensagem){
        System.out.println(mensagem);
        while(!scanner.hasNextInt()){
            System.out.println("Entrada inválida! Digite um número inteiro: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}