class Influenza extends Virus {

  override def affect(individual : Person) : Person = {
    individual.addSymptom(List("fever", "tiredness", "weakness",
      "coughing", "sneezing"))
  }
}
