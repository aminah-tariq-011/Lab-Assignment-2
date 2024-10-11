package SMS_assignment;

import java.util.Random;
import java.util.Scanner;

public class Sort2d {
    Sms msg[][];

    //Person p1 = new Person("aminah", "03701690844", "aminahtariq@gmail.com")

    static int counter = 11;
    static int counter2 = 41;
  //  static int size = counter+1;

    public Sort2d() {
        msg = new Sms[20][100];


            for (int j = 0; j < 40; j++) {
            msg[0][j] = new Sms(new Person("ayesha", "03008660844", "ayesha200@gmail.com"), "what are you doing?");
        }
        for (int j = 0; j < 40; j++) {
            msg[1][j] = new Sms(new Person("reema", "03208660844", "reematariq@gmail.com"), "what are your plans for tonight?");
        }
        for (int j = 0; j < 40; j++) {
            msg[2][j] = new Sms(new Person("rohma", "03327895644", "rooh3327@gmail.com"), "im not feeling well today so it might be difficult to come to university");
        }
        for (int j = 0; j < 40; j++) {
            msg[3][j] = new Sms(new Person("maria", "03701680844", "maria2008@gmail.com"), "bro what is happening in the world rn?");
        }
        for (int j = 0; j < 40; j++) {
            msg[4][j] = new Sms(new Person("areeba", "03008660844", "ayesha200@gmail.com"), "what are you doing?");
        }
        for (int j = 0; j < 40; j++) {
            msg[5][j] = new Sms(new Person("hafsa", "04123567895", "hafsatariq@gmail.com"), "I'll let you know when im free");
        }
        for (int j = 0; j < 40; j++) {
            msg[6][j] = new Sms(new Person("zunaira", "03499660855", "zainee45@gmail.com"), "fine i dont need it anymore you can keep it");
        }
        for (int j = 0; j < 40; j++) {
            msg[7][j] = new Sms(new Person("hoorain", "03068778044", "hoorrooh@gmail.com"), "isn't it scary?");
        }
        for (int j = 0; j < 40; j++) {
            msg[8][j] = new Sms(new Person("adina", "03338660844", "adinaaaa@gmail.com"), "i'll be back today");
        }
        for (int j = 0; j < 40; j++) {
            msg[9][j] = new Sms(new Person("fatima", "03009990844", "fatimanoor@gmail.com"), "hey! sorry to let you know last minute im hopping on the flight for USA");
        }
        for (int j = 0; j < 40; j++) {
            msg[10][j] = new Sms(new Person("diya", "03008634544", "d_for_diya_44@gmail.com"), "hey girl when are you coming back?");
        }

        for (int j = 0; j < 20; j++) {
            int index1 = (int) (Math.random() * 9) + 1;
            int index2 = (int) (Math.random() * 39) + 1;

           msg[index1][index2].setStatus(true);
          // msg[index2][index1].getTimeStamp();


        }


    }

    public void sendingmsg() {
       for (int i = 1; i<2; i++) {
            String name2 = InputVerification();

            for (int z = 0; z < 20; z++) {
                if (msg[z][0] == null) {
                    break;
                }

                if (msg[z][0].getReceiver().getName().equalsIgnoreCase(name2)) {
                   int j;
                       // if (z>=11){j=0;} else
                    { for
                        ( j = 0; j < 101; j++) {
                        if (msg[z][j] == null) {
                        //counter++
                        System.out.println("enter the msg:");
                        Scanner ss5 = new Scanner(System.in);
                        String msg2 = ss5.nextLine();
                        Person p1 = new Person(name2, msg[z][0].getReceiver().getContact(), msg[z][0].getReceiver().getEmail());

                        if (p1.isValidContactNumber(p1.getContact())) {
                            msg[z][j] = new Sms(p1, msg2); //msg sent
                            System.out.println("message sent successfully to " + name2);
                           // msg[z][j].SmsDisplay();
                            System.out.println("dear " + name2 + " want to receive this msg:");
                            System.out.println("1) YES");
                            System.out.println("2) NO");
                            System.out.println("0) exit");
                            System.out.println("enter the option:");
                            Scanner ss6 = new Scanner(System.in);
                            int option = ss6.nextInt();
                            switch (option) {
                                case 1:
                                    msg[z][j].setStatus(true);
                                    System.out.println("message received successfully\n");
                                    counter2++;
                                    break;
                                case 2:
                                    System.out.println("message is not received");
                                    break;
                                case 0:
                                    break;
                            }
                            break;



            }
            break;}}
        }
     }}}

    }


    public void ListOfReceiver() {
        System.out.println("Following is the list of the existing receivers: ");
        for (int i = 0; i < 20; i++) {

            if (msg[i][0] == null) {
                break;
            } else {

                System.out.println(i + 1 + ") " + msg[i][0].getReceiver().getName());
            }
        }
    }


    public void DisplayAllMsg() {
        for (int i = 0; i < 20; i++) {
            if (msg[i][0] == null) {
                continue;
            }
            System.out.println("*********  MSG TO " + msg[i][0].getReceiver().getName().toUpperCase() + " *********");
            for (int j = 0; j < 101; j++) {
                if (msg[i][j] == null) {
                    break;
                } else {

                    msg[i][j].SmsDisplay();
                }
            }

        }

    }


    public void DisplayParticularMsg() {
        /*ListOfReceiver();
        System.out.println("enter the name of receiver:");
        Scanner ss45 = new Scanner(System.in);*/
        String name22 = InputVerification(); //ss45.nextLine();
        for (int i = 0; i < 20; i++) {
            if (msg[i][0] == null) {
                continue;
            }
            if (msg[i][0].getReceiver().getName().equalsIgnoreCase(name22)) {
                System.out.println("*********  MSG TO " + msg[i][0].getReceiver().getName().toUpperCase() + " *********");
                for (int j = 0; j < 101; j++) {
                    if (msg[i][j] == null) {
                        break;
                    }
                    msg[i][j].SmsDisplay();
                }
            }


        }
    }

