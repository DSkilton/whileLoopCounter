/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package output;

/**
 *
 * @author M1610718
 */
public class Output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        while (count <= 5)
            {System.out.println ("count is " + count);
            count++;
        }
                
        System.out.println ("Finished looping, count is " + count);
    }
    
}
