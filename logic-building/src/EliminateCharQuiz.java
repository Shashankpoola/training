//public class EliminateCharQuiz {
//    public static void main(String[] args) {
//        String input = "Hello - @#$this is a test! 123";
//        String result = eliminateSymbols(input);
//        System.out.println(result);
//    }
//    
//    public static String eliminateSymbols(String input) {
//        StringBuilder result = new StringBuilder();
//        
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//            if (Character.isLetter(c)) { // Check if the character is a letter
//                result.append(c);
//            }
//        }
//        
//        return result.toString();
//    }
//}


public class EliminateCharQuiz {
    public static void main(String[] args) {
        String input = "Hello, this is a test! 123";
        String result = eliminateSpaces(input);
        System.out.println(result);
    }
    
    public static String eliminateSpaces(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isWhitespace(c)) { // Check if the character is not a space
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
