import java.util.Random;
import java.util.Scanner;


public class Game {
    public static void main(String[] args){
        String[] words = {"zegar", "lampa", "obrazek", "kwiat", "tomek", "stół", "tablica"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int fails = 0;
        int round = 0;

        String response;
        while (fails <= 3){
            String word = words[random.nextInt(words.length)];
            String hashWord = word;


            for (int i = 0; i < round; i += 5) {
                char randomChar = hashWord.charAt(random.nextInt(hashWord.length()));
                if(randomChar == '*'){
                    i--;
                    continue;
                }
                hashWord = hashWord.replaceFirst(String.valueOf(randomChar), "*");
            }

            System.out.println("Twoje wylosowane słowo: " + hashWord);
            System.out.print("Podaj słowo: ");
            response = scanner.nextLine();

            if(word.equalsIgnoreCase(response)){
                System.out.println("Gratuluje!");
                round++;
            }else{
                System.out.println("Nie udało się odgadnąć");
                fails++;
            }
        }
        System.out.println("Koniec gry! Twoje punkty: " + round);
    }
}