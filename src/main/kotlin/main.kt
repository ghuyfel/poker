import poker.GamesList
import poker.games.GamesManager


fun main() {
    // We simulate here a choice from a list of poker games available
    val chosenGame = GamesList.FiveOfKind
    // The shuffle count can be input by the user or use the default
    GamesManager.startGame(shuffleCount = 3, chosenGame)
}

