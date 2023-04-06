
import java.util.Scanner;

public class decimalToBinary {
    public static String decimalToBinaryCom(int decimal) {
        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
        if (binary.equals("")) {
            binary = "0";
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binary = decimalToBinaryCom(decimal);
        System.out.println("Binary representation: " + binary);
        scanner.close();
    }
}

import java.util.*;

public class englishToMorse {
    public static String englishToMorseCon(String text) {
        HashMap<Character, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put('a', ".-");
        morseCodeMap.put('b', "-...");
        morseCodeMap.put('c', "-.-.");
        morseCodeMap.put('d', "-..");
        morseCodeMap.put('e', ".");
        morseCodeMap.put('f', "..-.");
        morseCodeMap.put('g', "--.");
        morseCodeMap.put('h', "....");
        morseCodeMap.put('i', "..");
        morseCodeMap.put('j', ".---");
        morseCodeMap.put('k', "-.-");
        morseCodeMap.put('l', ".-..");
        morseCodeMap.put('m', "--");
        morseCodeMap.put('n', "-.");
        morseCodeMap.put('o', "---");
        morseCodeMap.put('p', ".--.");
        morseCodeMap.put('q', "--.-");
        morseCodeMap.put('r', ".-.");
        morseCodeMap.put('s', "...");
        morseCodeMap.put('t', "-");
        morseCodeMap.put('u', "..-");
        morseCodeMap.put('v', "...-");
        morseCodeMap.put('w', ".--");
        morseCodeMap.put('x', "-..-");
        morseCodeMap.put('y', "-.--");
        morseCodeMap.put('z', "--..");
        morseCodeMap.put('0', "-----");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");

        char[] chars = text.toLowerCase().toCharArray();

        StringBuilder morseCode = new StringBuilder();
        for (char c : chars) {
            if (morseCodeMap.containsKey(c)) {
                morseCode.append(morseCodeMap.get(c)).append(" ");
            } else if (c == ' ') {
                morseCode.append(" ");
            }
        }

        return morseCode.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String english = sc.nextLine();
        String morse = englishToMorseCon(english);
        System.out.println(morse);
        sc.close();
    }
}

import java.util.*;

public class morseToEnglish {
    public static String morseToEnglis(String morseCode) {
        HashMap<String, Character> morseCodeMap = new HashMap<>();
        morseCodeMap.put(".-", 'a');
        morseCodeMap.put("-...", 'b');
        morseCodeMap.put("-.-.", 'c');
        morseCodeMap.put("-..", 'd');
        morseCodeMap.put(".", 'e');
        morseCodeMap.put("..-.", 'f');
        morseCodeMap.put("--.", 'g');
        morseCodeMap.put("....", 'h');
        morseCodeMap.put("..", 'i');
        morseCodeMap.put(".---", 'j');
        morseCodeMap.put("-.-", 'k');
        morseCodeMap.put(".-..", 'l');
        morseCodeMap.put("--", 'm');
        morseCodeMap.put("-.", 'n');
        morseCodeMap.put("---", 'o');
        morseCodeMap.put(".--.", 'p');
        morseCodeMap.put("--.-", 'q');
        morseCodeMap.put(".-.", 'r');
        morseCodeMap.put("...", 's');
        morseCodeMap.put("-", 't');
        morseCodeMap.put("..-", 'u');
        morseCodeMap.put("...-", 'v');
        morseCodeMap.put(".--", 'w');
        morseCodeMap.put("-..-", 'x');
        morseCodeMap.put("-.--", 'y');
        morseCodeMap.put("--..", 'z');
        morseCodeMap.put("-----", '0');
        morseCodeMap.put(".----", '1');
        morseCodeMap.put("..---", '2');
        morseCodeMap.put("...--", '3');
        morseCodeMap.put("....-", '4');
        morseCodeMap.put(".....", '5');
        morseCodeMap.put("-....", '6');
        morseCodeMap.put("--...", '7');
        morseCodeMap.put("---..", '8');
        morseCodeMap.put("----.", '9');

        String[] sequences = morseCode.split(" ");
        StringBuilder englishText = new StringBuilder();
        for (String sequence : sequences) {
            if (sequence.equals("")) {
                englishText.append(" ");
            } else if (morseCodeMap.containsKey(sequence)) {
                englishText.append(morseCodeMap.get(sequence));
            }
        }

        return englishText.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(morseToEnglis(". . .  . . ."));
        sc.close();
        return;
    }

}

import java.nio.charset.StandardCharsets;

public class url {

    public static String encodeAsUrl(String text) {
        String encoded = "";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        for (byte b : bytes) {
            if (Character.isLetterOrDigit((char) b) || b == '-' || b == '_' || b == '.' || b == '~') {
                encoded += (char) b;
            } else {
                encoded += "%" + String.format("%X", b);
            }
        }
        return encoded;
    }

    public static void main(String[] args) {
        System.out.println(encodeAsUrl("https//www.google.com"));
    }
}
