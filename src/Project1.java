//The first programming project involves writing a program that computes the minimum, the maximum and the average weight of a collection of weights represented
// in pounds and ounces that are read from an input file. This program consists of two classes. The first class is the Weight class, which is specified in integer
// pounds and ounces stored as a double precision floating point number. It should have five public methods and two private methods

public class Project1 {
    private float weightLbs;
    private float weightOz;

    public Project1(float weight, boolean isLbs) {
        if (isLbs) {
            this.weightLbs = weight;
        } else {
            this.weightOz = weight / 16;
        }
    }


    public static void main(String[] args) {
        


    }

}
