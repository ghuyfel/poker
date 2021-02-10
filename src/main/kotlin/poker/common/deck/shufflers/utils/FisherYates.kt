package poker.common.deck.shufflers.utils

import kotlin.random.Random

object FisherYates {
    fun <T> shuffle(random: Random, list: MutableList<T>) {
        for (i in list.size - 1 downTo 1) {
            val j = random.nextInt(i + 1)
            val temp = list[i]
            list[i] = list[j]
            list[j] = temp
        }
    }
}