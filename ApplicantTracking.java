import java.sql.*;
import java.util.Scanner;

public class ApplicantTracking {
    static Scanner scan = new Scanner(System.in);
    public static void showAllApplicants(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Applicant_tracking ");
            while(resultSet.next()){
                System.out.println(resultSet.getString("Temp_ID"));
                System.out.println(resultSet.getString("First_Name"));
                System.out.println(resultSet.getString("Last_Name"));
                System.out.println(resultSet.getString("Email"));
                System.out.println(resultSet.getString("Phone_Number"));
                System.out.println(resultSet.getString("Address"));
                System.out.println(resultSet.getString("Skills"));
                System.out.println(resultSet.getString("Work_Experience"));
                System.out.println("============================================================");
            }
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void createNewApplicant(){
        System.out.println("=========== Creating Applicant =============");
        System.out.print("First Name: ");
        String firstName = scan.nextLine();
        System.out.print("Last Name: ");
        String lastName = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Phone Number: ");
        String phonenumber = scan.nextLine();
        System.out.print("Address: ");
        String address = scan.nextLine();
        System.out.print("Skills: ");
        String skills = scan.nextLine();
        System.out.print("Work Experience: ");
        String experience = scan.nextLine();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
            String stmt = "INSERT INTO `wozfinal`.`Applicant_Tracking` (`First_Name`, `Last_Name`, `Email`, `Phone_Number`, `Address`, `Skills`, `Work_Experience`) VALUES (?,?,?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(stmt);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2,lastName);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4,phonenumber);
            preparedStatement.setString(5,address);
            preparedStatement.setString(6,skills);
            preparedStatement.setString(7,experience);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.print("New Applicant " + firstName + " " + lastName + " has been created.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void deleteApplicant() {
        System.out.println("=========== Deleting Applicant =============");
        System.out.println("Who would you like to delete?");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select temp_id, first_name, last_name from Applicant_tracking" );
            while(resultSet.next()){
                System.out.println(resultSet.getString("temp_id"));
                System.out.println(resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
                System.out.println("======================");
            }
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.print("Please input their ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
            String stmt = ("delete from Applicant_Tracking where temp_id = ?");
            PreparedStatement preparedStatement = connection.prepareStatement(stmt);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            connection.close();
            System.out.print("Applicant has been deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void updateApplicant() {
        System.out.println("=========== Update Applicant =============");
        System.out.println("Who would you like to update?");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select temp_id, first_name, last_name from Applicant_tracking" );
            while(resultSet.next()){
                System.out.println(resultSet.getString("temp_id"));
                System.out.println(resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
                System.out.println("======================");
            }
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.print("Please input their ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.println("What would you like to update?");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Email");
        System.out.println("4. Phone Number");
        System.out.println("5. Address");
        System.out.println("6. Skills");
        System.out.println("7. Work Experience");
        System.out.print("Please input number of option: ");
        int option = scan.nextInt();
        scan.nextLine();
        if (option == 1){
            System.out.print("Please insert your update: ");
            String update = scan.nextLine();
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
                String stmt = ("update Applicant_Tracking set first_name = ? where temp_id = ? ;");
                PreparedStatement preparedStatement = connection.prepareStatement(stmt);
                preparedStatement.setString(1, update);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
                connection.close();
                System.out.println("Update successful.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (option == 2){
            System.out.print("Please insert your update: ");
            String update = scan.nextLine();
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
                String stmt = ("update Applicant_Tracking set last_name = ? where temp_id = ? ;");
                PreparedStatement preparedStatement = connection.prepareStatement(stmt);
                preparedStatement.setString(1, update);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
                connection.close();
                System.out.println("Update successful.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (option == 3){
            System.out.print("Please insert your update: ");
            String update = scan.nextLine();
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
                String stmt = ("update Applicant_Tracking set email = ? where temp_id = ? ;");
                PreparedStatement preparedStatement = connection.prepareStatement(stmt);
                preparedStatement.setString(1, update);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
                connection.close();
                System.out.println("Update successful.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (option == 4){
            System.out.print("Please insert your update: ");
            String update = scan.nextLine();
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
                String stmt = ("update Applicant_Tracking set phone_number = ? where temp_id = ? ;");
                PreparedStatement preparedStatement = connection.prepareStatement(stmt);
                preparedStatement.setString(1, update);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
                connection.close();
                System.out.println("Update successful.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (option == 5){
            System.out.print("Please insert your update: ");
            String update = scan.nextLine();
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
                String stmt = ("update Applicant_Tracking set address = ? where temp_id = ? ;");
                PreparedStatement preparedStatement = connection.prepareStatement(stmt);
                preparedStatement.setString(1, update);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
                connection.close();
                System.out.println("Update successful.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (option == 6){
            System.out.print("Please insert your update: ");
            String update = scan.nextLine();
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
                String stmt = ("update Applicant_Tracking set skills = ? where temp_id = ? ;");
                PreparedStatement preparedStatement = connection.prepareStatement(stmt);
                preparedStatement.setString(1, update);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
                connection.close();
                System.out.println("Update successful.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (option == 7){
            System.out.print("Please insert your update: ");
            String update = scan.nextLine();
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wozfinal", "root", "Password1!");
                String stmt = ("update Applicant_Tracking set work_experience = ? where temp_id = ? ;");
                PreparedStatement preparedStatement = connection.prepareStatement(stmt);
                preparedStatement.setString(1, update);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
                connection.close();
                System.out.println("Update successful.");
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}