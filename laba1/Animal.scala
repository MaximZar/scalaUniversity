// 1 часть задания
class Animal(name: String, species: String, food: String) {
  def eats(food: String): Boolean = Animal.animals(name)(1) == food
}
object Animal {
  val animals = Map("cat" -> Array[String]("mammal", "meat"),
  "parrot" -> Array[String]("bird", "vegetables"),
  "goldfish" -> Array[String]("fish", "plants"))
}