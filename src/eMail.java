import java.util.Scanner;


/**
 * This is an email application!
 *
 * @author Jitesh Motati
 * @version 1.0
 * @since 05/25/2019
 *
 */
public class eMail {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String emailID;
    private int mailboxCapacity;
    private int defaultPassLength = 10;
    private String alternateEmail;
    private String emailSuffix = "yourcompany.com";

    //Constructor to get first and last name
    public eMail(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department, return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Call a method to return a random password.
        this.password = randomPassword(defaultPassLength);
        System.out.println("Your password is: " + this.password);

        //Make an email id
        emailID = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + emailSuffix;
        System.out.println("Your email is: " + emailID);
    }

    //Ask for department
    private String setDepartment() {
        System.out.print("Enter the department:\n 1. Sales\n 2. Development\n 3. Accounting\n 0. None\n");
        Scanner scan = new Scanner(System.in);
        int deptChoice = scan.nextInt();
        if (deptChoice == 1) {
            //this.department = "Sales";
            return "sales";
        } else if (deptChoice == 2) {
            //this.department = "Development";
            return "dev";
        } else if (deptChoice == 3) {
            //this.department = "Accounting";
            return "acct";
        } else {
            //this.department = "None";
            return "None";
        }
    }

    //Generate a rand password
    private String randomPassword(int length) {
        String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * setPassword.length());
            password[i] = setPassword.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity

    //Set the alternate email

    //Change the password
}
