package poker.common.deck.cards


data class Card(val rank: Int, val name: String, val suit: Int) {

    override fun toString(): String {
        return "$name${suit.toChar()}"
    }
}