import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    Scanner scanner = new Scanner(System.in);
    FileManager(){

    }
   public void readFromFileUser(ArrayList<User> userList){
        try{
            FileReader fileReader = new FileReader("User.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while((data = bufferedReader.readLine()) != null){
                String [] arrayData  = data.split(",");
                User user = new User(arrayData[0],arrayData[1],arrayData[2]);
                userList.add(user);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException err){
            err.printStackTrace();
        }
   }
    public void readFromFileEmployee(ArrayList<Employee> employeeList){
        try{
            FileReader fileReader = new FileReader("Employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while((data = bufferedReader.readLine()) != null){
                String [] arrayData  = data.split(",");
                Employee employee = new Employee(arrayData[0],Integer.parseInt(arrayData[1]),arrayData[2],arrayData[3],arrayData[4]);
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException err){
            err.printStackTrace();
        }
    }

    public void writeFileUser(ArrayList<User> userLists) throws IOException {
      try{
          FileWriter fileWriter = new FileWriter("User.csv");
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
          for(User item : userLists){
                bufferedWriter.write(item.userInfo());
                bufferedWriter.newLine();
          }
          bufferedWriter.close();
          fileWriter.close();
      }
      catch (IOException err){
          err.printStackTrace();
      }

    }
    public void writeFileEmployee(ArrayList<Employee> employeeList) throws IOException {
        try{
            FileWriter fileWriter = new FileWriter("Employee.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Employee item : employeeList){
                bufferedWriter.write(item.employeeInfo());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (IOException err){
            err.printStackTrace();
        }

    }
//    public void writeFileDepartment(ArrayList<Department> departmentList) throws IOException {
//        try{
//            FileWriter fileWriter = new FileWriter("Employee.csv",true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for(Department item : departmentList){
//                bufferedWriter.write(item.toString());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//            fileWriter.close();
//        }
//        catch (IOException err){
//            err.printStackTrace();
//        }
//
//    }

}
