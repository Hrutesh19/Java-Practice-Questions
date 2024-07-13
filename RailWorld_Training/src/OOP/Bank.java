package OOP;

/***
 * 10. Create a class called Bank with attributes name and location.
 * Include methods add_branch() and list_branches() to add a new branch
 * and list all existing branches of the bank, respectively.
 */
import java.util.ArrayList;

public class Bank {
    private String name;
    private String location;
    private ArrayList<String> branches;

    // Constructor
    public Bank(String name, String location) {
        this.name = name;
        this.location = location;
        this.branches = new ArrayList<>();
    }

    // Method to add a new branch
    public void addBranch(String branchName, String branchLocation) {
        String branch = branchName + ", " + branchLocation;
        branches.add(branch);
        System.out.println("Branch added: " + branch);
    }

    // Method to list all existing branches
    public void listBranches() {
        if (branches.isEmpty()) {
            System.out.println("No branches available.");
        } else {
            System.out.println("List of Branches:");
            for (String branch : branches) {
                System.out.println(branch);
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Bank myBank = new Bank("SBI", "Pune");
        myBank.addBranch("Ambegaon BK", "Ambegaon Pune");
        myBank.addBranch("Vadgaon Bk", "Near Navale bridge Pune");
        myBank.listBranches();
    }
}

