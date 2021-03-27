val produkty = Map("Ziemniaki" -> 10, "Kapusta" -> 20, "Seler" -> 5)

val produkty_po_obnizce = produkty.map { case (k, v) => k -> v * 0.9 }
