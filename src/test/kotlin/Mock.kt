import poker.common.deck.cards.Card
import poker.common.deck.cards.CardSuit

object Mock {
    fun getMockCantrellDeck(): MutableList<Card> =
        mutableListOf(
            Card(1, "A", CardSuit.club),
            Card(2, "2", CardSuit.club),
            Card(3, "3", CardSuit.club),
            Card(4, "4", CardSuit.club),
            Card(5, "5", CardSuit.club)
        )

    fun getMockFourOfKindPass(): List<Card> =
        mutableListOf(
            Card(1, "A", CardSuit.club),
            Card(13, "K", CardSuit.club),
            Card(13, "K", CardSuit.club),
            Card(13, "K", CardSuit.club),
            Card(13, "K", CardSuit.club)
        )
    fun getMockFourOfKindFailure(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(2, "2", CardSuit.club),
            Card(3, "3", CardSuit.club),
            Card(4, "4", CardSuit.club),
            Card(13, "K", CardSuit.club)
        )

    fun getMockFlushSuccess(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(2, "2", CardSuit.club),
            Card(13, "3", CardSuit.club),
            Card(13, "4", CardSuit.club),
            Card(13, "K", CardSuit.club)
        )
    fun getMockFlushFailure(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(2, "2", CardSuit.club),
            Card(1, "A", CardSuit.club),
            Card(13, "4", CardSuit.diamond),
            Card(13, "K", CardSuit.heart)
        )

    fun getMockStraightFlushSuccess(): List<Card> =
        mutableListOf(
            Card(1, "A", CardSuit.club),
            Card(2, "2", CardSuit.club),
            Card(3, "3", CardSuit.club),
            Card(4, "4", CardSuit.club),
            Card(5, "5", CardSuit.club)
        )

    fun getMockStraightFlushFailure(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(2, "2", CardSuit.club),
            Card(1, "A", CardSuit.club),
            Card(13, "K", CardSuit.diamond),
            Card(13, "K", CardSuit.club)
        )

    fun getMockThreeOfKindSuccess(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(2, "2", CardSuit.club),
            Card(1, "A", CardSuit.club),
            Card(13, "K", CardSuit.diamond),
            Card(13, "K", CardSuit.club)
        )

    fun getMockThreeOfKindFailure(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(2, "2", CardSuit.club),
            Card(1, "A", CardSuit.club),
            Card(4, "4", CardSuit.diamond),
            Card(13, "K", CardSuit.club)
        )

    fun getMockTwoPairSuccess(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(2, "2", CardSuit.club),
            Card(2, "2", CardSuit.club),
            Card(4, "4", CardSuit.diamond),
            Card(13, "K", CardSuit.club)
        )

    fun getMockTwoPairFailure(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(13, "K", CardSuit.club),
            Card(1, "A", CardSuit.club),
            Card(4, "4", CardSuit.diamond),
            Card(13, "K", CardSuit.club)
        )

    fun getMockPairSuccess(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(12, "Q", CardSuit.club),
            Card(1, "A", CardSuit.club),
            Card(4, "4", CardSuit.diamond),
            Card(13, "K", CardSuit.club)
        )

    fun getMockPairFailure(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(12,  "Q", CardSuit.club),
            Card(1, "A", CardSuit.club),
            Card(4, "4", CardSuit.diamond),
            Card(3, "3", CardSuit.club)
        )

    fun getMockFullHouseSuccess(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(13, "K", CardSuit.heart),
            Card(12,  "Q", CardSuit.diamond),
            Card(12,  "Q", CardSuit.club),
            Card(12,  "Q", CardSuit.club)
        )

    fun getMockFullHouseFailure(): List<Card> =
        mutableListOf(
            Card(13, "K", CardSuit.club),
            Card(13, "K", CardSuit.heart),
            Card(12,  "Q", CardSuit.diamond),
            Card(12,  "Q", CardSuit.club),
            Card(11,  "J", CardSuit.spade)
        )
}