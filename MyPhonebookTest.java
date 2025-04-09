package tests;

import PhaseGateApps.MyPhonebook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyPhonebookTest {
    MyPhonebook input = new MyPhonebook();

    @Test
    @DisplayName("Test that contact is empty")
    void testThatContactIsEmpty(){
        assertTrue(
                input.contactIsEmpty());
    }


    @Test
    @DisplayName("Test that add contact is not empty after creating contact")
    public void testThatContactIsNotEmptyAfterYouCreateAContact(){
        input.addContact("09138146912", "John", "Doe");
        assertFalse(input.contactIsEmpty());
    }

    @Test
    @DisplayName("Test that remove contact deletes contact")
    public void testThatRemoveContactDeletesASpecifiedContact(){
        input.addContact("09138146912", "John", "Doe");
        input.addContact("09138146812", "John", "Doe");
        input.removeContact("09138146812");
        input.removeContact("09138146912");
        assertTrue(input.contactIsEmpty());
    }

    @Test
    @DisplayName("Test that you can add contact, delete and add another contact")
    public void testThatYouCanAddAnotherContactAfterDelete(){
        input.addContact("09138146912", "John", "Doe");
        input.removeContact("09138146912");
        input.addContact("09138146812", "John", "Ola");
        assertFalse(input.contactIsEmpty());
    }

    @Test
    @DisplayName("Test that phone book can help you find a contact by phone number")
    public void testThatPhoneBookCanHelpYouFindAContactByPhoneNumber(){
        input.addContact("09138146912", "John", "Doe");
        assertArrayEquals(new String[]{"09138146912", "John", "Doe"}, input.findContactByPhoneNumber("09138146912"));

    }

    @Test
    @DisplayName("Test that phone book can help find a contact by first name"){
        input.addContact("09138146912", "John", "Doe");
        assertArrayEquals(new String[]{"09138146912", "John", "Doe"}, input.findContctsByFirtName("John"));

    }



    }

