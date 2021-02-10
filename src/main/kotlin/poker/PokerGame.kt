package poker

import poker.common.deck.cards.Card

/*
 This interface can be used to implement game hands and evaluation rules
 */
interface PokerGame {
    fun dealHand(): List<Card>
    fun evaluateHand(hand: List<Card>): String
}