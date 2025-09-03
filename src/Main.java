import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        gerarTabuada();
    }

    public static void gerarTabuada(){
        System.out.println("Informe a tabuada que você quer gerar: ");
        int numeroTabuada = scanner.nextInt();
        for(int i = 1; i < 10; i++){
            int resultado = i * numeroTabuada;
            System.out.printf("%d * %d = %d\n", i, numeroTabuada, resultado);
        }
    }
}