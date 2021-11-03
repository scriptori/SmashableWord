import org.junit.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SmashableWordTest {

    @Test
    fun successfulSmashedTest() {
        SmashableWordImpl().also {
            assertTrue(it.isSmashable(""))
            assertFalse(it.isSmashable("&*0"))
            assertTrue(it.isWord("PAIN"))
            assertTrue(it.isSmashable("PAIN"))
            assertTrue(it.isWord("PRE"))
            assertFalse(it.isSmashable("PRE"))
            assertContentEquals(
                listOf("PAIN", "PAIT", "PANT", "PINT", "AINT"),
                it.getPossibleWords("PAINT")
            )
        }
    }
}
