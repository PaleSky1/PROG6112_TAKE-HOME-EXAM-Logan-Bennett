//Farrell, J. 2019. Java Programming, 9th Edition. Boston, MA: Cengage Learning

package estateagentsales;

public class EstateAgent implements IEstateAgent {
    // Calculates the total sales
    @Override
    public double estateAgentSales(double[] propertySales) {
        double totalSales = 0;
        for (double monthlySales : propertySales) {
            totalSales += monthlySales;
        }
        return totalSales;
    }
    // Calculates the commision
    @Override
    public double estateAgentCommission(double propertySales) {
        return 0.02 * propertySales;
    }
    //Finds the top estate agent 
    @Override
    public int topEstateAgent(double[] totalSales) {
        int maxIndex = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
