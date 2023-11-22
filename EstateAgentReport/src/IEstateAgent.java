//Farrell, J. 2019. Java Programming, 9th Edition. Boston, MA: Cengage Learning

public interface IEstateAgent {
    double CalculateCommission(String propertyPrice, String agentCommission);
    boolean ValidateData(Data dataToValidate);

    public boolean validateData(Data invalidData);
}

