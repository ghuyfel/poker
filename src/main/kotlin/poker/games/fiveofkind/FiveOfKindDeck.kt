package poker.games.fiveofkind

import poker.common.deck.cards.Card
import poker.common.deck.Deck
import poker.common.deck.cards.CardSuit



object FiveOfKindDeck: Deck {
    const val DECK_SIZE = 52
    private val cards = ArrayList<Card>()

    override fun generateCards(): MutableList<Card> {
        if(cards.isEmpty()) {
            //Generate club
            cards.addAll(generateCardForSuit(CardSuit.club))
            // Generate Diamonds
            cards.addAll(generateCardForSuit(CardSuit.diamond))
            // Generate Hearts
            cards.addAll(generateCardForSuit(CardSuit.heart))
            // Generate Spades
            cards.addAll(generateCardForSuit(CardSuit.spade))
        }

        return cards
    }

    private fun generateCardForSuit(suit: Int): List<Card> {
        val temp = ArrayList<Card>()
        temp.add(Card(13, "K", suit))
        temp.add(Card(12, "Q", suit))
        temp.add(Card(11, "J", suit))
        temp.add(Card(1, "A", suit))

        for(i in 10 downTo 2) {
            temp.add(Card(i, "$i", suit))
        }

        return temp
    }


}