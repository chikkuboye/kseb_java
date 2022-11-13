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

                    break;
                case 2:
                    System.out.println("You entered into searching section !!!");

                    break;
                case 3:
                    System.out.println("view the details");

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
