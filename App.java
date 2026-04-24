public class App {
    public static void main(String[] args) {

        // Création du gestionnaire
        ContactsManager myContactsManager = new ContactsManager();

        // Contact 1
        Contact Contact1 = new Contact();
        Contact1.name = "Alice";
        Contact1.phoneNumber = "0700000001";
        myContactsManager.addContact(Contact1);

        // Contact 2
        Contact Contact2 = new Contact();
        Contact2.name = "Bob";
        Contact2.phoneNumber = "0700000002";
        myContactsManager.addContact(Contact2);

        // Contact 3
        Contact Contact3 = new Contact();
        Contact3.name = "Charlie";
        Contact3.phoneNumber = "0700000003";
        myContactsManager.addContact(Contact3);

        // Contact 4
        Contact Contact4 = new Contact();
        Contact4.name = "David";
        Contact4.phoneNumber = "0700000004";
        myContactsManager.addContact(Contact4);

        // Contact 5
        Contact Contact5 = new Contact();
        Contact5.name = "Emma";
        Contact5.phoneNumber = "0700000005";
        myContactsManager.addContact(Contact5);

        // Recherche d’un contact
        Contact result = myContactsManager.searchContact("David");

        if (result != null) {
            System.out.println("Numéro de David : " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}
