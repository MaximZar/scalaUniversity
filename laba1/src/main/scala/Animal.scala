// 1 часть задания
class Animal(name: String, species: String, food: String) {
  def eats(food: String): Boolean = Animal.animals(name)(1) == food
}
object Animal {
  val animals = Map("cat" -> Array[String]("mammal", "meat"),
  "parrot" -> Array[String]("bird", "vegetables"),
  "goldfish" -> Array[String]("fish", "plants"))
}

//2 часть задания (начиная с пункта d)
trait Animal {
  case object mammal extends Animal
  case object bird extends Animal
  case object fish extends Animal
}
object Animal {
  def knownAnimal(name: String): Boolean = {
    name match {
      case "cat" => true
      case "parrot" => true
      case "goldfish" => true
      case _ => false
    }
  }
  def apply(name: String): Option[Animal] = Some.apply(Animal.this)
}
class Animal(name: String, food: String) {
  trait Food {
    case class Meat
    case class Vegetables
    case class Plants
  }
  object Food {
    def apply(food: String): Option[Food] = Some.apply(Food.this)
  }
}