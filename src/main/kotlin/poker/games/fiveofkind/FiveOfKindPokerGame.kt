package poker.games.fiveofkind

import poker.PokerGame
import poker.common.deck.cards.Card
import poker.common.deck.shufflers.Shuffler
import kotlin.random.Random


class FiveOfKindPokerGame(private val cards: MutableList<Card>, private val shuffler: Shuffler): PokerGame {

    val HAND_SIZE = 5

    fun shuffleDeck(count: Int = 1) {
        for(i in 0 until count) {
            print("Shuffling... ")
            shuffler.shuffle(cards)
        }
        println()
    }

    override fun dealHand(): List<Card> {
        val hand = mutableListOf<Card>()
        val random = Random(System.currentTimeMillis())
        for(i in 0 until HAND_SIZE) {
            hand.add(cards[random.nextInt(cards.size -1)])
        }
        return hand.sortedByDescending { it.rank }
    }

    override fun evaluateHand(hand: List<Card>): String = FiveOfKindHandEvaluator(hand = hand).evaluateCards()

}