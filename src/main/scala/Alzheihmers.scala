class Alzheihmers extends Disease {

  override def affect(individual: Person): Person = {
    individual.addSymptom(List("memoryLoss"))
  }
}
