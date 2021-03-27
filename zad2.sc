val dni_tygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

def zad2_a(dni: List[String]): String = {
  def recursion(i: Int): String = {
    if (i == dni.length-1) {
      dni(i)
    } else {
      dni(i) + "," + recursion(i+1)
    }
  }
  recursion(0)
}

def zad2_b(dni: List[String]): String = {
  def reverse_recursion(i: Int): String = {
    if (i == 0) {
      dni(i)
    } else {
      dni(i) + "," + reverse_recursion(i-1)
    }
  }
  reverse_recursion(dni.length-1)
}

zad2_a(dni_tygodnia)
zad2_b(dni_tygodnia)
