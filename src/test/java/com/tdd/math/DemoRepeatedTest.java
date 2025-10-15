package com.tdd.math;

import com.tdd.SimpleMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {
    SimpleMath math;
    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }

    @RepeatedTest(value = 3, name = "{displayName}. Repetition " +
            "{currentRepetition} of {totalRepetitions}! ")
    @DisplayName("Test Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(
            RepetitionInfo repetitionInfo,
            TestInfo testeInfo
    ){
        System.out.println("Repetitio N° "+ repetitionInfo.getCurrentRepetition() +
                " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("Running " + testeInfo.getTestMethod().get().getName());
        //given
        double firstNumber = 6.2D;
        double secondNumber = 0D;

        var exceptedMessage = "Impossible to divide by zero";
        var actual = assertThrows(ArithmeticException.class, () -> {
            //when and then
            math.division(firstNumber, secondNumber);
        }, () -> "Division by zero should throw an ArithmeticException");

        assertEquals(exceptedMessage, actual.getMessage(), () -> "Unexpected exception message");
        //fail();
    }
}
