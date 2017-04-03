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
public class Startup1 {
    public static void main(String[] args) {
        String s = "HEL";
        
        StringService st = new StringService();
        try{
        st.saveText(s, 0);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
