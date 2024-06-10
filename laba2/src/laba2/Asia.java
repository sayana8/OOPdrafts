package laba2;

class Asia extends Country {
    private String formOfGovernment;
    public String getFormOfGovernment() {
		return formOfGovernment;
	}

	public void setFormOfGovernment(String formOfGovernment) {
		this.formOfGovernment = formOfGovernment;
	}
    public Asia(String countryName, String capitalCity, String officialLanguage, int population,String formOfGovernment ) {
        super(countryName, capitalCity , officialLanguage, population);
        this.formOfGovernment = formOfGovernment;
    }

    @Override
    public String toString() {
        return super.getData() + " and its form of government is " + formOfGovernment + " . "  ;
        
    }
}
