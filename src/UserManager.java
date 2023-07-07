import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    private ArrayList<User> userList;
    private MenuManager menuManager;
    private Scanner scanner;

    private FileManager fileManager;
    public UserManager() {
        this.userList = new ArrayList<>();
        this.menuManager = new MenuManager();
        this.scanner = new Scanner(System.in);
        this.fileManager = new FileManager();
        this.fileManager.readFromFileUser(this.userList);

    }

    public void register() throws IOException {
        System.out.println("Input User ID :");
        String userId = scanner.nextLine();
       for (int i = 0 ; i < this.userList.size();i++){
           if(this.userList.get(i).getUserId().equals(userId) ){
               System.out.println("User existed");
               break;
           }
           else {
               System.out.print("Input User Name :");
               String userName = scanner.nextLine();
               System.out.println("Input User Password :");
               String userPassword = scanner.nextLine();
               User newUser = new User(userId,userName,userPassword);
               System.out.println("User %s Register Successfully".formatted(userName));
               this.userList.add(newUser);
               this.fileManager.writeFileUser(this.userList);

           }
       }
    }

    public void login() throws IOException {
        System.out.println("Input UserName : ");
        String userName = this.scanner.nextLine();
        System.out.println("Input Password:  ");
        String userPassword = this.scanner.nextLine();
        for (int i = 0; i < this.userList.size(); i++) {
            if (this.userList.get(i).getUserName().equals(userName) && this.userList.get(i).getUserPassword().equals(userPassword)) {
                 this.menuManager.showMainMenu();
            } else {
                System.out.println("You're not register yet. Please Register first");
            }
        }
    }

    public void showAllUser() {
        for (User user : this.userList) {
            System.out.println(user.toString());
        }
    }


}
