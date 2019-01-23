class Malaria extends Parasite {

  def affect(individual : Person) : Person = {
    individual.addSymptom("Fever")
  }

}

