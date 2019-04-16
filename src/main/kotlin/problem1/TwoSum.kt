package problem1

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val tmp = nums.copyOf()
        tmp.sort()
        for (i in 0 until tmp.size) {
            for (j in i + 1 until tmp.size) {
                if (tmp[i] + tmp[j] > target) {
                    break
                } else if (tmp[i] + tmp[j] == target) {
                    return intArrayOf(nums.indexOf(tmp[i]), nums.lastIndexOf(tmp[j]))
                }
            }
        }
        throw Exception("At least one solution is expected")
    }
}