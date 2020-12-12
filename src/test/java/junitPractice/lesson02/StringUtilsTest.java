package junitPractice.lesson02;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
    //"   **" ---> "**", "****" ---> "****","**  " ---> "**  "
    StringUtils stringUtils = new StringUtils();

    @Test
    public void testChopOff2SpecesAtHeadBoth() {
        assertEquals("**", stringUtils.chopOff2SpecesAtHead("  **"));
    }

    @Test
    public void testChopOff2SpecesAtHeadSingle() {
        assertEquals("**", stringUtils.chopOff2SpecesAtHead(" **"));
    }

    @Test
    public void testChopOff2SpecesAtHeadNone() {
        assertEquals("****", stringUtils.chopOff2SpecesAtHead("****"));
    }

    @Test
    public void testChopOff2SpecesAtHeadBothAtRight() {
        assertEquals("**  ", stringUtils.chopOff2SpecesAtHead("**  "));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqualGenAllDiffFalse() {
        assertFalse("All different symbols", stringUtils.are2CharsAtHeadAndTailEqual("1234"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqualGenAllSameFalse() {
        assertTrue(stringUtils.are2CharsAtHeadAndTailEqual("1212"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqualOnlyTwo() {
        assertTrue(stringUtils.are2CharsAtHeadAndTailEqual("12"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqualOnlyOne() {
        assertFalse(stringUtils.are2CharsAtHeadAndTailEqual("1"));
    }
}
