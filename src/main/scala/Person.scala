class Person(name : String, isFemale : Boolean, existingSymptoms : List[String]) {

  def addSymptom(newSymptoms : List[String]) : Person = {
    new Person (name, isFemale, existingSymptoms ++ newSymptoms)

    }

  override def toString () : String = {
    s"$name has $existingSymptoms"
  }
   def diagnose (symptomList: List [String]): Boolean = {
     symptomList.forall(x => existingSymptoms.contains(x))
   }

}

