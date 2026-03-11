import java.util.Scanner;

public class Ler {
    public static void main(String[] args) {

    //Scanner class
    int numero;
    System.out.println("Digite um número inteiro: ");
    Scanner leitor = new Scanner(System.in);

    numero = leitor.nextInt();
    System.out.println("O número escolhido foi: " + numero);
    leitor.close();
    }
    
}
