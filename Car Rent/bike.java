package vehicleRentalSystem;

class bike extends  vehicle{
    private  double rate;
    private  double  charge;
    public bike(String model,String make,int year,double rate,double charge){
        super(model, make, year);
        this.rate = rate;
        this.charge = charge;
    }

    @Override
    public double calculateRent(int days){
        return rate*days+charge;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}