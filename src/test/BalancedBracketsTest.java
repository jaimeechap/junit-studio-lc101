package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("ad"));
    }

    @Test
    public void stringsReturnTrue() {
//        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertEquals("These strings have balanced brackets",
                BalancedBrackets.hasBalancedBrackets("[LaunchCode]"),
                true);
    }

    @Test
    public void onlyOneLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyOneRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void wrongOrderBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("] ["));
    }

    @Test
    public void bracketInBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void incorrectOrderedBracketsWithinString () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Laun]chCode["));
    }

    @Test
    public void tooManyLeftBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Laun[code]"));
    }

    @Test
    public void bracketsAreEmpty() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void tooManyRightBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Laun]code]"));
    }

    @Test
    public void multipleBalanceBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

//
//
}