    public void DeleteParticularMsg() {
        String name22 = InputVerification();
        for (int i = 0; i < 20; i++) {
            if (msg[i][0] == null) {
                continue;
            }
            if (msg[i][0].getReceiver().getName().equalsIgnoreCase(name22)) {
                System.out.println("*********  MSG TO " + msg[i][0].getReceiver().getName().toUpperCase() + " *********");
                for (int j = 0; j < 101; j++) {
                    if (msg[i][j] == null) {
                        break;
                    }
                    msg[i][j].SmsDisplay();
                }
            }


        }
        System.out.println("enter the ID of message you want to delete:");
        Scanner ss6 = new Scanner(System.in);
        String id2 = ss6.nextLine();
        for (int i = 0; i < 20; i++) {
            if (msg[i][0] == null) {
                continue;
            }
            if (msg[i][0].getReceiver().getName().equalsIgnoreCase(name22)) {
                for (int j = 0; j < 101; j++) {
                    if (msg[i][j] == null) {
                        break;
                    }
                    if (msg[i][j].getId().equals(id2)) {
                        msg[i][j] = null;
                    }

                }
            }
        }

        System.out.println("Message has been deleted");
    }

    public String InputVerification() {

        while (true) {
            ListOfReceiver();
            System.out.println("enter the name of receiver:");
            Scanner ss45 = new Scanner(System.in);
            String name32 = ss45.nextLine();
            for (int o = 0; o < 20; o++) {
                if (msg[o][0] == null) {
                    continue;
                }
                for (int m = 0; m < 101; m++) {
                    if (msg[o][m] == null) {
                        break;
                    }
                    if (msg[o][m].getReceiver().getName().equalsIgnoreCase(name32)) {
                        return msg[o][m].getReceiver().getName();
                    }

                }


            }
        }
    }


    public void DeleteAllMsg() {
        for (int o = 0; o < 20; o++) {
            for (int m = 0; m < 101; m++) {
                msg[o][m] = null;
            }
        }
        System.out.println("All Messages are deleted");
    }


    public void sortbystatusFalse() {
        for (int o = 0; o < 20; o++) {
            if (msg[o][0] == null) {
                continue;
            }
            for (int m = 0; m < 101; m++) {
                if (msg[o][m] == null) {
                    break;
                }
                if (msg[o][m].getStatus())
                    continue;
                {
                    msg[o][m].SmsDisplay();
                }
            }

        }

    }

    public void sortbystatusTrue() {
        for (int o = 0; o < 20; o++) {
            if (msg[o][0] == null) {
                continue;
            }
            for (int m = 0; m < 101; m++) {
                if (msg[o][m] == null) {
                    break;
                }
                if (msg[o][m].getStatus()) {
                    msg[o][m].SmsDisplay();
                }
            }

        }

    }

    public void SortByContactsTrue(String sorting) {
        //String sorting = InputVerification();
        for (int i = 0; i < 20; i++) {
            if (msg[i][0] == null) {
                continue;
            }
            if (msg[i][0].getReceiver().getName().equalsIgnoreCase(sorting)) {
                System.out.println("*********  MSG TO " + msg[i][0].getReceiver().getName().toUpperCase() + " *********");
                for (int j = 0; j < 101; j++) {
                    if (msg[i][j] == null) {
                        break;
                    }
                    if (msg[i][j].getStatus()) {
                        msg[i][j].SmsDisplay();
                    }
                }
            }


        }

    }


    public void SortByContactsFalse(String sorting) {
       // String sorting = InputVerification();
        for (int i = 0; i < 20; i++) {
            if (msg[i][0] == null) {
                continue;
            }
            if (msg[i][0].getReceiver().getName().equalsIgnoreCase(sorting)) {
                System.out.println("*********  MSG TO " + msg[i][0].getReceiver().getName().toUpperCase() + " *********");
                for (int j = 0; j < 101; j++) {
                    if (msg[i][j] == null) {
                        break;
                    }
                    if (msg[i][j].getStatus())
                        continue;
                    {
                        msg[i][j].SmsDisplay();
                    }
                }
            }


        }
    }

    public void SortByContacts(String sorting) {
        // String sorting = InputVerification();
        for (int i = 0; i < 20; i++) {
            if (msg[i][0] == null) {
                continue;
            }
            if (msg[i][0].getReceiver().getName().equalsIgnoreCase(sorting)) {
                System.out.println("*********  MSG FROM " + msg[i][0].getReceiver().getName().toUpperCase() + " *********");
                for (int j = 0; j < 101; j++) {
                    if (msg[i][j] == null) {
                        break;
                    }
                        msg[i][j].SmsDisplay();
                    }

            }


        }
    }

    public void AddContacts() {
        System.out.println("enter the name of contact:");
        Scanner news = new Scanner(System.in);
        String newname = news.nextLine();
        System.out.println("enter the email of contact");
        String newemail = news.nextLine();
        System.out.println("enter the number of receiver:");
        String newnum = news.nextLine();
        Person pp;
        while (true) {
            pp = new Person(newname, newnum, newemail);

            if (pp.isValidContactNumber(newnum)) {
                break;
            } else {
                System.out.println("Invalid contact number. Please enter a valid contact number:");
                newnum = news.nextLine();
            }
        }

        msg[counter][0] = new Sms(pp, "initialized");
        counter++;

        System.out.println("Contact is added successfully");

    }
}