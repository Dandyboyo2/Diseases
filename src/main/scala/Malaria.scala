class Malaria extends Parasite {

  override def affect(individual : Person) : Person = {
    individual.addSymptom(List("fever", "convulsions", "coma",
      "vomiting", "shakingChills", "abdominalPain", "anemia",
      "musclePain", "diarrhoea", "bloodyStools"))
  }

}

