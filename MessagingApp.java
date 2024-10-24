public class MessagingApp {
    Contact[] contacts;
    Message[] messages;
    static int contactCount = 0;
    static int messageCount = 0;

    MessagingApp(int maxContact) {
        contacts = new Contact[maxContact];
        messages = new Message[100];
        // contacts[0] = new Contact("Qasam", "827909498");
        // contacts[1] = new Contact("Arham", "827909498");
        // contacts[2] = new Contact("Maham", "827909498");
        // contacts[3] = new Contact("Zamzam", "827909498");
        // contacts[4] = new Contact("Tiham", "827909498");
    }

    public void addContacts(Contact[] newContacts) {
        for (Contact contact : newContacts) {
            if (contactCount < contacts.length) {
                contacts[contactCount++] = contact;
            } else {
                System.out.println("Can't add contacts");
            }    
        } 
    }

    public void sendMessage(String sender, String receiver, String content) {
        if (messageCount < messages.length) {
            messages[messageCount] = new Message(sender, receiver, content);
            System.out.println("Message sent successfully");
            messageCount++;
            return;
        }
        System.out.println("Can't send message");
    }

    public void viewMessages(String contactName) {
        for (int i = 0; i < messageCount; i++) {
            if (messages[i].getSender().equals(contactName)) {
                messages[i].setStatus(Message.Status.SEEN);
                System.out.println(messages[i].toString());
                return;
            }
        }
        System.out.println("Unable to view message");
    }
    public void displayMessages(){
        for(int i=0;i < messageCount;i++){
            System.out.println(messages[i]);
            System.out.println("==========");
        }
    }

    public void displayContacts() {
        for (int i = 0; i < contactCount; i++) {
            System.out.println(contacts[i]);
        }
    }
}
