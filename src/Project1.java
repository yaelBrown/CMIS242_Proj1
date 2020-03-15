// The first programming project involves writing a program that computes the minimum, the maximum and the average weight of a collection of weights represented
// in pounds and ounces that are read from an input file. This program consists of two classes. The first class is the Weight class, which is specified in integer
// pounds and ounces stored as a double precision floating point number. It should have five public methods and two private methods.

import javax.swing.*;
import java.text.DecimalFormat;


public class Project1 {
    private static float findMinium(float[] w) {
        return 1.0f;
    }

    public static void main(String[] args) {
        JFileChooser jfc = new JFileChooser();

        Weight x = new Weight(12.0f, true);
        System.out.println(x.toString());

        // read in file and add them to an array

        // if file contains more than 25 weights, display error message and terminate

        // sort the array smallest to largest

        // find average

    }

}
