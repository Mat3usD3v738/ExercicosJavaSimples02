import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InputMismatchException {

        
        Scanner input = new Scanner(System.in);
        long tamanhoDaBase , NumeroTotal = 0 , qVesesQSeRepete;
        try{
        System.out.println("Digite o numero do tamanho da base da pirãmide");
        tamanhoDaBase = input.nextLong();
        input.close();
        for (qVesesQSeRepete = 0 ; qVesesQSeRepete < tamanhoDaBase ; qVesesQSeRepete++) {
            NumeroTotal += tamanhoDaBase - qVesesQSeRepete  ;
        }
        System.out.println(NumeroTotal);
    }catch(InputMismatchException e){
        System.out.println("____________________________________");
        System.out.println("\nTente novamente");
        System.out.println("Você deve escrever um número , não letras ou sinais ");
        System.out.println("Exeçao : " +e);
System.out.println("\n");
System.out.println('\n');
    }
}
}
