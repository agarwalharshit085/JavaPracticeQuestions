import java.util.Scanner;

class Substring{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        System.out.println("Enter the string to check: ");
        String subString = scanner.nextLine();
        
        boolean found = isSubstring(mainString, subString);
        
        if (found) {
            System.out.println("The string '" + subString + "' is found completely in the main string.");
        } else {
            System.out.println("The string '" + subString + "' is not found completely in the main string.");
        }
        
        scanner.close();
    }
    
    public static boolean isSubstring(String mainString, String subString) {
        int mainLength = mainString.length();
        int subLength = subString.length();
        
        if (subLength > mainLength) {
            return false;
        }
        
        for (int i = 0; i <= mainLength - subLength; i++) {
            int j;
            for (j = 0; j < subLength; j++) {
                if (mainString.charAt(i + j) != subString.charAt(j)) {
                    break;
                }
            }
            if (j == subLength) {
                return true;
            }
        }
        return false;
    }
}
