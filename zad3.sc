import scala.annotation.tailrec

val dni_tygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

def zad3(dni: List[String]): String = {
  def recursion(i: Int): String = {
    @tailrec
    def iter(x: Int, result: String): String = {
      if (x == dni.length-1) {
        result + "," + dni(x)
      } else if (result == "") {
        iter(x+1, dni(x))
      } else {
        iter(x+1, result + "," + dni(x) )
      }
    }
    iter(i,"")
  }
  recursion(0)
}

zad3(dni_tygodnia)