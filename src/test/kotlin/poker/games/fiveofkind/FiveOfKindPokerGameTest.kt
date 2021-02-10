package poker.games.fiveofkind

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import poker.common.deck.cards.Card
import poker.common.deck.shufflers.Shuffler
import poker.common.deck.shufflers.TestShuffler


internal class FiveOfKindPokerGameTest {

    lateinit var game: FiveOfKindPokerGame
    lateinit var testShuffler: Shuffler
    lateinit var cards: MutableList<Card>

    @Before
    fun setUp() {

    cards = FiveOfKindDeck.generateCards()
        testShuffler = TestShuffler()
        game = FiveOfKindPokerGame(
            cards = cards,
            shuffler = testShuffler
        )
    }

    @Test
    fun test_FiveOfKindPokerGame_dealHand_correct_size() {
        val testHand = game.dealHand()
        assertThat(testHand.size).isEqualTo(game.HAND_SIZE)
    }
}