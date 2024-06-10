package laba2;

public class Parallel extends Circuit {
    private Circuit component1;
    private Circuit component2;

    public Parallel(Circuit component1, Circuit component2) {
        this.component1 = component1;
        this.component2 = component2;
    }

    @Override
    public double getResistance() {
        double resistance1 = component1.getResistance();
        double resistance2 = component2.getResistance();

        if (resistance1 == 0 || resistance2 == 0) {
            return 0;
        }

        return (resistance1 * resistance2) / (resistance1 + resistance2);
    }

    @Override
    public double getPotentialDiff() {
        return component1.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        component1.applyPotentialDiff(V);
        component2.applyPotentialDiff(V);
    }
}
