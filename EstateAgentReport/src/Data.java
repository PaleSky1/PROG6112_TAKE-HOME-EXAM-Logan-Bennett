//Farrell, J. 2019. Java Programming, 9th Edition. Boston, MA: Cengage Learning

public class Data {

    public Data(String cape_Town, String john_Doe, String string, String string1) {
    }
    private String agentLocation;
    private String agentName;
    private String propertyPrice;
    private String commissionPercentage;

    // Constructors, getters, and setters

    public String getAgentLocation() {
        return agentLocation;
    }

    public void setAgentLocation(String agentLocation) {
        this.agentLocation = agentLocation;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(String propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public String getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(String commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }
}

