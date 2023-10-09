package splitter;

import java.util.Scanner;

public class Splitter {
    public static void main(String[] args) {
        System.out.println("Enter a sentence specified by spaces only: ");
        // Add your code
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        //Looping through the array of words printing each one
        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}
