package estateagentsales;

import org.junit.Test;
import static org.junit.Assert.*;

public class EstateAgentSalesTest {

    @Test
    public void calculateTotalSales_ReturnsTotalSales() {
        // Arrange
        double[] propertySales = {800000, 1500000, 2000000};
        IEstateAgent estateAgent = new EstateAgent();
        // Act
        double totalSales = estateAgent.estateAgentSales(propertySales);
        // Assert
        assertEquals(4300000, totalSales, 0);
    }

    @Test
    public void calculateTotalCommission_ReturnsCommission() {
        // Arrange
        double totalSales = 4300000;
        IEstateAgent estateAgent = new EstateAgent();
        // Act
        double commission = estateAgent.estateAgentCommission(totalSales);
        // Assert
        assertEquals(86000, commission, 0);
    }

    @Test
    public void topAgent_ReturnsTopPosition() {
        // Arrange
        double[] totalSales = {4300000, 3500000};
        IEstateAgent estateAgent = new EstateAgent();
        // Act
        int topSellerIndex = estateAgent.topEstateAgent(totalSales);
        // Assert
        assertEquals(0, topSellerIndex);
    }
}

