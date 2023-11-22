//Farrell, J. 2019. Java Programming, 9th Edition. Boston, MA: Cengage Learning

package estateagentsales;

public interface IEstateAgent {
    double estateAgentSales(double[] propertySales);
    double estateAgentCommission(double propertySales);
    int topEstateAgent(double[] totalSales);
}
