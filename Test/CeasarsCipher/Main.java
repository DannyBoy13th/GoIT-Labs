package CeasarsCipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Daniel Solo on 05.04.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to Cipher Machine. \nThis program is using Ceasar`s algorithm in order to encode/decode data using integer keys.\n");

        System.out.println("Please, enter the text you would like to encode: ");
        String inputText = inputReader.readLine();

        System.out.println("Enter a key: ");
        int key = Integer.parseInt(inputReader.readLine());

        String encodedText = Cipher.encode(inputText, key);
        System.out.println("Processing...\nENCODING COMPLETE\n\nBelow You can see encoded text: ");
        System.out.println(encodedText);
        System.out.println("\nHere you will find your decoded original: ");
        System.out.println(Cipher.decode(encodedText, key));

        ArrayList<String> weddingBouquet = new ArrayList<>();
        weddingBouquet.add("Red Rose");
        weddingBouquet.add("Violet Rose");
        weddingBouquet.add("Chamomile");
        weddingBouquet.add("Yellow Tulip");
        weddingBouquet.add("Blue Tulip");
        weddingBouquet.add("Regular Aster");

        System.out.println("\nBelow you can see a content of Wedding Bouquet from Module 3 in original state: \n");
        weddingBouquet.forEach(System.out::println);

        System.out.println("\nProcessing...\nENCODING COMPLETE\n\nBelow You can see encoded Wedding Bouquet content:\n ");
        for (int i = 0; i < weddingBouquet.size(); i++){
            String content = Cipher.encode(weddingBouquet.get(i), key);
            weddingBouquet.set(i, content);
        }
        weddingBouquet.forEach(System.out::println);

        System.out.println("\nHere you will find your decoded original of Wedding Bouquet content: \n");
        for (int i = 0; i<weddingBouquet.size(); i++){
            String content = Cipher.decode(weddingBouquet.get(i), key);
            weddingBouquet.set(i, content);
        }

        weddingBouquet.forEach(System.out::println);

    }
}
