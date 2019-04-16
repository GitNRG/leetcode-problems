package problem6

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ZigZagTest {

    @Test
    internal fun emptyStringShouldBeEqualsItselfOnSingleRow() {
        val result = ZigZag().convert("", 1)
        assertEquals("", result)
    }

    @Test
    internal fun emptyStringShouldBeEqualsItselfOnMultipleRows() {
        val result = ZigZag().convert("", 999)
        assertEquals("", result)
    }

    @Test
    internal fun testSingleCharEqualsItSelfOnSingleRow() {
        val result = ZigZag().convert("a", 1)
        assertEquals("a", result)
    }

    @Test
    internal fun singleCharShouldEqualItselfOnMultipleRows() {
        val result = ZigZag().convert("a", 99)
        assertEquals("a", result)
    }

    @Test
    internal fun singleRowZigZagShouldBeEqualToInput() {
        val result = ZigZag().convert("ab", 1)
        assertEquals("ab", result)
    }

    @Test
    internal fun stringShorterThenNumberOfRowsShouldEqualItself() {
        val result = ZigZag().convert("abcdef", 7)
        assertEquals("abcdef", result)
    }

    @Test
    internal fun stringWithLengthEqualsToNumberOfRowsShouldBeEqualToItself() {
        val result = ZigZag().convert("qwerty", 6)
        assertEquals("qwerty", result)
    }

    @Test
    internal fun minZigZag2By2ShouldBeValid() {
        val result = ZigZag().convert("abcd", 2)
        assertEquals("acbd", result)
    }

    @Test
    internal fun minIncompleteigZag2By2ShouldBeValid() {
        val result = ZigZag().convert("abc", 2)
        assertEquals("acb", result)
    }

    @Test
    internal fun stringWithLengthEqualToRowNumMinusOneShouldFormAFullZigZag() {
        val result1 = ZigZag().convert("loves", 3)
        assertEquals("lsoev", result1)

        val result2 = ZigZag().convert("lovebites", 5)
        assertEquals("lsoevteib", result2)
    }

    @Test
    internal fun tripleZigZag() {
        val result = ZigZag().convert("abcdefghijklmnopqrstu", 6)
        assertEquals("akubjltcimsdhnregoqfp", result)
    }

    @Test
    internal fun doubleIncompleteZigZag() {
        val result = ZigZag().convert("abcdefghijklmnopqr", 6)
        assertEquals("akbjlcimdhnregoqfp", result)

    }
}