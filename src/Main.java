import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        UserManager userManager = new UserManager();
//        MenuManager menuManager = new MenuManager();
//        int userChoice = -1;
//        while (userChoice != 0){
//            menuManager.showLoginMenu();
//            userChoice = scanner.nextInt();
//            switch (userChoice) {
//                case 1 -> userManager.login();
//                case 2 -> userManager.register();
//            }
//        }

            DepartmentManager departmentManager = new DepartmentManager();
            departmentManager.listEmployee();
    }
}