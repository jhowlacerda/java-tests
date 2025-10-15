package com.tdd.math;

import com.tdd.SimpleMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTestS3 {
    SimpleMath math;

    @BeforeAll
    static void setup() {
        System.out.println("Running @BeforeAll method!");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll method!");
    }

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }
    @AfterEach
    void afterEachMethod() {
        System.out.println("Running @fterEachMethod method!");
    }

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum() {
        System.out.println("testSum method!");

        //AAA - Arrange, Act, Assert
        //Given/Arrange - Define as veriaveis
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2D;

        //When/Act
        Double actual = math.sum(firstNumber, secondNumber);

        //Then/Assert
        assertEquals(expected, actual,() -> firstNumber+secondNumber+ " did not produce "+expected);
        assertNotEquals(9.9, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSubtraction() {
        System.out.println("testSubtraction method!");

        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;

        assertEquals(expected, actual,() -> firstNumber+secondNumber+ " did not produce "+expected);
        assertNotEquals(9.9, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    void testMultiplication(){
        System.out.println("testMultiplication method!");

        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;

        assertEquals(expected, actual,() -> firstNumber+secondNumber+ " did not produce "+expected);
        assertNotEquals(9.9, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDivision(){
        System.out.println("testDivision method!");

        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 3.1D;

        assertEquals(expected, actual,() -> firstNumber+secondNumber+ " did not produce "+expected);
        assertNotEquals(9.9, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test (6.2 + 2)/ 2 = 4.1")
    void testMedia(){
        System.out.println("testMedia method!");

        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 4.1D;

        assertEquals(expected, actual,() -> firstNumber+secondNumber+ " did not produce "+expected);
        assertNotEquals(9.9, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test SquareRoot of 81 = 9")
    void testSquareRoot(){
        System.out.println("testSquareRoot method!");

        double firstNumber = 81D;
        double expected = 9D;
        Double actual = math.squareRoot(firstNumber);


        assertEquals(expected, actual,() -> firstNumber+ " did not produce "+expected);
        assertNotEquals(9.9, actual);
        assertNotNull(actual);
    }

    //@Disabled("TODO: We need still work on it!")
    @Test
    @DisplayName("Test Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(){

        //given
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        var exceptedMessage = "Impossible to divide by zero";
        var actual = assertThrows(ArithmeticException.class, () -> {
            //when and then
            math.division(firstNumber, secondNumber);
        }, () -> "Division by zero should throw an ArithmeticException");

        assertEquals(exceptedMessage, actual.getMessage(), () -> "Unexpected exception message");
    //fail();
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Display Name")
    @Test
    void testABCD_when_XYZ_Should() {
    	// Given / Arrange
    	// When / Act
    	// Then / Assert
    }
}