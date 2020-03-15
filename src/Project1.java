// The first programming project involves writing a program that computes the minimum, the maximum and the average weight of a collection of weights represented
// in pounds and ounces that are read from an input file. This program consists of two classes. The first class is the Weight class, which is specified in integer
// pounds and ounces stored as a double precision floating point number. It should have five public methods and two private methods.

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Project1 {
    private static float findMinium(float[] w) {
        return 1.0f;
    }

    private static float average(ArrayList<Float> w) {
        float sum = 0;
        for(Float e : w) {
            sum += e;
        }
        return sum / w.size();
    }

    public static void main(String[] args) {
        // Create instances and define options
        JFileChooser jfc = new JFileChooser();
        JButton open = new JButton();

        jfc.setCurrentDirectory(new File("."));
        jfc.setDialogTitle("Pick a file");

        // Open dialog box and perform operations
        if (jfc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION) {
            Path p = Paths.get(jfc.getSelectedFile().toString());
            List<String> lines = new ArrayList<>();

            try {
                // Read files and add to ArrayList
                lines = Files.readAllLines(p);

                // Throw error if number of weights exceed 25
                if (lines.size() > 25) {
                    String er = jfc.getSelectedFile().toString() + " has " + lines.size() + ". Needs to be less than or equal to 25.";
                    throw new TooManyWeights(er);
                }

                // Convert strings of weights to floats, then save memory
                ArrayList<Float> weights = new ArrayList<Float>();
                for (String w : lines) {
                    weights.add(Float.valueOf(w));
                }
                lines = null;

                // Display Sorted weights
                Collections.sort(weights);
                System.out.println("Sorted weights = " + weights);

                // Find Average
                Float Average = average(weights);
                System.out.println("Average = " + Average);

            } catch (IOException | TooManyWeights e) {
                e.printStackTrace();
            }
        }


        // Test methods in weight class
        System.out.println("\nTest Methods in Weight class.");

        Weight x = new Weight(12.0f, true);
        System.out.println(x.toString());
        x.addTo(12.0f);
        System.out.println(x.toString());
        System.out.println("x.lessThan(25.0f) = " + x.lessThan(25.0f));
        System.out.println("x.lessThan(23.0f) = " + x.lessThan(23.0f));
        System.out.println("x.divide(2) = " + x.divide(2));
    }
}
