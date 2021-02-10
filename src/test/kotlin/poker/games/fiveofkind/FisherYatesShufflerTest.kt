package poker.games.fiveofkind

import Mock
import com.google.common.truth.Truth.assertThat
import poker.common.deck.cards.Card
import poker.common.deck.shufflers.FisherYatesShuffler
import org.junit.Test


class FisherYatesShufflerTest {

    @Test
    fun test_FisherYatesShuffler_shuffle() {
        val cards = Mock.getMockCantrellDeck()
        val toShuffle = mutableListOf<Card>().apply { addAll(cards) }
        FisherYatesShuffler.shuffle(toShuffle)
        assertThat(cards).isNotEqualTo(toShuffle)
    }

}