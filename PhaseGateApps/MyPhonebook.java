package PhaseGateApps;

import java.util.ArrayList;

public class MyPhonebook {
    ArrayList<String[]> contacts = new ArrayList<>();
    private int count;


    public boolean contactIsEmpty(){

        return this.count == 0;
    }
    public void addContact(String number, String firstName, String lastName) {
        contacts.add(new String[]{number, firstName, lastName});
        count++;


    }


    public void removeContact(String number) {
        if(contactIsEmpty()){
            throw new AssertionError("Contact list is empty");
        }
        for (int counter = 0; counter < contacts.size(); counter++) {
            for (int i = 0; i < contacts.get(counter).length; i++){
                if (contacts.get(counter)[i].equals(number)){
                    contacts.remove(counter);
                }

            }
        }
    }
}
