package InputSaver;

import java.io.*;


public class Main {
    private static String encodedFileName = "EncodedInput.txt";
    private static String decodedFileName = "DecodedInput.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter Text you would like to save:");
        String inputText = inputReader.readLine();

        System.out.println("Enter a key: ");
        int key = Integer.parseInt(inputReader.readLine());

        String encodedText = Cipher.encode(inputText, key);

        FileSaver.saveFile(encodedFileName, encodedText);
        FileSaver.saveFile(decodedFileName, Cipher.decode(encodedText, key));

        System.out.println("Processing...\nENCODING COMPLETE\n\nBelow You can see encoded text: ");

        System.out.println(encodedText);
        System.out.println("\nHere you will find your decoded original: ");
        System.out.println(CeasarsCipher.Cipher.decode(encodedText, key));
        System.out.println("\nYou will find your saved data in your root depository. ");
    }
}
