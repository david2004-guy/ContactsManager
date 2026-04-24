public class ContactsManager {

    Contact[] myFriends;
    int friendsCount;

    public ContactsManager() {
        myFriends = new Contact[500];
        friendsCount = 0;
    }

    public void addContact(Contact Contact) {
        if (friendsCount < myFriends.length) {
            myFriends[friendsCount] = contact;
            friendsCount++;
        } else {
            System.out.println("Liste de contacts pleine !");
        }
    }

    public Contact searchContact(String name) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name != null && myFriends[i].name.equals(name)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
