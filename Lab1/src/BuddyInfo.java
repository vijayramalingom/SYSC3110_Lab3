public class BuddyInfo {
    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "Bob";
        this.address = "123 Madeup Street";
        this.phoneNumber = 1234567890;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        BuddyInfo buddy = new BuddyInfo("Homer", "123 Madeup Street", 1234567890);
        System.out.println("Hello " + buddy.getName());
    }
}
