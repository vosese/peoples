fun main() {
    val likes: Int = 52
    val end: Int = likes % 10
    if (end == 1) {
        println("Понравилось " + likes + " человеку")
    } else {
        println("Понравилось " + likes + " людям")
    }
}