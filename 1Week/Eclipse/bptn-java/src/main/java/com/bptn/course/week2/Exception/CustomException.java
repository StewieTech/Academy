package com.bptn.course.week2.Exception;

public class CustomException {

    public static class ConflictGuestsException extends Exception {
        public ConflictGuestsException(String message) {
            super(message);
        }
    }

    public static class DietaryRestrictionException extends Exception {
        public DietaryRestrictionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static class OutOfBoundsException extends RuntimeException {
        public OutOfBoundsException(String message, Throwable cause) {
            super(message, cause);
        }
    }
    

    
    public static void addGuestToTable(String[] guests, String newGuest, String conflictingGuest, boolean isVegan)
            throws ConflictGuestsException, DietaryRestrictionException, OutOfBoundsException {
    	int currentSize = 0;
        try {
            for (String guest : guests) {
                if (guest != null) {
                    currentSize++;
                    if (guest.equals(conflictingGuest)) {
                        throw new ConflictGuestsException("Cannot sit our guest " + newGuest + " with " + conflictingGuest + " as they hate each other!");
                    }
                    if (isVegan && guest.equals("MeatLover")) { 
                        throw new DietaryRestrictionException("Cannot seat vegan guest " + newGuest + " with meat lover " + guest,  new DietaryRestrictionException("Dietary restriction conflict.", null));
                    }
                }
            }
            if (currentSize >= 8) {
                throw new ArrayIndexOutOfBoundsException("Table cannot have more than 8 guests.");
            }
            
            // the main functionality 
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] == null) {
                    guests[i] = newGuest;
                    return;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
 
            throw new OutOfBoundsException("Exceeded table capacity.", e);
        }
    }
   
    public static void displayGuests(String[] guests) {
        System.out.println("Guest List:");
        int numberOfGuests = 0;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);
                numberOfGuests++;
            }
        }
        System.out.println("Total number of guests: " + numberOfGuests);
    }
    
    

    // Usage Example
    public static void main(String[] args) {
        String[] guests = new String[8];
        try {
        	
            addGuestToTable(guests, "Alice", "Bob", false);
//            addGuestToTable(guests, "Bob", "Alice", false); // This will throw ConflictGuestsException
            addGuestToTable(guests, "Charlie", "", false); 
            addGuestToTable(guests, "Ashley", "", false); 
            addGuestToTable(guests, "John", "", false); 
            addGuestToTable(guests, "Marcus", "", false); // This will throw ArrayIndexOutOfBoundsException
            addGuestToTable(guests, "Suzanne", "", false); // This will throw ArrayIndexOutOfBoundsException
            addGuestToTable(guests, "Vincent", "", false); // This will throw ArrayIndexOutOfBoundsException
            addGuestToTable(guests, "MeatLover", "", false); // This will throw DietaryRestrictionException if there's a "MeatLover"
//            addGuestToTable(guests, "VeganGuest", "", true); // This will throw DietaryRestrictionException if there's a "MeatLover"
            addGuestToTable(guests, "ExtraGuest", "", false); // This will throw ArrayIndexOutOfBoundsException
            addGuestToTable(guests, "ExtraGuest", "", false); // This will throw ArrayIndexOutOfBoundsException
            addGuestToTable(guests, "ExtraGuest", "", false); // This will throw ArrayIndexOutOfBoundsException
            addGuestToTable(guests, "ExtraGuest", "", false); // This will throw ArrayIndexOutOfBoundsException
            addGuestToTable(guests, "ExtraGuest", "", false); // This will throw ArrayIndexOutOfBoundsException
            addGuestToTable(guests, "ExtraGuest", "", false); // This will throw ArrayIndexOutOfBoundsException
            addGuestToTable(guests, "Marco", "", false); // This will throw ArrayIndexOutOfBoundsException
            displayGuests(guests) ;
        } catch (ConflictGuestsException | DietaryRestrictionException | OutOfBoundsException e) {
//        } catch (ConflictGuestsException | DietaryRestrictionException   e) {
        	displayGuests(guests) ;
            System.out.println(e.getMessage());
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Cause: " + cause);
            }
//            e.printStackTrace();
        } 
//        catch (RuntimeException e) {
//        	displayGuests(guests) ;
//        	Throwable cause = e.getCause();
//        	System.out.println("A runtime exception occurred: " + e.getMessage());
//        	if (cause != null) {
//        		System.out.println("Cause: " + cause);
//        	}
//    }

}
}
