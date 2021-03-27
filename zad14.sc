def przyjmujaca_calkowite(wartosc_calkowita: Int) = {
   wartosc_calkowita*2
}

def przyjmujaca_calkowite_i_funkcje(funkcja: Int => Int, wartosc_calkowita: Int) = {
  funkcja(wartosc_calkowita)
}

/* Zastosowane do wartosci calkowitej = 50 */
var a = przyjmujaca_calkowite_i_funkcje(przyjmujaca_calkowite, przyjmujaca_calkowite_i_funkcje(przyjmujaca_calkowite, przyjmujaca_calkowite_i_funkcje(przyjmujaca_calkowite, 50)))
print(a)