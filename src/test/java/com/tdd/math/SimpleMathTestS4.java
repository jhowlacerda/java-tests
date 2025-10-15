package com.tdd.math;

import com.tdd.SimpleMath;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTestS4 {
    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Pelé", "Senna", "Keith Moon"})
    void testValueSource(String firstName){
        System.out.println(firstName);
        assertNotNull(firstName);
    }
    @DisplayName("Test 6.2 / 2 = 3.1")
    @ParameterizedTest
    @MethodSource("testDivisionInputParameters")
    void testDivision(double firstNumber, double secondNumber, double expected){
        System.out.println("testDivision "+ firstNumber + " / " + secondNumber + " = " + expected);
        Double actual = math.division(firstNumber, secondNumber);

        assertEquals(expected, actual,2D,() -> firstNumber+secondNumber+ " did not produce "+expected);
    }

    public static Stream<Arguments> testDivisionInputParameters() {
        return Stream.of(
                Arguments.of(6.2D, 2D, 3.1D),
                Arguments.of(71D, 14D, 5.07D),
                Arguments.of(18.3D, 3.1D, 5.90D)
        );
    }

/*
    @DisplayName("Test 6.2 / 2 = 3.1")
    @ParameterizedTest
    @MethodSource()//se os metodos tiverem o mesmo nome, não precisa colocar o nome do método
    void testDivision2(double firstNumber, double secondNumber, double expected){
        System.out.println("testDivision "+ firstNumber + " / " + secondNumber + " = " + expected);
        Double actual = math.division(firstNumber, secondNumber);

        assertEquals(expected, actual,2D,() -> firstNumber+secondNumber+ " did not produce "+expected);
    }

    public static Stream<Arguments> testDivision2() {
        return Stream.of(
                Arguments.of(6.2D, 2D, 3.1D),
                Arguments.of(71D, 14D, 5.07D),
                Arguments.of(18.3D, 3.1D, 5.90D)
        );
    }
*/
    @DisplayName("Test double subtraction [double firstNumber, double secondNumber, double expected]")
    @ParameterizedTest
    /*@CsvSource({
            "6.2,2,3.1",
            "71,14,5.07",
            "18.3,3.1,5.90"
    })*/
//    CsvSource({"Pelé, Football"
//                      "Senna, F1",
//    "KeithMoon, Tennis"})
    @CsvFileSource(resources = "/testDivision.csv")
    void testDivisionCsv(double firstNumber, double secondNumber, double expected){
        System.out.println("testDivision "+ firstNumber + " / " + secondNumber + " = " + expected);
        Double actual = math.division(firstNumber, secondNumber);

        assertEquals(expected, actual,2D,() -> firstNumber+secondNumber+ " did not produce "+expected);
    }
}