package poker.common.deck

import poker.common.deck.cards.Card

/*
    This interface can be used to generate card decks depending on the game type
 */
interface Deck {
        fun generateCards(): List<Card>
}