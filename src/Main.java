import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();
        UserManager userManager = new UserManager();
        MenuManager menuManager = new MenuManager();
        int userChoice = -1;
        while (userChoice != 0){
            menuManager.showLoginMenu();
            userChoice = scanner.nextInt();
            switch (userChoice){

                case 1:
                     userManager.login();
                    break;
                case 2 :
                    System.out.println("Input User ID :");
                    scanner.nextLine();
                    int userId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input User Name :");
                    String userName = scanner.nextLine();
                    System.out.println("Input User Password :");
                    String userPassword = scanner.nextLine();
                    User newUser = new User(userId,userName,userPassword);
                    System.out.println("User %s Register Successfully".formatted(userName));
                    userManager.register(newUser);
                    break;
//
            }
        }


    }
}