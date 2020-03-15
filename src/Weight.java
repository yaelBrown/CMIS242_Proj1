import java.text.DecimalFormat;

public class Weight {

    private float weightLbs = 0.0f;
    private float weightOz = 0.0f;

    private static DecimalFormat df = new DecimalFormat("0.000");

    public Weight(float weight, boolean isLbs) {
        if (isLbs) {
            this.weightLbs = weight;
            this.weightOz = weight * 16;
        } else {
            this.weightLbs = weight / 16;
            this.weightOz = weight;
        }
    }

    public Boolean lessThan(float w) {
        return w > this.weightLbs;
    }

    public float addTo(float w) {
        this.weightLbs = this.weightLbs += w;
        this.weightOz = this.weightOz += (w * 16);
        return this.weightLbs;
    }

    public int divide(int divisor) {
        return (int) Math.round(weightLbs / divisor);
    }

    public String toString() {
        return (this.weightLbs + " lbs " + df.format(this.weightOz));
    }

    private float toOnces() {
        return this.weightOz;
    }

    private float normalize() {
        if (this.weightLbs > 1) {
            return 16.0f;
        } else {
            return this.weightLbs * 16;
        }
    }

}
