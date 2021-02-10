package poker.common.utils

import poker.common.deck.cards.Card

object CardUtils {
    fun countCardOfRankInList(list: List<Card>, rank: Int): Int {
        var count = 0
        for (card in list) {
            if (card.rank == rank) {
                count++
            }
        }
        return count
    }

    fun checkListIsSameSuitCards(list: List<Card>): Boolean {
        val suit = list[0].suit
        for (card in list) {
            if (card.suit.compareTo(suit) != 0) return false
        }
        return true
    }

    fun checkIsInSequence(list: List<Card>): Boolean {
        var previousRank = list[0].rank
        for (i in 1 until list.size) {
            --previousRank
            if (list[i].rank != previousRank) {
                return false
            }
        }
        return true
    }

    fun countPairsInList(list: List<Card>): Int {
        return if (list.size < 2) 0
        else if (list.size == 2) if (list[0].rank == list[1].rank) 1 else 0
        else {
            val temp = getSortedDescendingList(list)
            val count = if (temp[0].rank == temp[1].rank) 1 else 0
            if (count == 0)
                countPairsInList(temp.subList(1, temp.size))
            else
                count + countPairsInList(temp.subList(2, temp.size))
        }
    }

    fun getSortedDescendingList(toSort: List<Card>): List<Card> {
        val temp = mutableListOf<Card>()
        temp.addAll(toSort)
        temp.sortByDescending { it.rank }
        return temp
    }

    fun printCleanList(list: List<Card>): String {
        return list.toString()
            .replace("]", "")
            .replace(",", "")
            .replace("[", "")
    }
}