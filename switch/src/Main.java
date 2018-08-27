import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int age=scanner.nextInt();

        switch(age){
            case 1:
                System.out.println("masz roczek");
            break;
            case 2:
                System.out.println("masz dwa latka");
            break;
            case 18:
                System.out.println("Jesteś osiemnastolatkiem");
            break;
            default:
                System.out.println("Nie ma takiej opcji wieku");
            break;
        }
    }
}
