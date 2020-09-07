
package SchoolMail;
import java.util.Scanner;
public class EmailApp {
    private String fname;
    private String lname;
    private String email;
    private String department;
    private String password;
    private int mailbox;
    private String aemail;
    private String company;
    //constructor to receive first and last name
    public EmailApp(){
        Scanner in = new Scanner(System.in);
        this.fname = fname;
        this.lname = lname;
        System.out.println("Enter Your Finst Name");
        fname = in.nextLine();
        System.out.println("Enter Your Last Name");
        lname = in.nextLine();

        //System.out.println("User name is: " +fname +" "+lname);

        //call a method asking for the department
        this.department = setDepartment();
        System.out.println("Your department is: " + department);

        //call a method that generate a random password
        this.password = randompass(8);
        System.out.println("Your password is: " + password);

        //combine elements to generate email
        this.company = "raphichub.com";
        email = fname.toLowerCase() + "." + lname.toLowerCase() + "@" + department + "." + company;
        System.out.println("Your email is: " + email);

    }
    //Ask for department
    private String setDepartment(){
        System.out.print("Department Code\n1 for ComputerScience\n2 for Accountance\n3 for Medilab\n4 for Eng,\no none\nEnter Department code: ");
        Scanner in = new Scanner(System.in);
        int depChoose = in.nextInt();
        if(depChoose == 1){
            return "computerScience";
        }else if(depChoose == 2){
            return "Accountance";
        }else if(depChoose == 3){
            return "Medilab";
        }else if(depChoose == 4) {
            return "Eng.";
        }else {return "";}
    }
    //Generate random password
    private String randompass(int lenght){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$&*!*";
        char[] password = new char[lenght];
        for(int i=0; i<lenght; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //set mailbox capacity

    public void setMailbox(int box) {
        this.mailbox = box;
    }

    //set alternat email

    public void setAemail(String aemail) {
        this.aemail = aemail;
    }

    //change password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailbox() {
        return mailbox;
    }

    public String getAemail() {
        return aemail;
    }

    public String getPassword() {
        return password;
    }

}