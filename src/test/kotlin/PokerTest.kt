import com.hank.poker.Card
import com.hank.poker.Face
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PokerTest {
    val fiveOfDiamon = Card(5, Face.DIAMOND)
    val fiveOfSpade = Card(5, Face.SPADE)
    val aceOfDiamon = Card(1, Face.DIAMOND)
    @Test
    fun biggerTest() {
        Assertions.assertEquals(
            false , fiveOfDiamon > fiveOfSpade)
    }
    @Test
    fun aceBiggerTest() {
        Assertions.assertEquals(
            true, aceOfDiamon > fiveOfDiamon)
    }
}