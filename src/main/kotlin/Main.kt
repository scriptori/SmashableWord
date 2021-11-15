/**
 * Execute with gradle run --args='arg1 arg2'
 */
fun main(args: Array<String>) {
    val sw = SmashableWordImpl()

    args.forEach {
        println("Possible words for $it are ${sw.getPossibleWords(it).joinToString(
            ", ", "[", "]"
        )}")
        println("$it is ${if(sw.isSmashable(it)) "" else "NOT "}smashable!\n")
    }
}
