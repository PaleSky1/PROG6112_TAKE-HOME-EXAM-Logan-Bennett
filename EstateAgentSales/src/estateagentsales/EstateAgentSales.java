//Farrell, J. 2019. Java Programming, 9th Edition. Boston, MA: Cengage Learning

package estateagentsales;

public class EstateAgentSales {
    public static void main(String[] args) {
        //Define one/two-dimensional array to store Agents info
        String[] agentName={"Joe Bloggs","Jane Doe"};
        
        double[][] propertySales = {
                {800000, 1500000, 2000000}, // Joe Bloggs
                {700000, 1200000, 1600000}  // Jane Doe
        };

        //Calling the EstateAgent class
        IEstateAgent estateAgent = new EstateAgent();

        //Setting and getting total property sales and commission for each estate agent
        double[] totalSales = new double[propertySales.length];
        double[] commission = new double[propertySales.length];
        for (int i = 0; i < propertySales.length; i++) {
            totalSales[i] = estateAgent.estateAgentSales(propertySales[i]);
            commission[i] = estateAgent.estateAgentCommission(totalSales[i]);
        }

         //Finds the top-selling estate agent
        int topSeller = estateAgent.topEstateAgent(totalSales);

        // Print all the details
        System.out.println("\t\tJAN\t\tFEB\t\tMAR");
        System.out.println("-------------------------------------------------------");
        printSales(agentName[0], propertySales[0]);
        printSales(agentName[1], propertySales[1]);
        System.out.println();
        printTotalSales(agentName[0], totalSales[0]);
        printTotalSales(agentName[1], totalSales[1]);
        System.out.println();
        printCommission(agentName[0], commission[0]);
        printCommission(agentName[1], commission[1]);
        System.out.println("\nTop performing estate agent: " + agentName[topSeller]);
    }

    //Print the property sales for an estate agent
    private static void printSales(String agentName, double[] sales) {
        System.out.println(agentName + "\t" + sales[0] + "\t" + sales[1] + "\t" + sales[2]);
    }

    //Print the total sales for an estate agent
    private static void printTotalSales(String agentName, double totalSales) {
        System.out.println("Total property sales " + agentName + " = R " + totalSales);
    }

    //Print the commission for an estate agent
    private static void printCommission(String agentName, double commission) {
        System.out.println("Sales Commission for " + agentName + " = R " + commission);
    }
}
