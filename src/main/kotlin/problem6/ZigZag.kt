package problem6

import java.lang.StringBuilder

class ZigZag {

    fun convert(s: String, numRows: Int): String {
        if (s.length <= numRows || numRows == 1) {
            return s
        }
        val builder = StringBuilder()
        val zigZagLen = numRows * 2 - 2
        // iterate over lines
        for (i in 0 until Math.min(s.length, numRows)) {
            val shift = zigZagLen - i * 2
            // iterate over zigzags
            for (j in i until s.length step zigZagLen) {
                val idx1 = j
                val idx2 = j + shift

                builder.append(s[idx1])
                if (idx1 < idx2 && idx2 < j + zigZagLen && idx2 < s.length) {
                    builder.append(s[idx2])
                }
            }
        }
        return builder.toString().trim()
    }
}