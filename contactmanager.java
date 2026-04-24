public class contactmanager {

    contact[] myFriends;
    int friendsCount;

    public contactmanager() {
        myFriends = new contact[500];
        friendsCount = 0;
    }

    public void addContact(contact contact) {
        if (friendsCount < myFriends.length) {
            myFriends[friendsCount] = contact;
            friendsCount++;
        } else {
            System.out.println("Liste de contacts pleine !");
        }
    }

    public contact searchContact(String name) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name != null && myFriends[i].name.equals(name)) {
                return myFriends[i];
            }
        }
        return null;
    }
}