import java.nio.file.Files
import java.nio.file.Paths

class Dictionary {
    private var wordsSet = HashSet<String>()

    init {
        val file = Paths.get("src/main/resources/assets/words.txt")
        val readBytes = Files.readAllBytes(file)
        val wordListContents = String(readBytes)
        val words = wordListContents.split("\n")
            .toTypedArray() //the text file should contain one word in one line
        wordsSet.addAll(words)
    }

    fun contains(word: String): Boolean {
        return wordsSet.stream().anyMatch {
            it.equals(word, true)
        }
    }
}
