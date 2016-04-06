package CeasarsCipher;

/**
 * Created by Daniel Solo on 03.04.2016.
 */
public class Cipher {
    private static String alphabetUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String alphabetLowerCase = "abcdefghijklmnopqrstuvwxyz";
    private static String numbers = "1234567890";

    public static String encode(String input, int key){
        StringBuilder encodedText = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            char symbol  = input.charAt(i);
            if ((symbol>='a') && (symbol <= 'z')){
                int index = alphabetLowerCase.indexOf(symbol);
                encodedText.append(alphabetLowerCase.charAt((index+key)%alphabetLowerCase.length()));
            }else if ((symbol >= 'A') && (symbol <= 'Z')){
                int index = alphabetUpperCase.indexOf(symbol);
                encodedText.append(alphabetUpperCase.charAt((index+key)%alphabetUpperCase.length()));
            }else if ((symbol>='0') && (symbol <= '9')){
                int index = numbers.indexOf(symbol);
                encodedText.append(numbers.charAt((index+key)%numbers.length()));
            }else{
                encodedText.append(symbol);
            }
        }
        return encodedText.toString();
    }

    public static String decode(String input, int key) {
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if ((symbol >= 'a') && (symbol <= 'z')) {
                int index = alphabetLowerCase.indexOf(symbol);
                decodedText.append(alphabetLowerCase.charAt((((index - key) % alphabetLowerCase.length())+alphabetUpperCase.length())%alphabetUpperCase.length()));
            } else if ((symbol >= 'A') && (symbol <= 'Z')) {
                int index = alphabetUpperCase.indexOf(symbol);
                decodedText.append(alphabetUpperCase.charAt((((index - key) % alphabetUpperCase.length())+alphabetLowerCase.length())%alphabetLowerCase.length()));
            } else if ((symbol >= '0') && (symbol <= '9')) {
                int index = numbers.indexOf(symbol);
                decodedText.append(numbers.charAt((((index - key) % numbers.length())+numbers.length())%numbers.length()));
            } else {
                decodedText.append(symbol);
            }
        }
        return decodedText.toString();
    }

}
