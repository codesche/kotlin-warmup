package roadtopro251023

/**
 * 복잡도: O(n)
 * 실무 예: 추천 시스템, 합산 조건 검색, 슬라이딩 윈도우 로직 등
 */
fun main() {
    val nums = listOf(1, 3, 4, 6, 7, 8, 11)
    val target = 10
    var left = 0
    var right = nums.lastIndex

    while (left < right) {
        val sum = nums[left] + nums[right]
        when {
            sum == target -> {
                println("찾은 쌍: (${nums[left]}, ${nums[right]}")
                left++
                right--
            }
            sum < target -> left++;
            else -> right--
        }
    }

}