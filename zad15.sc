class Osoba(private val _imie :String = "Bezimienny/a",
            private val _nazwisko :String = "Beznazwiskowy/a",
            private var _podatek : Double = 0.0) {

  def imie = _imie
  def nazwisko = _nazwisko
  def podatek = _podatek

}

trait Student extends Osoba {
  override def podatek: Double = 0.0
}

trait Pracownik extends Osoba {
  private var _pensja = 0.00

  def pensja = _pensja

  override def podatek: Double = {
    pensja * 0.2
  }

  def pensja_= (newValue: Double): Unit = {
    _pensja = newValue
  }
}

trait Nauczyciel extends Pracownik {
  override def podatek: Double = {
    pensja * 0.1
  }
}

/* STUDENT */
var osoba1 = new Osoba("Daniel", "Hutyra", 95) with Student
osoba1.podatek

/* PRACOWNIK */
var osoba2 = new Osoba("Daniel", "Hutyra", 95) with Pracownik
osoba2.pensja = 5000.55
osoba2.podatek

/* NAUCZYCIEL */
var osoba3 = new Osoba("Daniel", "Hutyra", 95) with Nauczyciel
osoba3.pensja = 5000.55
osoba3.podatek

/* STUDENT + PRACOWNIK */
var osoba4 = new Osoba("Daniel", "Hutyra", 95) with Student with Pracownik
osoba4.pensja = 5000.55
osoba4.podatek

/* PRACOWNIK + STUDENT */
var osoba5 = new Osoba("Daniel", "Hutyra", 95) with Pracownik with Student
osoba5.pensja = 5000.55
osoba5.podatek
