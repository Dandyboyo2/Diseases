class Person(name : String, isFemale : Boolean, symptoms : List[String]) {

  def addSymptom(symptom : String) : Person = {
    new Person (name, isFemale, symptoms :+ symptom)
  }

}
