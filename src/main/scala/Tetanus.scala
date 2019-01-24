class Tetanus extends Bacteria {

  override def affect(individual : Person) : Person = {
    individual.addSymptom(List("muscleSpasms", "muscleStiffness", "fever"))
  }
}
