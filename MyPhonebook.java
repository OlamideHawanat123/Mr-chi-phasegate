package PhaseGateApps;

import java.util.ArrayList;
import java.util.Objects;

public class MyPhonebook {
    ArrayList<String[]> contacts = new ArrayList<>();
    private int count;


    public boolean contactIsEmpty() {

        return contacts.isEmpty();
    }

    public void addContact(String number, String firstName, String lastName) {
        contacts.add(new String[]{number, firstName, lastName});

    }


    public void removeContact(String number) {
        if (contactIsEmpty()) {
            throw new AssertionError("Contact list is empty");
        }
        for(int counter = 0; counter < contacts.size(); counter++) {
            for(int counter2 = 0; counter2 < contacts.get(counter).length; counter2++) {
                if (contacts.get(counter)[counter2].equals(number)) {
                    contacts.remove(counter);
                    break;

                }

            }
        }

    }

    public String[] findContactByPhoneNumber(String number) {
        String[] contactByPhoneNumber = new String[3];
        if (contactIsEmpty()) {
            throw new AssertionError("Contact list is empty");
        }
        for (int counter = 0; counter < contacts.size(); counter++) {
            for (int counter2 = 0; counter2 < contacts.get(counter).length; counter2++) {
                if (contacts.get(counter)[counter2].equals(number)) {
                    contactByPhoneNumber[counter2++] = contacts.get(counter)[counter2];
                }
            }

        }
        return contactByPhoneNumber;
    }

    public  String[] findContctsByFirtName(String john) {
        String contactDetails[] = new  String[3];
        for(int count = 0; count < contacts.size(); count++) {
            for(int counter = 0; counter < contacts.get(count).length; counter++) {
                if (contacts.get(count)[counter].equals(john)){
                    contactDetails[count] = contacts.get(count)[counter];
                }
            }

        }
        return contactDetails;
    }
}
