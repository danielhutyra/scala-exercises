/* ZAD 1 */

val dni_tygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

def zad1_a(dni: List[String]): String = {
  var MyString = ""

  for (i <- dni)
    if (dni.indexOf(i) == dni.length - 1) {
      MyString = MyString + i
    } else {
      MyString = MyString + i + ","
    }
  MyString
}

def zad1_b(dni: List[String]): String = {
  var MyString1 = ""

  for (i <- dni if i.startsWith("P"))
    if (dni.filter(_.startsWith("P")).indexOf(i) == dni.filter(_.startsWith("P")).length-1) {
      MyString1 = MyString1 + i
    } else {
      MyString1 = MyString1 + i + ","
    }
  MyString1
}

def zad1_c(dni: List[String]): String = {
  var j=0
  var MyString2 = ""

  while (j < dni.length){
    if (j == dni.length-1) {
      MyString2 = MyString2 + dni(j)
      j+=1
    } else {
      MyString2 = MyString2 + dni(j) + ","
      j+=1
    }
  }
  MyString2
}



print(zad1_a(dni_tygodnia))
print(zad1_b(dni_tygodnia))
print(zad1_c(dni_tygodnia))
