public class app {
    public static void main(String[] args) {

        // Création du gestionnaire
        contactmanager mycontactmanager = new contactmanager();

        // Contact 1
        contact contact1 = new contact();
        contact1.name = "Alice";
        contact1.phoneNumber = "0700000001";
        mycontactmanager.addContact(contact1);

        // Contact 2
        contact contact2 = new contact();
        contact2.name = "Bob";
        contact2.phoneNumber = "0700000002";
        mycontactmanager.addContact(contact2);

        // Contact 3
        contact contact3 = new contact();
        contact3.name = "Charlie";
        contact3.phoneNumber = "0700000003";
        mycontactmanager.addContact(contact3);

        // Contact 4
        contact contact4 = new contact();
        contact4.name = "David";
        contact4.phoneNumber = "0700000004";
        mycontactmanager.addContact(contact4);

        // Contact 5
        contact contact5 = new contact();
        contact5.name = "Emma";
        contact5.phoneNumber = "0700000005";
        mycontactmanager.addContact(contact5);

        // Recherche d’un contact
        contact result = mycontactmanager.searchContact("David");

        if (result != null) {
            System.out.println("Numéro de David : " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}