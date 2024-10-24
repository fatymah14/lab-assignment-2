import java.time.LocalTime;
import java.time.LocalDate;

public class Message {
    final String sender;
    final String receiver;
    final String content;
    final String messageId;
    
    public enum Status { 
        SENT, RECEIVED, SEEN
    }
    
    Status currentStatus;
    LocalTime timestamp;

    public Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.messageId = "@vb" + LocalDate.now();
        this.timestamp = LocalTime.now().withSecond(0).withNano(0);
        this.currentStatus = Status.SENT;
    }

    public void setStatus(Status currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public String getMessageId() {
        return messageId;
    }

    public Status getStatus() {
        return currentStatus;
    }

    @Override
    public String toString() {
        return "Sender : " + sender + "\n" +
               "Received by:" + receiver + "\n" +
               content + "\n" +
               timestamp + "|" + getStatus() + "\n" +
               "MessageId = " + messageId;
    }
}
