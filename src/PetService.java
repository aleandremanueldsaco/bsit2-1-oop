public class PetService {
    private static final double base_fee = 50.0;
    private static final double vaccination_fee = 25.0;
    private static final double grooming_fee = 30.0;


    public double calculateFee() {
        return base_fee;
    }

    public  double calculate(boolean withVaccination) {
        if (withVaccination == true) {
            return base_fee + vaccination_fee;
        }
        return 0;
    }
    public double calculate(boolean withVaccination, boolean withGrooming){
        if(withVaccination == true && withGrooming == true){
            return base_fee + vaccination_fee + grooming_fee;
        }
        return 0;
    }
    public double calculateFee(String emergencyType){
        return 200;
    }


}
