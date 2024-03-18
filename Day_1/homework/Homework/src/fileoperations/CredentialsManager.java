package fileoperations;
import java.io.*;
import java.util.Scanner;

public class CredentialsManager {

    private static final File Credentials = new File("Credentials.txt");

    private String getInput () { //used for all instances where user input is needed
        Scanner userInputScanner = new Scanner(System.in);
        return (userInputScanner.nextLine());
    }

    private static void writeCred (String userInput) { //used to add userInput as a new line in Credentials file
        try (FileWriter writer = new FileWriter(Credentials, true)) {
            writer.write("\n" + userInput);
        } catch (IOException e) {
            System.out.println("Failed to find Credentials.txt");
            throw new RuntimeException(e);
        }
    }

    private static Boolean readCred (String userInput) { //returns true if userInput exists as a line in Credentials file
        try (FileReader reader = new FileReader(Credentials)){
            Scanner checkLines = new Scanner(Credentials);

            while (checkLines.hasNextLine()) {
                if ((checkLines.nextLine()).equals(userInput)) {
                    reader.close();
                    return true;
                }
            }

            reader.close();
            return false;
        } catch (IOException e) {
            System.out.println("Failed to find Credentials.txt");
            throw new RuntimeException(e);
        }
    }

    public void newOrExistingUser () { //prompts user to ask if they're logging in or registering
        System.out.println("Are you a new or existing user?\n(1) Login\n(2) Register");
        String userInput = getInput();

        if (userInput.contentEquals("1")) {
            loginExistingUser();
        } else if (userInput.contentEquals("2")) {
            registerNewUser();
        } else {
            System.out.println("Invalid input. Please enter 1 or 2.");
        }
    }

    private void loginExistingUser () { //logic for logging in. Calls the reader to check if a username exists and proclaims success if it does. Ends program if it does not exist.
        System.out.println("Enter your username: ");
        String username = getInput();

        if (readCred(username)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Username not found. Please Register before logging in.");
        }
    }

    private void registerNewUser () { //logic for registering a new user. If username already exists, prompts user to enter a new username
        System.out.println("Enter your desired username: ");
        String username = getInput();

        if (!readCred(username)) {
            writeCred(username);
            System.out.println("Registration successful!");
        } else {
            System.out.println("Username already exists. Please select a different username and try again.");
            registerNewUser();
        }
    }
}


