///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Address generator
// Course:          CS 200 Summer 2024
//
// Author:          Teresa Campbell
// Email:           tjcampbe@wisc.edu
// Lecturer's Name: Jim Willias
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Worked in a group with Minxing Zhao and Paras Kalra
//
///////////////////////////////// REFLECTION ///////////////////////////////////
//
// None
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

package abc;

import java.util.Scanner;

/**
 * The Address class prompts the user to enter a street number and name,
 * validates the input, and prints the complete address.
 */

public class Address {

    /**
     * Main method that reads user input for street number and name,
     * validates the input, and prints the complete address.
     *
     * @param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int streetNumber = 0;
        String streetName = "";
        boolean haveNameAndNumber = false;

        do {
            System.out.print("Enter street number: ");
            if (scnr.hasNextInt()) {
                streetNumber = scnr.nextInt();
                scnr.nextLine(); // Consume the newline character left after nextInt()

                System.out.print("Enter street name: ");
                streetName = scnr.nextLine();

                if (!streetName.isEmpty()) {
                    haveNameAndNumber = true;
                } else {
                    System.out.println("Error: Street name cannot be empty.");
                }
            } else {
                System.out.println("Error: Not a valid street number.");
                scnr.nextLine();
            }
        } while (!haveNameAndNumber);

        if (haveNameAndNumber) {
            System.out.println("Address: " + streetNumber + " " + streetName);
        } else {
            System.out.println("Unable to read street name and number.");
        }

        scnr.close();
    }
}
