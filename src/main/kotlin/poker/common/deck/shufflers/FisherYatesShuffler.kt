package poker.common.deck.shufflers

import poker.common.deck.cards.Card
import poker.common.deck.shufflers.utils.FisherYates
import kotlin.random.Random

object FisherYatesShuffler: Shuffler {
    override fun shuffle(cards: MutableList<Card>) {
        val random = Random(System.currentTimeMillis())
        FisherYates.shuffle(random,cards)
    }
}