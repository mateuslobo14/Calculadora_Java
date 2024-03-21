import java.util.Locale;
import java.util.Scanner;

public class CalculadoraApp {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Double valorum;
    Double valordois;
    String operacao;
    boolean continuar;
    do {


        System.out.println("Digite um valor: ");
        valorum = scanner.nextDouble();
        System.out.println("Digite a operaçao( +,-, /, *  ): ");
        operacao = scanner.next();
        System.out.println("Digite o valor dois: ");
        valordois = scanner.nextDouble();

        System.out.println("Resultado: " + realizarCalculo(valorum, valordois, operacao));
    continuar = verificarNovaOperacao();
    }while (continuar);
}
public static boolean verificarNovaOperacao(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Deseja realizar uma nova operação ? (S ou N)");
    return  !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");

}
public static Double realizarCalculo(Double valorum,Double valordois, String operacao){
    Double respostaCalculo = 0.0;
    switch (operacao){
        case "+":
            respostaCalculo =valorum + valordois;
            break;
        case "-":
            respostaCalculo = valorum - valordois;
            break;
        case "*":
            respostaCalculo = valorum * valordois;
            break;
        case "/":
            respostaCalculo = valorum / valordois;
            break;
        default:
            System.out.println("Operação inválida =(");

    }
return respostaCalculo;
}

}
