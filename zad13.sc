class Osoba(val imie: String = "Bezimienny/a", val nazwisko: String = "Beznazwiskowy/a")

/* Wybralem opcje z imionami */
def zad3(x: Osoba): String = x.imie match {
  case "Romek" => s"Siema moj stary przyjecielu. Uwielbiam Cie ${x.imie}"
  case "Tomek" => s"Eluwina moj ziomalu. Lubie Cie ${x.imie}"
  case "Daniel" => s"O kurcze ${x.imie}, jak ja Cie dawno nie widzialem!"
  case _ => "Siemaaaaaaaaaano"
}

val Osoba1 = new Osoba("Daniel")
val Osoba2 = new Osoba("Tomek", "Kowalski")
val Osoba3 = new Osoba("Adrian", "Fajowski")

zad3(Osoba1)
zad3(Osoba2)
zad3(Osoba3)