import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero del 1 al 6:");
        int numero = scan.nextInt();

        switch (numero){
            case 1: System.out.println("one");break;
            case 2: System.out.println("two");break;
            case 3: System.out.println("three");break;
            case 4: System.out.println("four");break;
            case 5: System.out.println("five");break;
            case 6: System.out.println("six");break;
        }
    }
}
