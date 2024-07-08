import java.util.HashMap;

public class Morsecode{

    private static final HashMap<Character, String> morsecodeMap = new HashMap<>();

        static {
            morsecodeMap.put('A', ".-");
            morsecodeMap.put('B', "-...");
            morsecodeMap.put('c', "-.-.");
            morsecodeMap.put('D', "-..");
            morsecodeMap.put('E', ".");
            morsecodeMap.put('F', "..-.");
            morsecodeMap.put('G', "--.");
            morsecodeMap.put('H', "....");
            morsecodeMap.put('I', "..");
            morsecodeMap.put('J', ".---");
            morsecodeMap.put('K', "-.-");
            morsecodeMap.put('L', ".-..");
            morsecodeMap.put('M', "--");
            morsecodeMap.put('N', "-.");
            morsecodeMap.put('O', "---");
            morsecodeMap.put('P', ".--.");
            morsecodeMap.put('Q', "--.-");
            morsecodeMap.put('R', ".-.");
            morsecodeMap.put('S', "...");
            morsecodeMap.put('T', "-");
            morsecodeMap.put('U', "..-");
            morsecodeMap.put('V', "...-");
            morsecodeMap.put('W', ".--");
            morsecodeMap.put('X', "-..-");
            morsecodeMap.put('Y', "-.--");
            morsecodeMap.put('Z', "--..");
            morsecodeMap.put('1', ".----");
            morsecodeMap.put('2', "..---");
            morsecodeMap.put('3', "...--");
            morsecodeMap.put('4', "....-");
            morsecodeMap.put('5', ".....");
            morsecodeMap.put('6', "-....");
            morsecodeMap.put('7', "--...");
            morsecodeMap.put('8', "---..");
            morsecodeMap.put('9', "----.");
            morsecodeMap.put('0', "-----");
            morsecodeMap.put(' ', " / ");
        }

        public static String textToMorsecode(String text){
            StringBuilder morseCode = new StringBuilder();

            for (char c: text.toUpperCase(). toCharArray()) {
                String morseChar = morsecodeMap.get(c);
                if(morseChar != null) {
                    morseCode.append(morseChar).append(" ");
                }

            }

            return morseCode.toString().trim();
        }

        public static void main(String[] agrs) {
            String text = " ayush ";
            String morseCode = textToMorsecode(text);
            System.out.println("Orginal Text"  + text);
            System.out.println("Morse Code:"  + morseCode);
        }
    } 