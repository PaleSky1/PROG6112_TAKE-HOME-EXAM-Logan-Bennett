import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EstateAgentTest {

    @Test
    public void calculateCommission_CalculatedSuccessfully() {
        // Arrange
        IEstateAgent estateAgent = new EstateAgent();
        
        // Act
        double commission = estateAgent.CalculateCommission("500000", "5");

        // Assert
        assertEquals(25000.0, commission, 0.01); // Assuming commission is 5% of 500000
    }

    @Test
    public void calculateCommission_CalculatedUnsuccessfully() {
        // Arrange
        IEstateAgent estateAgent = new EstateAgent();
        
        // Act
        double commission = estateAgent.CalculateCommission("InvalidPrice", "5");

        // Assert
        assertEquals(0.0, commission, 0.01); // Expecting 0.0 for an invalid property price
    }

    @Test
    public void validationTest_ValidData() {
        // Arrange
        IEstateAgent estateAgent = new EstateAgent();
        Data validData = new Data("Cape Town", "John Doe", "500000", "5");

        // Act
        boolean isValid = estateAgent.validateData(validData);

        // Assert
        assertTrue(isValid);
    }

    @Test
    public void validationTest_InvalidData() {
        // Arrange
        IEstateAgent estateAgent = new EstateAgent();
        Data invalidData = new Data("", "", "0", "0");

        // Act
        boolean isValid = estateAgent.validateData(invalidData);

        // Assert
        assertFalse(isValid);
    }
}
