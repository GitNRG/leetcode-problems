package problem1

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import java.lang.Exception
import kotlin.test.assertFailsWith

class TwoSumTest {

    @Test
    fun testFunReturnsFirstTwoElements() {
        val result = TwoSum().twoSum(intArrayOf(2, 7, 11, 15), 9)
        result.sort()
        assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    internal fun testReturnsTwoNonFirstElements() {
        val result = TwoSum().twoSum(intArrayOf(4, 5, 9, 1), 6)
        result.sort()
        assertArrayEquals(intArrayOf(1, 3), result)
    }

    @Test
    internal fun testThatExceptionIsThrownIfNoSolutionExists() {
        assertFailsWith(Exception::class) {
            TwoSum().twoSum(intArrayOf(1, 2, 3, 4), 99)
        }
    }

    @Test
    internal fun testExceptionIsTrownOnEmptyInput() {
        assertFailsWith(Exception::class) {
            TwoSum().twoSum(intArrayOf(), 1)
        }
    }

    @Test
    internal fun testTheSameElementCanNotBeReUsed() {
        assertFailsWith(Exception::class) {
            TwoSum().twoSum(intArrayOf(2, 3, 8), 6)
        }
    }

    @Test
    internal fun testElementsWithTheSameValueCanBeUsed() {
        val result = TwoSum().twoSum(intArrayOf(2, 3, 3, 8), 6)
        result.sort()
        assertArrayEquals(intArrayOf(1, 2), result)
    }

    @Test
    internal fun testNegativeElementsCouldBeUsed() {
        val result = TwoSum().twoSum(intArrayOf(1, -2, -3, 4), -2)
        result.sort()
        assertArrayEquals(intArrayOf(0, 2), result)
    }
}