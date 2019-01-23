class Alzheihmers extends Disease {

  def affect(individual: Person): Person = {
    individual.addSymptom("memoryLoss")
  }
}
