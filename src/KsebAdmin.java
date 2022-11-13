import java.sql.*;
import java.util.Scanner;

public class KsebAdmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("select option");
            System.out.println("1.add");
            System.out.println("2.search");
            System.out.println("3.view");
            System.out.println("4.update");
            System.out.println("5.delete");
            System.out.println("6.generate bill");
            System.out.println("7.view all bill");
            System.out.println("8.top 2 bill");
            System.out.println("9.exit");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("You entered into insert section !!!");
                    System.out.println("name");
                    String name = sc.next();
                    System.out.println("address");
                    String address = sc.next();
                    System.out.println("phone");
                    String phone = sc.next();
                    System.out.println("cust code");
                    int custCode = sc.nextInt();
                    System.out.println("email");
                    String email = sc.next();
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kseb_db", "root", "");
                        String sql = "INSERT INTO `customer`(`Name`, `Address`, `Phone_num`, `Cust_code`, `Email`) VALUES (?,?,?,?,?)";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setString(1,name);
                        stmt.setString(2,address);
                        stmt.setString(3,phone);
                        stmt.setInt(4,custCode);
                        stmt.setString(5,email);
                        stmt.executeUpdate();

                    }
                    catch (Exception e){
                        System.out.println(e);
                    }

                    break;
                case 2:
                    System.out.println("You entered into searching section !!!");
                    System.out.println("1.search using name");
                    System.out.println("2.search using phone number");
                    System.out.println("3.search using code");
                    System.out.println("4.Exit");
                    System.out.println("enter the choice");
                    int choice1 = sc.nextInt();
                    switch (choice1){
                        case 1:
                            System.out.println("enter the name");
                            name = sc.next();
                            try{
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kseb_db", "root", "");
                                String sql = "SELECT `Name`, `Address`, `Phone_num`, `Cust_code`, `Email` FROM `customer` WHERE `Name`='"+name+"'";
                                Statement stmt = con.createStatement();
                                ResultSet rs = stmt.executeQuery(sql);
                                while(rs.next()){
                                    name = rs.getString("Name");
                                    address = rs.getString("Address");
                                    phone = rs.getString("Phone_num");
                                    custCode = rs.getInt("Cust_code");
                                    email = rs.getString("Email");
                                    System.out.println("name = "+name);
                                    System.out.println("address = "+address);
                                    System.out.println("phone number = "+phone);
                                    System.out.println("customer code = "+custCode);
                                    System.out.println("Email id = "+email+'\n');
                                }
                            }
                            catch (Exception e){
                                System.out.println(e);
                            }
                            break;
                        case 2:
                            System.out.println("enter the phone number");
                            phone = sc.next();
                            try{
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kseb_db", "root", "");
                                String sql = "SELECT `Name`, `Address`, `Phone_num`, `Cust_code`, `Email` FROM `customer` WHERE `Phone_num`='"+phone+"'";
                                Statement stmt = con.createStatement();
                                ResultSet rs = stmt.executeQuery(sql);
                                while(rs.next()){
                                    name = rs.getString("Name");
                                    address = rs.getString("Address");
                                    phone = rs.getString("Phone_num");
                                    custCode = rs.getInt("Cust_code");
                                    email = rs.getString("Email");
                                    System.out.println("name = "+name);
                                    System.out.println("address = "+address);
                                    System.out.println("phone number = "+phone);
                                    System.out.println("customer code = "+custCode);
                                    System.out.println("Email id = "+email+'\n');
                                }
                            }
                            catch (Exception e){
                                System.out.println(e);
                            }
                            break;

                        case 3:
                            System.out.println("enter the customer code ");
                            custCode = sc.nextInt();
                            try{
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kseb_db", "root", "");
                                String sql = "SELECT `Name`, `Address`, `Phone_num`, `Cust_code`, `Email` FROM `customer` WHERE `Cust_code`='"+custCode+"'";
                                Statement stmt = con.createStatement();
                                ResultSet rs = stmt.executeQuery(sql);
                                while(rs.next()){
                                    name = rs.getString("Name");
                                    address = rs.getString("Address");
                                    phone = rs.getString("Phone_num");
                                    custCode = rs.getInt("Cust_code");
                                    email = rs.getString("Email");
                                    System.out.println("name = "+name);
                                    System.out.println("address = "+address);
                                    System.out.println("phone number = "+phone);
                                    System.out.println("customer code = "+custCode);
                                    System.out.println("Email id = "+email+'\n');
                                }
                            }
                            catch (Exception e){
                                System.out.println(e);
                            }
                            break;

                        case 4:
                            System.exit(0);

                    }


                    break;
                case 3:
                    System.out.println("view the details");
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kseb_db", "root", "");
                        String sql = "SELECT `Name`, `Address`, `Phone_num`, `Cust_code`, `Email` FROM `customer` ";
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while(rs.next()){
                            name = rs.getString("Name");
                            address = rs.getString("Address");
                            phone = rs.getString("Phone_num");
                            custCode = rs.getInt("Cust_code");
                            email = rs.getString("Email");
                            System.out.println("name = "+name);
                            System.out.println("address = "+address);
                            System.out.println("phone number = "+phone);
                            System.out.println("customer code = "+custCode);
                            System.out.println("Email id = "+email+'\n');
                        }
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.println("Update the details");

                    break;

                case 5:
                    System.out.println("Delete the details");

                    break;

                case 6:
                    System.out.println("Generate the bill");

                    break;

                case 7:
                    System.out.println("view the bills");

                    break;
                case 8:
                    System.out.println("Top 2 bill paying consumer");

                    break;
                case 9:
                    System.exit(0);
            }
        }
    }
}
