public class Contact {
    String name;
    String phoneNum;
    public Contact(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    @Override
    public String toString() {
        return "Name=" + name + ", phoneNum=" + phoneNum;
    }
    
    

    
}
