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
public class StringService {
    
    public void saveText(String msg, int i) throws IllegalArgumentException{
        if(!msg.equals(msg.toUpperCase())){
        
        throw new UppercaseMandatoryException("Wicked");
        
        }else if(msg.length() < 5){
        
            throw new IllegalArgumentException("Yargh, its too small");
        }
    }
    
}
