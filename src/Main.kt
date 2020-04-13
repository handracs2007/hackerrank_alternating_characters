// https://www.hackerrank.com/challenges/alternating-characters/problem

fun alternatingCharacters(s: String): Int {
    val aRegex = "[A]{2,}".toRegex()
    val bRegex = "[B]{2,}".toRegex()

    var deleteCount = 0

    // Check for removel of A character(s)
    aRegex.findAll(s).forEach { deleteCount += it.value.length - 1 }

    // Check for removal of B character(s)
    bRegex.findAll(s).forEach { deleteCount += it.value.length - 1 }

    return deleteCount
}

fun main() {
    println(alternatingCharacters("AAAA"))
    println(alternatingCharacters("BBBBB"))
    println(alternatingCharacters("ABABABAB"))
    println(alternatingCharacters("BABABA"))
    println(alternatingCharacters("AAABBB"))
}