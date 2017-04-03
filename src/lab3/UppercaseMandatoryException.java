/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author jerem
 */
public class UppercaseMandatoryException extends IllegalArgumentException {
    
    private static String MSG = "Needs to be upper";

    public UppercaseMandatoryException() {
        super(MSG);
    }

    public UppercaseMandatoryException(String string) {
        super(MSG);
    }

    public UppercaseMandatoryException(String string, Throwable thrwbl) {
        super(MSG, thrwbl);
    }

    public UppercaseMandatoryException(Throwable thrwbl) {
        super(thrwbl);
    }
    
    
}
