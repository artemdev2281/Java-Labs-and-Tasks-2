package su.mtuci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import su.mtuci.stringutils.StringProcessor;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Program started.");

        try (java.io.InputStream input = Main.class.getClassLoader().getResourceAsStream("build-passport.properties")) {
            if (input != null) {
                java.util.Properties prop = new java.util.Properties();
                prop.load(input);
                System.out.println("======================================");
                System.out.println("Build Passport Information:");
                System.out.println("User: " + prop.getProperty("user"));
                System.out.println("OS: " + prop.getProperty("os"));
                System.out.println("Java Version: " + prop.getProperty("javaVersion"));
                System.out.println("Build Date: " + prop.getProperty("buildDate"));
                System.out.println("Message: " + prop.getProperty("welcomeMessage"));
                System.out.println("======================================");
            }
        } catch (java.io.IOException ex) {
            logger.error("Failed to read build-passport.properties: ", ex);
        }

        System.out.println("Welcome!");
        System.out.print("Please enter a string: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String reversed = StringProcessor.reverse(input);
        logger.info("Result (reversed string): {}", reversed);

        String capitalized = StringProcessor.capitalize(input);
        logger.info("Result (capitalized): {}", capitalized);

        logger.info("Program finished.");
    }
}
