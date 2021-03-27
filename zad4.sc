val dni_tygodnia = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

/* a) */
dni_tygodnia.foldLeft("")((a, b) => if (a == "") {b} else {a + "," + b})
/* b) */
dni_tygodnia.foldRight("")((a, b) => if (b == "") {a} else {a + "," + b})
/* c) */
dni_tygodnia.filter(_.startsWith("P")).foldLeft("")((a, b) => if (a == "") {b} else {a + "," + b})

