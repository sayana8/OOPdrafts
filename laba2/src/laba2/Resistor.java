package laba2;

public class Resistor extends Circuit {
    private double resistance;    

    public Resistor(double resistance) {
        super();
        this.resistance = resistance;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void applyPotentialDiff(double V) {
		// TODO Auto-generated method stub
		
	}
}
