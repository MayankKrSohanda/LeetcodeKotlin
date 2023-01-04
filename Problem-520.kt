fun detectCapitalUse(word: String): Boolean {
//    val len = word.length
//    if (len == 1) {
//        return true
//    }
//    var countUpper = 0
//    for (ch in word) {
//        if (ch.isUpperCase()) {
//            countUpper++
//        }
//    }
//    if (countUpper == 1 && word[0].isUpperCase()) {
//        return true
//    }
//    if (countUpper == 0 || countUpper == len) {
//        return true
//    }
//    return false

    // Or
    val pattern = Regex("[A-Z]*|.[a-z]*")
    return word.matches(pattern)
}