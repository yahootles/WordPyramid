/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordpyramid;

/**
 *
 * @author tiein
 */
import javax.swing.JOptionPane;

public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inWord = JOptionPane.showInputDialog("Please enter a word.");//get input from user
        pyramidify(inWord);//make the input word a pyramid
    }

    
    /**
     * Recursively outputs a pyramid of an input word
     * @param word - the word to be output as a pyramid
     */
    public static void pyramidify(String word) {
        String newWord;
        if (word.length() > 2) {//only add a new layer to the pyramid when the length is greater than 2, as if the word length is 1 or 2, it is the final layer
            System.out.println(word);//output the word
            newWord = word.substring(1, word.length() - 1);//create a new word that is the substring of the word that does not include the first or last letter
            pyramidify(newWord);//recursively make a pyramid out of the new word
        } else {
            System.out.println(word);//if it is the final layer, output the word
        }

    }

}
