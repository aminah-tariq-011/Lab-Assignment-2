package SMS_assignment;

import java.util.Scanner;

public class RunningApp {
    public static void main(String[] args) {
        Sort2d s1 = new Sort2d();

        while (true) {
            int option= Menu();
            switch (option) {
                case 1:
                   s1.sendingmsg();
                    break;
                case 2:
                    System.out.println("1 to delete all messages");
                    System.out.println("2 to delete specific messages");
                    System.out.println("0 to exit");
                    System.out.println("choose option:");
                    Scanner sc56 = new Scanner(System.in);
                    int choice1 = sc56.nextInt();
                    switch (choice1) {
                        case 1:

                            break;
                        case 2:
                            s1.DeleteParticularMsg();
                            break;
                        default:
                            System.out.println("invalid option");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1 to display all messages");
                    System.out.println("2 to display specific contact's messages");
                    System.out.println("0 to exit");
                    System.out.println("choose option:");
                    Scanner sc = new Scanner(System.in);
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            s1.DisplayAllMsg();
                            break;
                            case 2:
                                s1.DisplayParticularMsg();
                                break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                    }

                    break;
                case 4:
                    System.out.println("1 to sort by contacts");
                    System.out.println("2 to sort by status");
                    System.out.println("0 to exit");
                    System.out.println("choose option:");
                    Scanner sc44 = new Scanner(System.in);
                    int choice2 = sc44.nextInt();
                    switch (choice2) {
                        case 1:
                           String names = s1.InputVerification();
                            System.out.println("1 for delivered messages");
                            System.out.println("2 for received messages");
                            System.out.println("3 for all messages of the contact");
                            System.out.println("0 to exit");
                            System.out.println("choose option:");
                            Scanner sc45 = new Scanner(System.in);
                            int choice3 = sc45.nextInt();
                            switch (choice3) {
                                case 1:
                                    s1.SortByContactsFalse(names);
                                    break;
                                    case 2:
                                        s1.SortByContactsTrue(names);
                                        break;
                                        case 3:
                                            s1.SortByContacts(names);
                                            break;
                                            case 0:
                                                break;
                                                default:
                                                    System.out.println("Invalid choice");
                                                    break;
                            }



                            break;
                            case 2:
                                System.out.println("1 for delivered messages");
                                System.out.println("2 for received messages");
                                System.out.println("0 to exit");
                                System.out.println("choose option:");
                                Scanner sc456 = new Scanner(System.in);
                                int choice7 = sc456.nextInt();
                                switch (choice7) {
                                    case 1:
                                        s1.sortbystatusFalse();
                                        break;
                                        case 2:
                                           s1.sortbystatusTrue();
                                            break;
                                            case 0:
                                                break;
                                            default:
                                                System.out.println("Invalid choice");
                                                break;}
                                break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                    }
                    break;
                case 5:
                    s1.AddContacts();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static int Menu() {
        System.out.println("\n**** Welcome to SMS application ****");
        System.out.println("\n1 To send message");
        System.out.println("2 To delete message");
        System.out.println("3 To display message");
        System.out.println("4 To sort messages");
        System.out.println("5 To Add contacts");
        System.out.println("0 for exiting program");
        System.out.println("enter your desired option:");

        Scanner sc1 = new Scanner(System.in);
        int option1 = sc1.nextInt();
        return option1;
    }
}

