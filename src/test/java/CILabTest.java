import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse());

    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("leetcode");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("Google");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest4() {
        myString.setString("thisSentenceIsFalse");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest5() {
        myString.setString("To");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest6() {
        myString.setString("I");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest7() {
        myString.setString("to");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest8() {
        myString.setString("TO");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest9() {
        myString.setString("tO");
        assertFalse(myString.detectCapitalUse());
    }

}
