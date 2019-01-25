object Plagues extends App {

  val andrew = new Person ("Andrew", false, List("cough"))

  val malaria = new Malaria
  val influenza = new Influenza
  val tetanus = new Tetanus

  println(
    tetanus.affect(influenza.affect(malaria.affect(andrew))))

  val andrewMalaria = malaria.affect(andrew)
  val andrewMalariaInfluenza = influenza.affect(andrewMalaria)
  val andrewMalariaInfluenzaTetanus = tetanus.affect(andrewMalariaInfluenza)
  println(andrewMalariaInfluenzaTetanus)

  val dan = new Person ("Dan", false, List("sudden sleep"))
  val megan = new Person ("Megan", true, List("bloody stool"))
  val mo = new Person ("Mo", false, Nil)
  val brendan = new Person ("Bren Flakes", false, List("melt"))

  val theApprenti: List[Person] = List(dan, megan, mo, brendan)
  val affectedApprenti = for (apprentice <- theApprenti) yield malaria.affect(apprentice)

  println(affectedApprenti)


  val firstNames: List[String]= List ("Dan", "Chris","Mike" )
  val secondNames: List[String]= List ("smith", "wazowski","bailey" )

  for{
    firstName <- firstNames
    secondName <- secondNames
  }
    println(s"$firstName $secondName")

}

