package poker.common.deck.shufflers

import poker.common.deck.cards.Card

/*
This interface can be used to implement different types of Shuffling
 */
interface Shuffler {
    fun shuffle(cards: MutableList<Card>)
}