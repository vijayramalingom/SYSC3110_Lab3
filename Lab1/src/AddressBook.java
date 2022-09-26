import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;
    public AddressBook() {
        this.buddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy) {
        this.buddies.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy) {
        this.buddies.remove(buddy);
    }
    public void test() {
        System.out.println("This method was added in change1 branch");
    }
    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo bob = new BuddyInfo();
        AddressBook addresses = new AddressBook();
        addresses.addBuddy(bob);
        addresses.removeBuddy(bob);
    }
}
