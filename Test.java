import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MessagingApp m1 = new MessagingApp(20);
        int choice;

        do {
            System.out.println("Enter 1 to send message");
            System.out.println("Enter 2 to view message");
            System.out.println("Enter 3 to add contacts");
            System.out.println("Enter 4 to display contacts");
            System.out.println("Enter 5 to display messages");
            System.out.println("Enter 0 to exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter sender: ");
                    String sender = sc.nextLine();
                    System.out.print("Enter receiver: ");
                    String receiver = sc.nextLine();
                    System.out.print("Enter content of message: ");
                    String content = sc.nextLine();
                    m1.sendMessage(sender, receiver, content);
                    break;

                case 2:
                    System.out.print("Enter contact name (sender): ");
                    String contactName = sc.nextLine();
                    m1.viewMessages(contactName);
                    break;

                case 3:
                    System.out.print("Enter the number of contacts to add: ");
                    int contactNum = sc.nextInt();
                    Contact[] contacts = new Contact[contactNum];
                    sc.nextLine();
                    for (int i = 0; i < contactNum; i++) {
                        System.out.print("Enter contact Name: ");
                        String naam = sc.nextLine();
                        System.out.print("Enter phone number: ");
                        String num = sc.nextLine();
                        contacts[i] = new Contact(naam, num);
                    }
                    m1.addContacts(contacts);
                    System.out.println("Contacts added successfully");
                    break;

                case 4:
                    m1.displayContacts();
                    break;
                case 5:
                    m1.displayMessages();
                    break;

                case 0:
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
