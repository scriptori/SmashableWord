class SmashableWordImpl : SmashableWord {

    private val dict = Dictionary()

    override fun isWord(word: String): Boolean {
        return dict.contains(word)
    }

    override fun isSmashable(next: String): Boolean {
        if (next.isEmpty()) return true
        if (!isWord(next)) return false
        return getPossibleWords(next).firstOrNull { isWord(it) }?.let {
            isSmashable(it)
        } ?: false
    }

    fun getPossibleWords(base: String): List<String> {
        return mutableListOf<String>().also {
            for (i in (base.length - 1) downTo 0) {
                it.add(StringBuilder(base).deleteCharAt(i).toString())
            }
        }
    }
}
