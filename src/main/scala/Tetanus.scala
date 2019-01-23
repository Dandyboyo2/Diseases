class Tetanus extends Bacteria {

  def affect(individual : Person) : Person = {
    individual.addSymptom("MuscleSpasms")
  }
}
