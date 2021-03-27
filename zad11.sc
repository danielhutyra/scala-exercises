def zad1(x: String): String = x match {
  case "Poniedzialek" => "Praca"
  case "Wtorek" => "Praca"
  case "Sroda" => "Praca"
  case "Czwartek" => "Praca"
  case "Piatek" => "Praca"
  case "Sobota" => "Weekend"
  case "Niedziela" => "Weekend"
  case x => "Nie ma takiego dnia"
}

zad1("Niedziela")