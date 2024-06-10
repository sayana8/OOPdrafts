package laba2;

public class Series extends Circuit {
    private Circuit component1;
    private Circuit component2;

    public Series(Circuit c1, Circuit c2) {
        this.component1 = c1;
        this.component2 = c2;
    }

    @Override
    public double getResistance() {
        return component1.getResistance() + component2.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return component1.getPotentialDiff() + component2.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        component1.applyPotentialDiff(V);
        component2.applyPotentialDiff(V);
    }
}