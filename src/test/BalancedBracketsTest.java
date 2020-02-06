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
    public void onlyBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void incorrectBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void singleBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void incorrectPlacementOfBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCo]de["));
    }
    @Test
    public void singleBracketWithStrReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void correctBracketsAtStartReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launchcode"));
    }
    @Test
    public void correctBracketsInStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Laun[ch]Code"));
    }
    @Test
    public void correctBracketUseReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void anEmptySpaceReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }
}
