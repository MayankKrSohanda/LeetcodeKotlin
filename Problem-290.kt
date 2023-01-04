fun wordPattern(pattern: String, s: String): Boolean {
//    val ump = mutableMapOf<Char, String>()
//    val words = mutableSetOf<String>()
//    var word = ""
//    val newString = "$s "
//    var i = 0
//    var countSpace = 0
//    val patternLength = pattern.length
//    for (ch in newString) {
//        if (ch == ' ') {
//            if (i >= patternLength) {
//                return false
//            }
//            val check = ump[pattern[i]]
//            if (check == null) {
//                if (!words.contains(word)) {
//                    ump[pattern[i]] = word
//                    words.add(word)
//                } else {
//                    return false
//                }
//            } else {
//                if (check != word) {
//                    return false
//                }
//            }
//            word = ""
//            i++
//            countSpace++
//        } else {
//            word += ch
//        }
//    }
//    if (countSpace != patternLength) {
//        return false
//    }
//    return true

    // Or

    val words = s.split(" ")
    if (words.size != pattern.length) {
        return false
    }
    val map = mutableMapOf<Char, String>()
    pattern.forEachIndexed { index, ch ->
        val word = words[index]
        when (map.containsKey(ch)) {
            true -> {
                if (map[ch] != word) {
                    return false
                }
            }

            false -> {
                if (map.containsValue(word)) {
                    return false
                }
                map[ch] = word
            }
        }
    }
    return true
}
