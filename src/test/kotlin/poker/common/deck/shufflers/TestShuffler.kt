package poker.common.deck.shufflers

import poker.common.deck.cards.Card

class TestShuffler : Shuffler {
    override fun shuffle(cards: MutableList<Card>) =cards.shuffle()
}
