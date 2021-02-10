package poker.games.fiveofkind

import org.junit.Test
import kotlin.test.assertEquals

class FiveOfKindDeckTest {

    @Test
    fun test_CantrellDeck_generateCards() {
        val cards = FiveOfKindDeck.generateCards()
        assertEquals(FiveOfKindDeck.DECK_SIZE, cards.size, "Failed to generate valid deck.")
    }
}