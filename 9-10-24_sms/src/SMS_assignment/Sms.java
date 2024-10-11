package SMS_assignment;
import java.time.LocalDateTime;

public class Sms {
    private final String Id;
    private final Person Sender= new Person("aminah", "03701690844", "aminahtariq@gmail.com");
    private Person Receiver;
    private String Content;
    private boolean Status;
     LocalDateTime TimeStamp;
     LocalDateTime receivedTime;

    static int counter = 0;

    public Sms() {
        this.Id = String.format("%03d", ++counter);
    }



    public Sms( Person receiver, String content) {
        this.Id = String.format("%03d", ++counter);
        //this.Sender = sender;
        this.Receiver = receiver;
        this.Content = content;
        this.Status = false;
        this.TimeStamp = LocalDateTime.now();
    }

    private void setReceivedTime(LocalDateTime receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getId() {
        return Id;
    }

    public Person getSender() {
        return Sender;
    }
    public Person getReceiver() {
        return Receiver;
    }
    public String getContent() {
        return Content;
    }
    public boolean getStatus() {

        return Status;
    }
    public void setStatus(boolean status) {
        LocalDateTime rectime = null;
        if (status) {
            rectime = getTimeStamp();
        }
         setReceivedTime(rectime);

        this.Status = status;
    }
    public LocalDateTime getTimeStamp() {
        return TimeStamp;
    }


    public void setReceiver(Person receiver) {
        this.Receiver = receiver;
    }
    public void setContent(String content) {
        this.Content = content;
    }

    public void statusIs() {
        if(this.Status){
            System.out.println("seen");
        }else{
            System.out.println("not seen");}
    }



    public void SmsDisplay(){
        System.out.println("ID: " + this.Id);
        System.out.println("sending time: "+getTimeStamp());
        System.out.println(Sender);
        System.out.println(Receiver);
        System.out.println("Message: " + this.Content);
        if(getStatus()) {
            System.out.println("receiving time: "+receivedTime);
        }
        System.out.print("Status: ");
        statusIs();
        System.out.println("\n");

    }



}
