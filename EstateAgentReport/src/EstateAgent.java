//Farrell, J. 2019. Java Programming, 9th Edition. Boston, MA: Cengage Learning

public class EstateAgent implements IEstateAgent {

    public EstateAgent() {
    }

    @Override
    public double CalculateCommission(String propertyPrice, String agentCommission) {
        double price = Double.parseDouble(propertyPrice);
        double commissionPercentage = Double.parseDouble(agentCommission);
        return price * commissionPercentage / 100;
    }

    @Override
    public boolean ValidateData(Data dataToValidate) {
        // Validate Agent Location
        if (dataToValidate.getAgentLocation().isEmpty()) {
            return false;
        }

        // Validate Agent Name
        if (dataToValidate.getAgentName().isEmpty()) {
            return false;
        }

        // Validate Property Price
        double propertyPrice;
        try {
            propertyPrice = Double.parseDouble(dataToValidate.getPropertyPrice());
        } catch (NumberFormatException e) {
            return false;
        }
        if (propertyPrice <= 0) {
            return false;
        }

        // Validate Commission Percentage
        double commissionPercentage;
        try {
            commissionPercentage = Double.parseDouble(dataToValidate.getCommissionPercentage());
        } catch (NumberFormatException e) {
            return false;
        }
        return commissionPercentage > 0;
    }

    @Override
    public boolean validateData(Data invalidData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

