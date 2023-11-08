import java.util.Scanner;

public class AuthoringAssistant002 {
    
    // Menu display method
    public static void printMenu() {
        System.out.println("\nMENU");
        System.out.println("c - Number of non-whitespace characters");
        System.out.println("w - Number of words");
        System.out.println("f - Find text");
        System.out.println("r - Replace all !'s");
        System.out.println("s - Shorten spaces");
        System.out.println("q - Quit\n");
        System.out.println("Choose an option: ");
    }

    // Count non-whitespace characters
    public static int getNumOfNonWSCharacters(String text) {
        return (int) text.chars().filter(ch -> !Character.isWhitespace(ch)).count();
    }

    // Count words
    public static int getNumOfWords(String text) {
        return text.split("\\s+").length;
    }

    // Find text occurrences
    public static int findText(String toFind, String text) {
        return text.split(toFind, -1).length - 1;
    }

    // Replace ! with .
    public static String replaceExclamation(String text) {
        return text.replace('!', '.');
    }

    // Shorten spaces
    public static String shortenSpace(String text) {
        return text.replaceAll("\\s+", " ");
    }

    // Execute user's menu choice
    public static void executeMenu(char choice, String text, Scanner scanner) {
        switch (choice) {
            case 'c':
                System.out.println("Number of non-whitespace characters: " + getNumOfNonWSCharacters(text));
                break;
            case 'w':
                System.out.println("Number of words: " + getNumOfWords(text));
                break;
            case 'f':
                System.out.print("Enter a word or phrase to be found: ");
                String toFind = scanner.nextLine();
                System.out.println("\"" + toFind + "\" instances: " + findText(toFind, text));
                break;
            case 'r':
                System.out.println("Edited text: " + replaceExclamation(text));
                break;
            case 's':
                System.out.println("Edited text: " + shortenSpace(text));
                break;
            case 'q':
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sample text:\n");
        String text = scanner.nextLine();

        System.out.println("\nYou entered: " + text);

        do {
            printMenu();
            char choice = scanner.nextLine().charAt(0);
            executeMenu(choice, text, scanner);
        } while (true);
    }
}
