class Influenza extends Virus {

  def affect(individual : Person) : Person = {
    individual.addSymptom("MuscleSpasms")
  }
}
