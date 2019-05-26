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
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to get first and last name
    public eMail(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department, return the department
        this.department = setDepartment();
    }

    //Ask for department
    private String setDepartment() {
        System.out.print("Enter the department: \n1. Sales\n 2. For Development\n 3. Accounting\n 0. None");
        Scanner scan = new Scanner(System.in);
        int deptChoice = scan.nextInt();
        if (deptChoice == 1) {
            return "sales";
        } else if (deptChoice == 2) {
            return "dev";
        } else if (deptChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    //Set the mailbox capacity

    //Set the alternate email

    //Change the password
}
