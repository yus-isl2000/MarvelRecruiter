/**
 * Yusef Islaih
 * 991515277
 * Multi-Tier Programming 1
 * Prof. Sun
 * January 30 2020
 * Assignment 1
 * 
 * This class hold the function needed to print applicants to a given file
 */
package model;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yusefislaih
 */
public class ApplicantFileIO {

    public static void writeToFile(Applicant applicant, String passOrFail, String fileName) {
        File file = new File(fileName);
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
            //printing all atributes of applicant alon with if the passed or not into the file given
            writer.println(applicant.toString() + passOrFail + "}");
        } catch (IOException ex) {
            Logger.getLogger(ApplicantFileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
