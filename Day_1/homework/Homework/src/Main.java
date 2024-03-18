import fileoperations.CredentialsManager;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CredentialsManager test = new CredentialsManager();

        test.newOrExistingUser();
    }
}