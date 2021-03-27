class KontoBankowe(private var poczatkowyStanKonta: Double = 0.00) {

  private var _stanKonta = 0.0

  if (poczatkowyStanKonta > 0) {
    _stanKonta = poczatkowyStanKonta
  }

  def stanKonta = _stanKonta

  def wplata(wartosc: Double) {
    if (wartosc > 0) {
      _stanKonta += wartosc
    } else {
      println("Wplata nie moze byc ujemna")
    }
  }

  def wyplata(wartosc: Double) =
    if (0 < wartosc && wartosc <= _stanKonta) {
      _stanKonta -= wartosc
    } else {
      println("Niewystarczajace srodki")
    }

}

val konto1 = new KontoBankowe(10)
konto1.wyplata(10)
konto1.stanKonta