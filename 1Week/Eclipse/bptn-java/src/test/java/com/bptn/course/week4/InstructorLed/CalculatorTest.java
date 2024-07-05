//package com.bptn.course.week4.InstructorLed;
//
//import com.bptn.course.week4.junit.instructorLed.Calculator;
//import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.TestInstance.Lifecycle;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@TestInstance(Lifecycle.PER_CLASS)
//public class CalculatorTest {
//
//    Calculator calc = new Calculator();
//
//    @BeforeAll
//    void initialize() {
//
//        System.out.println("@Test: initialize()");
//        calc = new Calculator();
//
//
//    }
//    @BeforeEach
//    void beforeEachTest() {
//        System.out.println("@BeforeEach: Executed before each test.");
//    }
//
//    @Test
//    void testFindMax() {
//        System.out.println("@Test: testFindMax()");
//        assertEquals(4, calc.findMax(new int[]{1, 4, 3, 2}));
//        int max = calc.findMax(new int[]{1,4,6,10,3} );
//        int expected = 10;
//        assertEquals(expected, max, "The output was incorrect it should be: ");
//    }
//
//    @Test
//    void testFindMaxNegative() {
//        System.out.println("@Test: testFindMaxNegative()");
//        assertEquals(-1, calc.findMax(new int[]{ -12,-3,-4,-1}));
//    }
//
//}
