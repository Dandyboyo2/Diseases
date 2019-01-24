object Plagues extends App {

  val andrew = new Person ("Andrew", false, (List("cough")))

  val x = new Malaria
  val y = new Influenza
  val z = new Tetanus

  println(
    z.affect(y.affect(x.affect(andrew))))

  val a = x.affect(andrew)
  val b = y.affect(a)
  val c = z.affect(b)
  println(c)

  
}
