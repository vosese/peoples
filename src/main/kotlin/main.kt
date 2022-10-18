fun main() {
    val likes: Int = 52
    val end: Int = likes % 10
    val end1: Int = likes % 100 / 10
    if (end == 1 && end1 == 1) {
        println("Понравилось " + likes + " человекам")
    }
    if (end == 1 && end1 != 1) {
        println("Понравилось " + likes + " человеку")
    }
    if (end != 1) {
        println("Понравилось " + likes + " людям")
    }
}