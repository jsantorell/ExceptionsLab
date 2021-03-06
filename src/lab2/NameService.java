package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException{
        String lastName;
        
        // Your code goes here.
        
        if(fullName == null || fullName.length() == 0){
        
        throw new IllegalArgumentException("fullname is mandatory");
        }
        String[] parts = fullName.split(" ");
        if (parts.length < 2) {
        throw new IllegalArgumentException("Put a space between first and last name");
        }
        
        lastName = parts[parts.length - 1];
        
        return lastName;
    }
    

    
    
}
