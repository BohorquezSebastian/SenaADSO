import kotlin.math.sqrt
import kotlin.math.pow
import kotlin.random.Random

class Ejercicios2 {
    var x: Double = 0.0;
    var dg: Double = 0.0;
    var total: Double = 0.0;

    init {
        println("Ingrese el monto a invertir ");
        val input = readLine() ?: "0";
        x = input.toDouble();
        dg = x * 0.02;
        total = x + dg;
        println("El porcentaje que usted ganara es del 2% lo cual es un total de $dg y en total con el dinero invertido daria $total");
    }
}

class Ejercicios4 {
    var x: Double = 0.0;
    var dg: Double = 0.0;
    var total: Double = 0.0;

    init {
        println("Ingrese el total de la compra para saber el descuento");
        val input = readLine() ?: "0";
        x = input.toDouble();
        dg = x * 0.15;
        total = x - dg;
        println("El porcentaje del descuento es del 15% lo cual es un total de $dg y en total con el dinero invertido daria $total");
    }

}

class Ejercicios6 {
    var te: Int = 0;
    var tm: Int = 0;
    var th: Int = 0;
    var th2: Int = 0;
    var tm2: Int = 0;

    init {
        println("Ingrese el total de estudiantes ");
        val input = readLine() ?: "0";
        println("Ingrese el total de mujeres ");
        val input2 = readLine() ?: "0";
        println("Ingrese el total de Hombres ");
        val input3 = readLine() ?: "0";

        te = input.toInt();
        tm = input2.toInt();
        th = input3.toInt();

        tm2 = ((tm / te) * 100);
        th2 = ((th / te) * 100);

        println("El porcentaje de hombres es de $th % y de mujeres es de $tm %")


    }

}

class Ejercicios8 {

    var a: Double = 0.0;
    var b: Double = 0.0;
    var c: Double = 0.0;
    var p: Double = 0.0;
    var pf: Double = 0.0;
    var pa: Double = 0.0;
    var pc: Double = 0.0;
    var pb: Double = 0.0;

    init {
        println("Ingrese el lado a");
        val inputa = readLine() ?: "0";

        println("Ingrese el lado b");
        val inputb = readLine() ?: "0";

        println("Ingrese el lado c");
        val inputc = readLine() ?: "0";

        a = inputa.toDouble();
        b = inputb.toDouble();
        c = inputc.toDouble();

        p = ((a + b + c) / 2);
        pa = (p * a);
        pb = (p * b);
        pc = (p * c);

        pf = sqrt(p * (pa * pb * pc));
        println("El area es de $pf");

    }
}

class Ejercicios10 {
    var a: Double = 0.0;
    var b: Double = 0.0;
    var c: Double = 0.0;
    var af: Double = 0.0;
    var bf: Double = 0.0;
    var bf2: Double = 0.0;
    var cdolar: Double = 0.0;
    var citalia: Double = 0.0;

    init {
        println("Ingrese la cantidad de chelines austriacos para saber las pesetas ");
        val input = readLine() ?: "0";
        a = input.toDouble();
        af = (a * 9.56871);

        println("$af pesetas ");

        println("Ingrese la cantidad de dragmas griegos para saber la cantidad de francos franceses ");
        val input2 = readLine() ?: "0";
        b = input2.toDouble();
        bf = (b * 886.07);
        bf2 = (bf / 20.110);

        println("$bf2 francos franceses ");

        println("Ingrese la cantidad de pesetas para saber su equivalente en dolares y liras italianas ");
        val input3 = readLine() ?: "0";
        c = input3.toDouble();
        cdolar = (c / 122.499);
        citalia = (c / 92.89);
        println("$cdolar en dolares y $citalia en liras italianas ");

    }
}

class Ejercicios12 {
    var em: Double = 0.0;
    var em2: Double = 0.0;
    var ptmf: Double = 0.0;
    var contador: Int = 0;
    var ptm: Double = 0.0;
    var ptmf2: Double = 0.0;
    var NotaFinalM: Double = 0.0;


    var ef: Double = 0.0;
    var ef2: Double = 0.0;
    var ptf: Double = 0.0;
    var contador2: Int = 0;
    var ptmf22: Double = 0.0;
    var ptmf222: Double = 0.0;
    var NotaFinalF: Double = 0.0;


    var eq: Double = 0.0;
    var eq2: Double = 0.0;
    var ptq: Double = 0.0;
    var contador3: Int = 0;
    var ptmf33: Double = 0.0;
    var ptmf333: Double = 0.0;
    var NotaFinalQ: Double = 0.0;

    init {
        println("Ingrese la nota del examen de matematicas ");
        val input = readLine() ?: "0";
        em = input.toDouble();
        em2 = em * 0.90;

        while (contador < 3) {
            println("Ingrese la nota de la materia ${contador + 1}");
            val input2 = readLine() ?: "0";
            ptm += input2.toDouble();
            contador++
        }
        ptmf = ptm / 3;
        ptmf2 = ptmf * 0.10;
        NotaFinalM = ptmf2 + em2;



        println("el total es de $NotaFinalM el promedio de su examen final es de $em2 y el de las notas es de $ptmf2  ");
        //notas fisica

        println("Ingrese la nota del examen de fisica ");
        val input2 = readLine() ?: "0";
        ef = input2.toDouble();
        ef2 = ef * 0.8;

        while (contador2 < 2) {
            println("Ingrese la nota de la materia ${contador2 + 1}");
            val inputf = readLine() ?: "0";
            ptf += inputf.toDouble();
            contador2++
        }
        ptmf33 = ptf / 2;
        ptmf333 = ptmf33 * 0.20;
        NotaFinalF = ptmf333 + ef2;



        println("el total es de $NotaFinalF el promedio de su examen final es de $ef2 y el de las notas es de $ptmf333  ");

//Notas quimica
        println("Ingrese la nota del examen de quimica ");
        val input3 = readLine() ?: "0";
        eq = input3.toDouble();
        eq2 = eq * 0.85;

        while (contador3 < 3) {
            println("Ingrese la nota de la materia ${contador3 + 1}");
            val inputq = readLine() ?: "0";
            ptq += inputq.toDouble();
            contador3++
        }
        ptmf22 = ptq / 3;
        ptmf222 = ptmf22 * 0.15;
        NotaFinalQ = ptmf222 + eq2;



        println("el total es de $NotaFinalQ el promedio de su examen final es de $eq2 y el de las notas es de $ptmf222  ");


    }
}

class Ejercicios14 {
    var a: Double = 0.0;
    var b: Double = 0.0;
    var c: Double = 0.0;
    var d: Double = 0.0;
    var e: Double = 0.0;
    var f: Double = 0.0;

    var x: Double = 0.0;
    var y: Double = 0.0;


    init {
        println("Ingrese el valor de a ");
        val inputa = readLine() ?: "0";
        a = inputa.toDouble();

        println("Ingrese el valor de b ");
        val inputb = readLine() ?: "0";
        b = inputb.toDouble();

        println("Ingrese el valor de c");
        val inputc = readLine() ?: "0";
        c = inputc.toDouble();

        println("Ingrese el valor de d ");
        val inputd = readLine() ?: "0";
        d = inputd.toDouble();

        println("Ingrese el valor de e ");
        val inpute = readLine() ?: "0";
        e = inpute.toDouble();

        println("Ingrese el valor de f ");
        val inputf = readLine() ?: "0";
        f = inputf.toDouble();

        x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        y = ((a * f) - (c * d)) / ((a * e) - (b * d));

        println("Y es igual a $y y X es igual a $x ");
    }


}

class Ejercicios16 {
    val laminaAncho: Double = 1.5;
    val laminaLargo: Double = 4.0;
    val b = 0.5;
    val areaA = laminaAncho * laminaLargo;
    val totalA = areaA / b;
    val desperdicio = areaA % b;

    init {
        println("El total de piezas es de $totalA y el deserdicio fue de $desperdicio")
    }
}

class Ejercicios18 {
    val galon: Double = 3.785;
    var x: Double = 0.0;
    var litros: Double = 0.0;
    var total: Double = 0.0;

    init {
        println("Ingrese el total de galones  a tanquear")
        val input = readLine() ?: "0";
        x = input.toDouble();
        litros = x * galon;
        total = 378.5 * x;
        println("El precio de los litros es $total y los litros tanqueados fueron $litros litros ")

    }

}

class Ejercicios20 {
    var y: Double = 0.0;
    var x: Double = 0.0;

    init {
        println("Ingrese el interes en total de los 4 anos");
        val input = readLine() ?: "0";
        y = input.toDouble();

        println("Ingrese el prestamo que se tomo");
        val inputq = readLine() ?: "0";
        x = inputq.toDouble();

        val r: Double = ((y * 100) / (x * 4));

        println("La tasa de interes anual que se cobro fue $r %")
    }
}

class Ejercicios22 {
    var contado: Double = 0.0;
    var cuotas: Double = 0.0;
    var interes: Double = 0.0;
    var excesor: Double = 0.0;

    init {
        println("Ingrese el precio de contado")
        val input = readLine() ?: "0";
        contado = input.toDouble();

        println("Ingrese el precio de cada cuota")
        val inputa = readLine() ?: "0";
        cuotas = inputa.toDouble();

        interes = (((cuotas * 12) - contado) / contado) * 100;
        excesor = ((cuotas * 12) - contado);
        println("El interes fue de $interes %")
        println("El exceso fue de $excesor ")
        println("El total a pagar fue fue de ${cuotas * 12} ")


    }
}

class Ejercicios24 {
    var dinero: Double = 0.0;
    var interes: Double = 0.0;

    init {
        do {
            println("Ingrese el dinero a invertir ")
            val input = readLine() ?: "0";
            dinero = input.toDouble();
            interes = dinero * 0.10;
            println("Los intereses  son del 10% dando  $interes ")
        } while (interes < 7000)
        val total = dinero + interes;
        println("el dinero final es de $total")
    }
}

class Ejercicios26 {
    var a: Int = 0;
    var b: Int = 0;
    var c: Int = 0;
    var d: Int = 0;

    init {
        println("Ingrese a:")
        a = readLine()?.toIntOrNull() ?: 0;

        println("Ingrese b:")
        b = readLine()?.toIntOrNull() ?: 0;

        println("Ingrese c:")
        c = readLine()?.toIntOrNull() ?: 0;

        println("Ingrese d:")
        d = readLine()?.toIntOrNull() ?: 0;

        if (d > 0) {
            val p1 = a - b
            val p3 = p1.toDouble().pow(3).toInt()
            val p4 = p3 / d;
            println("(a-b) elevado a la 3 es igual a $p3 divido en d daria como total $p4")
        } else {
            val p1 = a - c
            val p2 = p1.toDouble().pow(2).toInt()
            println("(a-c) elevado a la 2 es igual a $p2")
        }
    }
}

class Ejercicios28 {
    init {
        println("Ingrese el total de la compra ")
        val compra = readLine()?.toDoubleOrNull() ?: 0.0;
        if (compra > 500000.0) {
            val inversion = compra * 0.55;
            val cBanco = compra * 0.3;
            val cFabrica = compra * 0.15;
            val cFabricaInteres = cFabrica * 0.2;
            val cFabricaTotal = cFabrica + cFabricaInteres;
            println(" la empresa tendrá la capacidad  de invertir de su propio dinero un 55% lo cual es $inversion ")
            println("el banco presta  un 30% siendo $cBanco")
            println("el  resto lo pagará solicitando un crédito al fabricante. $cFabricaTotal")
            println("el interes que recibe el bango es de 20 % lo que equivale a  $cFabricaInteres")
        } else {
            val inversion = compra * 0.70;
            val cFabrica = compra * 0.30;
            val cFabricaInteres = cFabrica * 0.2;
            val cFabricaTotal = cFabrica + cFabricaInteres;
            println(" la empresa tendrá la capacidad  de invertir de su propio dinero un 70% lo cual es $inversion ")
            println("el  resto lo pagará solicitando un crédito al fabricante. $cFabricaTotal")
            println("el interes que recibe el bango es de 20 % lo que equivale a  $cFabricaInteres")
        }
    }
}

class Ejercicios30 {
    var a: Int = 0;
    var b: Int = 0;
    var c: Int = 0;
    var d: Int = 0;

    init {
        println("Ingrese a:")
        a = readLine()?.toIntOrNull() ?: 0;
        println("Ingrese b:")
        b = readLine()?.toIntOrNull() ?: 0;
        println("Ingrese c:")
        c = readLine()?.toIntOrNull() ?: 0;
        println("Ingrese d:")
        d = readLine()?.toIntOrNull() ?: 0;
        if (c > 8 && b > 8) {
            c = 0
            d = 0
            b = 0
            a = a + 1
            println("$a $b $c $d ")
        } else if (c > 5 && b < 9) {
            c = 0
            d = 0
            b = b + 1
            println("$a $b $c $d ")
        } else {
            c = 0
            d = 0
            println("$a $b $c $d ")
        }

    }
}

class Ejercicios32 {
    var p: Int = 0;
    var q: Int = 0;

    init {
        println("Ingrese p:")
        p = readLine()?.toIntOrNull() ?: 0;

        println("Ingrese q:")
        q = readLine()?.toIntOrNull() ?: 0;
        val p1 = p.toDouble().pow(3).toInt();
        val p2 = q.toDouble().pow(4).toInt()
        val p3 = p.toDouble().pow(2).toInt()
        val p4 = 2 * p3
        val total = p1 + p2 - p4;

        if (total > 680) {
            println("$p $q")

        } else {
            println("no es mayor que 680")
        }
    }

}

class Ejercicios34 {

}

class Ejercicios36 {
    var cantidadbilletes: Int = 0;
    var cincuentamil: Int = 0;
    var veintemil: Int = 0;
    var diezmil: Int = 0;
    var cincomil: Int = 0;
    var dosmil: Int = 0;
    var mil: Int = 0;
    var quinientos: Int = 0;
    var cien: Int = 0;
    var cincuenta: Int = 0;
    var veinte: Int = 0;
    var diez: Int = 0;

    init {
        println("Ingrese cantidad de dinero:")
        cantidadbilletes = readLine()?.toIntOrNull() ?: 0;

        while (cantidadbilletes >= 50000) {
            cantidadbilletes -= 50000
            cincuentamil++
        }
        while (cantidadbilletes >= 20000) {
            cantidadbilletes -= 20000
            veintemil++
        }
        while (cantidadbilletes >= 10000) {
            cantidadbilletes -= 10000
            diezmil++
        }
        while (cantidadbilletes >= 5000) {
            cantidadbilletes -= 5000
            cincomil++
        }
        while (cantidadbilletes >= 2000) {
            cantidadbilletes -= 2000
            dosmil++
        }
        while (cantidadbilletes >= 1000) {
            cantidadbilletes -= 1000
            mil++
        }
        while (cantidadbilletes >= 500) {
            cantidadbilletes -= 500
            quinientos++
        }
        while (cantidadbilletes >= 100) {
            cantidadbilletes -= 100
            cien++
        }
        while (cantidadbilletes >= 50) {
            cantidadbilletes -= 50
            cincuenta++
        }
        while (cantidadbilletes >= 20) {
            cantidadbilletes -= 20
            veinte++
        }
        while (cantidadbilletes >= 10) {
            cantidadbilletes -= 10
            diez++
        }

        println("Desglose de billetes y monedas:")
        println("50000: $cincuentamil")
        println("20000: $veintemil")
        println("10000: $diezmil")
        println("5000: $cincomil")
        println("2000: $dosmil")
        println("1000: $mil")
        println("500: $quinientos")
        println("100: $cien")
        println("50: $cincuenta")
        println("20: $veinte")
        println("10: $diez")
    }
}

class Ejercicios38 {
    var dia: Int = 0;
    var mes: Int = 0;
    var ano: Int = 0;

    init {
        println("Ingrese dia:")
        dia = readLine()?.toIntOrNull() ?: 0;

        println("Ingrese mes:")
        mes = readLine()?.toIntOrNull() ?: 0;

        println("Ingrese ano:")
        ano = readLine()?.toIntOrNull() ?: 0;

        val signo = when {
            mes == 12 && dia >= 22 || mes == 1 && dia <= 19 -> "Capricornio"
            mes == 1 && dia >= 20 || mes == 2 && dia <= 18 -> "Acuario"
            mes == 2 && dia >= 19 || mes == 3 && dia <= 20 -> "Piscis"
            mes == 3 && dia >= 21 || mes == 4 && dia <= 19 -> "Aries"
            mes == 4 && dia >= 20 || mes == 5 && dia <= 20 -> "Tauro"
            mes == 5 && dia >= 21 || mes == 6 && dia <= 20 -> "Géminis"
            mes == 6 && dia >= 21 || mes == 7 && dia <= 22 -> "Cáncer"
            mes == 7 && dia >= 23 || mes == 8 && dia <= 22 -> "Leo"
            mes == 8 && dia >= 23 || mes == 9 && dia <= 22 -> "Virgo"
            mes == 9 && dia >= 23 || mes == 10 && dia <= 22 -> "Libra"
            mes == 10 && dia >= 23 || mes == 11 && dia <= 21 -> "Escorpio"
            mes == 11 && dia >= 22 || mes == 12 && dia <= 21 -> "Sagitario"
            else -> "Fecha no válida"
        }
        val anop: Int = 2024;
        val edad: Int = anop - ano;
        println("El signo zodiacal es: $signo y su edad es de $edad anos")
    }
}

class Ejercicios40 {
    var lecturaAnterior: Int = 0
    var lecturaActual: Int = 0
    var consumo: Int = 0
    var costo: Double = 0.0

    init {
        println("Ingrese la lectura anterior:")
        lecturaAnterior = readLine()?.toIntOrNull() ?: 0

        println("Ingrese la lectura actual:")
        lecturaActual = readLine()?.toIntOrNull() ?: 0


        consumo = lecturaActual - lecturaAnterior


        costo = when {
            consumo <= 100 -> consumo * 2.622
            consumo <= 300 -> 262.2 + (consumo - 100) * 79.78
            consumo <= 500 -> 262.2 + 200 * 79.78 + (consumo - 300) * 89.52
            else -> 262.2 + 200 * 79.78 + 200 * 89.52 + (consumo - 500) * 97.95
        }

        println("El consumo fue de $consumo kWh y el costo es de $costo Bs.")
    }
}

class Ejercicios42 {
    init {
        println("Ingrese la edad del paciente en años completos:")
        val anos = readLine()?.toIntOrNull() ?: 0

        println("Ingrese meses adicionales:")
        val meses = readLine()?.toIntOrNull() ?: 0

        println("Ingrese el género del paciente (1 para Mujer, 2 para Hombre):")
        val genero = readLine()?.toIntOrNull() ?: 1

        println("Ingrese el nivel de hemoglobina (g%):")
        val hemoglobina = readLine()?.toDoubleOrNull() ?: 0.0

        val tieneAnemia = when {
            anos == 0 && meses <= 1 -> !(hemoglobina in 13.0..26.0)
            anos < 1 -> !(hemoglobina in 10.0..18.0)
            anos in 1..5 -> !(hemoglobina in 11.5..15.0)
            anos in 6..10 -> !(hemoglobina in 12.6..15.5)
            anos in 11..15 -> !(hemoglobina in 13.0..15.5)
            anos > 15 && genero == 1 -> !(hemoglobina in 12.0..16.0)
            anos > 15 && genero == 2 -> !(hemoglobina in 14.0..18.0)
            else -> false
        }

        if (tieneAnemia) {
            println("El paciente tiene anemia.")
        } else {
            println("El paciente no tiene anemia.")
        }
    }
}

class Ejercicios44 {
    var montoHipoteca: Int = 0
    var inversionTotal: Int = 0
    var inversionPersonal: Int = 0
    var inversionSocio: Int = 0

    init {
        println("Ingrese el monto de la hipoteca:")
        montoHipoteca = readLine()?.toIntOrNull() ?: 0

        println("Ingrese el monto total de inversión requerido:")
        inversionTotal = readLine()?.toIntOrNull() ?: 0

        if (montoHipoteca < 1000000) {
            inversionPersonal = inversionTotal / 2
            inversionSocio = inversionTotal / 2
        } else {
            inversionPersonal = montoHipoteca
            val resto = inversionTotal - montoHipoteca
            inversionSocio = resto / 2
        }

        println("La persona invertira: $inversionPersonal")
        println("El socio invertira: $inversionSocio")
    }
}

class Ejercicios46 {
    init {
        println("Ingrese el valor de N (debe ser mayor que K):")
        val N = readLine()?.toIntOrNull() ?: 0

        println("Ingrese el valor de K (menor que N):")
        val K = readLine()?.toIntOrNull() ?: 0

        if (K < N && N > 0 && K > 0) {
            var i = N
            while (i >= K) {
                println(i)
                i--
            }
        } else {
            println("Verifiquemos  que N y K sean positivos y que K < N.")
        }
    }
}

class Ejercicios48 {
    init {
        val rangos = listOf(
            Triple(28.0, 54.0, 1.0),
            Triple(450.0, 950.0, 50.0),
            Triple(-50.0, 250.0, 10.0)
        )

        for ((start, end, interval) in rangos) {
            println("Fahrenheit | Celsius    | Kelvin    | Rankine")
            println("---------------------------------------------------")
            var F = start
            while (F <= end) {
                // Convertir Fahrenheit a Celsius
                val C = 5 * (F - 32) / 9
                // Convertir Fahrenheit a Kelvin
                val K = C + 273.15
                // Convertir Fahrenheit a Rankine
                val R = F + 459.67

                println(
                    "${String.format("%10.1f", F)} | ${String.format("%10.2f", C)} | ${
                        String.format(
                            "%10.2f",
                            K
                        )
                    } | ${String.format("%10.2f", R)}"
                )
                F += interval
            }
            println()
        }
    }
}

class Ejercicios50 {
    init {
        var suma = 0
        val inicio = if (97 % 2 == 0) 97 else 98
        for (i in inicio..1003 step 2) {
            suma += i
        }
        println("La suma de todos los números pares entre 97 y 1003 es: $suma")
    }
}

class Ejercicios52 {
    init {
        val pesosNiños = mutableListOf<Double>()
        val pesosJóvenes = mutableListOf<Double>()
        val pesosAdultos = mutableListOf<Double>()
        val pesosViejos = mutableListOf<Double>()

        println("Introduzca la edad y el peso de 100 personas:")
        var contador = 1

        while (contador <= 100) {
            println("Persona $contador:")
            println("Edad:")
            val edad = readLine()?.toIntOrNull() ?: 0
            println("Peso (kg):")
            val peso = readLine()?.toDoubleOrNull() ?: 0.0

            // Clasificación usando if-else
            if (edad <= 12) {
                pesosNiños.add(peso)
            } else if (edad >= 13 && edad <= 29) {
                pesosJóvenes.add(peso)
            } else if (edad >= 30 && edad <= 59) {
                pesosAdultos.add(peso)
            } else if (edad >= 60) {
                pesosViejos.add(peso)
            }

            contador++
        }


        val promedioNiños = if (pesosNiños.isNotEmpty()) pesosNiños.average() else 0.0
        val promedioJóvenes = if (pesosJóvenes.isNotEmpty()) pesosJóvenes.average() else 0.0
        val promedioAdultos = if (pesosAdultos.isNotEmpty()) pesosAdultos.average() else 0.0
        val promedioViejos = if (pesosViejos.isNotEmpty()) pesosViejos.average() else 0.0

        println("Promedio de peso por categoría:")
        println("Niños (0-12 años): ${"%.2f".format(promedioNiños)} kg")
        println("Jóvenes (13-29 años): ${"%.2f".format(promedioJóvenes)} kg")
        println("Adultos (30-59 años): ${"%.2f".format(promedioAdultos)} kg")
        println("Viejos (60 años en adelante): ${"%.2f".format(promedioViejos)} kg")
    }

}

class Ejercicios54 {
    val numCuestionarios = 64
    val numPreguntas = 23

    var sumaDeTodosLosPromedios = 0.0
    var maxPromedio = Double.MIN_VALUE
    var minPromedio = Double.MAX_VALUE
    var indiceMaxPromedio = 0
    var indiceMinPromedio = 0
    var totalBajoTres = 0
    var totalSobreCuatro = 0
    var totalEntreCuatroYMedioYCinco = 0

    init {


        for (i in 1..numCuestionarios) {
            var totalPuntos = 0
            for (j in 1..numPreguntas) {
                val puntaje = Random.nextInt(1, 6) // Generar puntaje aleatorio entre 1 y 5
                totalPuntos += puntaje
            }

            val promedio = totalPuntos.toDouble() / numPreguntas
            sumaDeTodosLosPromedios += promedio

            if (promedio > maxPromedio) {
                maxPromedio = promedio
                indiceMaxPromedio = i
            }
            if (promedio < minPromedio) {
                minPromedio = promedio
                indiceMinPromedio = i
            }

            if (promedio < 3) totalBajoTres++
            if (promedio > 4) totalSobreCuatro++
            if (promedio >= 4.5 && promedio <= 5) totalEntreCuatroYMedioYCinco++
        }

        val promedioGeneral = sumaDeTodosLosPromedios / numCuestionarios
        val porcentajeInferiorTres =
            if (totalSobreCuatro > 0) totalBajoTres.toDouble() / totalSobreCuatro * 100 else 0.0
        val porcentajeEntreCuatroMedioCinco = totalEntreCuatroYMedioYCinco.toDouble() / numCuestionarios * 100

        println("Promedio general de todos los cuestionarios: $promedioGeneral")
        println("Promedio más alto: $maxPromedio (Cuestionario #$indiceMaxPromedio)")
        println("Promedio más bajo: $minPromedio (Cuestionario #$indiceMinPromedio)")
        println("Porcentaje de cuestionarios con promedio < 3 frente a los > 4: $porcentajeInferiorTres%")
        println("Porcentaje de cuestionarios con promedio entre 4.5 y 5: $porcentajeEntreCuatroMedioCinco%")
    }
}
class Ejercicios56() {
    val dividendo: Int = 0
    val divisor: Int = 0
    var cociente: Int = 0
    var resto: Int = 0

    init {
        if (divisor == 0) {
            throw IllegalArgumentException("División por cero no permitida")
        }

        var resultadoTemporal = dividendo
        cociente = 0

        while (resultadoTemporal >= divisor) {
            resultadoTemporal -= divisor
            cociente++
        }
        resto = resultadoTemporal
    }
}
class Ejercicios58{
    var capitalAcumulado: Double

    init {
        println("Ingrese el capital inicial: ")
        val capitalInicial = readLine()!!.toDouble()

        println("Ingrese la tasa de interés anual (como decimal, por ejemplo 0.06 para 6%): ")
        val tasaInteres = readLine()!!.toDouble()

        println("Ingrese la duración del depósito en semanas: ")
        val semanas = readLine()!!.toInt()

        val dias = semanas * 7 // Convertir semanas a días
        val tasaDiaria = tasaInteres / 365 // Convertir la tasa anual a tasa diaria

        capitalAcumulado = capitalInicial
        for (i in 1..dias) {
            capitalAcumulado += capitalAcumulado * tasaDiaria
        }

        println("El capital total acumulado después de $semanas semanas es: \$${"%.2f".format(capitalAcumulado)}")
    }
}

class Ejercicios60 {
    init {
        println("Ingrese el monto de la factura:")
        val monto = readLine()!!.toDouble()

        println("Ingrese los días desde la realización de la compra:")
        val diasDesdeCompra = readLine()!!.toInt()

        val montoFinal = when {
            diasDesdeCompra >= 60 -> monto + monto * 0.08 // Interés de mora del 8%
            diasDesdeCompra in 31..59 -> monto + monto * 0.06 // Interés de mora del 6%
            diasDesdeCompra <= 15 -> monto - monto * 0.02 // Descuento del 2%
            else -> monto // Sin cambios si no cumple ninguna condición anterior
        }

        println("Monto original de la factura: \$$monto")
        println("Días desde la compra: $diasDesdeCompra")
        println("Monto final después de ajustes: \$$montoFinal")
    }
}

class Ejercicios62{
    init {
        val empresas = listOf(
            Triple(1, 1, 50),  // Agricultura, Norte, 50 trabajadores
            Triple(2, 3, 120), // Industrial, Este, 120 trabajadores
            Triple(3, 2, 200), // Minera, Sur, 200 trabajadores
            Triple(2, 4, 150), // Industrial, Oeste, 150 trabajadores
            Triple(1, 2, 30),  // Agricultura, Sur, 30 trabajadores
            Triple(2, 4, 90)   // Industrial, Oeste, 90 trabajadores
        )

        val totalEmpresas = empresas.size
        val empresasAgricolas = empresas.count { it.first == 1 }
        val porcentajeAgricolas = empresasAgricolas.toDouble() / totalEmpresas * 100


        val mineras = empresas.filter { it.first == 3 }
        val minerasSur = mineras.count { it.second == 2 }
        val porcentajeMinerasSur = if (mineras.isNotEmpty()) minerasSur.toDouble() / mineras.size * 100 else 0.0


        val trabajadoresPorActividad = empresas.groupBy { it.first }
            .mapValues { entry -> entry.value.sumOf { it.third }.toDouble() / entry.value.size }


        val industrialesPorLocalizacion = empresas.filter { it.first == 2 }
            .groupingBy { it.second }
            .eachCount()
        val localizacionMasIndustriales = industrialesPorLocalizacion.maxByOrNull { it.value }?.key


        println("Porcentaje de empresas agrícolas del país: $porcentajeAgricolas%")
        println("Porcentaje de empresas mineras del sur: $porcentajeMinerasSur%")
        println("Promedio de trabajadores por actividad: $trabajadoresPorActividad")
        println("Localización con mayor número de empresas industriales: $localizacionMasIndustriales")
    }
}

class Ejercicios64{
    init {
        val objetivo = 1.99
        var suma = 0.0
        var termino = 1.0
        var numTerminos = 0

        while (suma < objetivo) {
            suma += termino
            numTerminos++
            termino /= 2

            if (suma + termino > objetivo) break
        }

        println("Número de términos necesarios: $numTerminos")
        println("Valor de la suma: $suma")
    }
}

class Ejercicios66{ init {
    val pesos = listOf(2.5, 4.0, 7.0, 10.0, 13.5, 17.0) // Ejemplo de pesos en Kg.
    var montoTotal = 0

    for (peso in pesos) {
        val tarifa = when {
            peso <= 3 -> 0
            peso <= 6 -> 600
            peso <= 9 -> 1200
            peso <= 12 -> 1500
            peso <= 15 -> 2000
            else -> 2500
        }
        println("Peso: $peso Kg, Tarifa: $tarifa")
        montoTotal += tarifa
    }

    println("Monto total a pagar por todos los equipajes: $montoTotal")
}
}
class Ejercicios68 {
    init {
        val perfectosEncontrados = mutableListOf<Int>()
        var numero = 2  // Comenzamos desde el número 2

        while (perfectosEncontrados.size < 3) {
            val sumaDivisores = sumarDivisores(numero)
            if (sumaDivisores == numero) {
                perfectosEncontrados.add(numero)
                println("$numero es un número perfecto.")
            }
            numero++
        }
    }

    private fun sumarDivisores(numero: Int): Int {
        var suma = 0
        for (i in 1 until numero) {
            if (numero % i == 0) {
                suma += i
            }
        }
        return suma
    }
}
class Ejercicios70 {
    val temperaturas = mutableListOf<Pair<Double, Double>>()
    var totalDias = 0
    var maximaGlobal = Double.MIN_VALUE
    var minimaGlobal = Double.MAX_VALUE
    var errores = 0
    init {

    // Simulación de la entrada de datos
    temperaturas.addAll(listOf(
        Pair(15.0, 14.0),
        Pair(25.0, 16.0),
        Pair(28.0, 18.0),
        Pair(0.0, 0.0),  // Fin de datos
        Pair(32.0, 20.0), // Fuera de rango
        Pair(27.0, 13.0)  // Fuera de rango mínimo
    ))



        for ((maxima, minima) in temperaturas) {
            if (maxima == 0.0 && minima == 0.0) break  // Condición de fin de datos
            if (maxima !in 14.0..30.0 || minima !in 14.0..30.0) {
                errores++
                continue
            }

            totalDias++
            if (maxima > maximaGlobal) maximaGlobal = maxima
            if (minima < minimaGlobal) minimaGlobal = minima
        }

        val porcentajeErrores = if (totalDias > 0) errores.toDouble() / totalDias * 100 else 0.0

        println("Número de días válidos: $totalDias")
        println("Máxima global: $maximaGlobal")
        println("Mínima global: $minimaGlobal")
        println("Número de errores: $errores")
        println("Porcentaje de errores: $porcentajeErrores%")
    }
}

class Ejercicios72 {
    private val G = 6.674 * 1e-11  // Constante gravitacional
    private val masaTierra = 5.972 * 1e24  // Masa de la Tierra en kilogramos
    private val radioTierra = 6.371 * 1e6  // Radio de la Tierra en metros

    private var fuerzaMax = 0.0
    private var fuerzaMin = Double.MAX_VALUE
    private var fuerzaSum = 0.0
    private var masaMax = 0.0
    private var masaSum = 0.0
    private var alturaMax = 0.0
    private var alturaMin = Double.MAX_VALUE

    init {
        val satelites = listOf(
            Triple(500.0, 2e5),  // Masa de 500 kg, altura de 200,000 metros
            Triple(1000.0, 3e5),  // Masa de 1000 kg, altura de 300,000 metros
            Triple(750.0, 4e5)  // Masa de 750 kg, altura de 400,000 metros
        )

        satelites.forEach { (masa, altura) ->
            val fuerza = G * masa * masaTierra / Math.pow(radioTierra + altura, 2.0)
            fuerzaSum += fuerza
            masaSum += masa
            fuerzaMax = maxOf(fuerzaMax, fuerza)
            fuerzaMin = minOf(fuerzaMin, fuerza)
            masaMax = maxOf(masaMax, masa)
            alturaMax = maxOf(alturaMax, altura)
            alturaMin = minOf(alturaMin, altura)
        }

        val fuerzaPromedio = fuerzaSum / satelites.size
        val masaPromedio = masaSum / satelites.size

        println("Mayor fuerza de atracción: $fuerzaMax N")
        println("Menor fuerza de atracción: $fuerzaMin N")
        println("Fuerza de atracción promedio: $fuerzaPromedio N")
        println("Mayor masa de satélite: $masaMax kg")
        println("Masa promedio de satélites: $masaPromedio kg")
        println("Menor altura de satélites: $alturaMin m")
        println("Mayor altura de satélites: $alturaMax m")
    }
}

class Ejercicios74{

        init {
            // Constantes
            val obreros = listOf(
                Obrero("Juan", listOf(20, 15, 20, 22, 25, 18), 120),
                Obrero("Pedro", listOf(25, 25, 20, 19, 21, 24), 130),
                Obrero("Ana", listOf(23, 19, 25, 22, 24, 25), 130)
            )

            var totalGeneral = 0
            var obrerosCumplidos = 0
            var maxProduccion = 0
            var obreroMax = ""
            var totalObreros = obreros.size

            obreros.forEach { obrero ->
                val totalSemanal = obrero.produccionDiaria.sum()
                totalGeneral += totalSemanal
                val porcentajeCumplimiento = (totalSemanal.toDouble() / obrero.limiteSemanal) * 100

                println("${obrero.nombre} - Total Semanal: $totalSemanal - Cumplimiento: ${"%.2f".format(porcentajeCumplimiento)}%")

                if (totalSemanal >= obrero.limiteSemanal) {
                    obrerosCumplidos++
                }

                if (totalSemanal > maxProduccion) {
                    maxProduccion = totalSemanal
                    obreroMax = obrero.nombre
                }
            }

            val porcentajeCumplidos = (obrerosCumplidos.toDouble() / totalObreros) * 100
            val promedioProduccion = totalGeneral.toDouble() / totalObreros

            println("Porcentaje de obreros que cumplieron o superaron la meta: ${"%.2f".format(porcentajeCumplidos)}%")
            println("Obrero con máxima producción: $obreroMax con $maxProduccion bloques")
            println("Promedio de producción semanal: ${"%.2f".format(promedioProduccion)}")
        }

        data class Obrero(val nombre: String, val produccionDiaria: List<Int>, val limiteSemanal: Int)
    }
class Ejercicios76{
    init {
        // Definición de la estructura de datos y simulación de la entrada de datos
        val grupos = listOf(
            listOf(
                listOf(80.0, 90.0, 85.0),
                listOf(70.0, 75.0, 65.0)
            ),
            listOf(
                listOf(88.0, 94.0, 90.0),
                listOf(82.0, 85.0, 84.0)
            ),
            listOf(
                listOf(78.0, 80.0, 79.0),
                listOf(92.0, 89.0, 95.0)
            )
        ).map { grupo ->
            grupo.map { alumno ->
                alumno.map { materia ->
                    materia.average()
                }.average()
            }.also { alumnos ->
                println("Promedio del Grupo: ${alumnos.average()}")
            }
        }

        val promedioGeneral = grupos.flatten().average()
        println("Promedio general de todos los grupos: $promedioGeneral")

        grupos.forEachIndexed { index, grupo ->
            grupo.forEachIndexed { alumnoIndex, promedio ->
                println("Promedio del Alumno ${alumnoIndex + 1} del Grupo ${index + 1}: $promedio")
            }
        }
    }
}
class Ejercicios78{
    init {

        val productos = mapOf(
            1 to 10.0,  // PVP para el producto 1
            2 to 15.0,  // PVP para el producto 2
            3 to 20.0   // PVP para el producto 3
        )

        // Datos de ejemplo para puntos de venta y sus ventas
        val puntosDeVenta = listOf(
            Triple(1001, listOf(
                Triple(1, 100),  // Producto 1, 100 unidades
                Triple(2, 150),  // Producto 2, 150 unidades
                Triple(3, 200)   // Producto 3, 200 unidades
            ), 10000.0),  // Monto esperado para el punto de venta
            Triple(1002, listOf(
                Triple(1, 120),
                Triple(2, 140),
                Triple(3, 160)
            ), 12000.0)
        )

        val sucursales = listOf(
            Triple(10, "Sucursal A", puntosDeVenta, 50000.0)  // Código, Descripción, Puntos de venta, Monto esperado
        )

        // Calcular y mostrar los datos requeridos
        sucursales.forEach { (codigoSucursal, descripcion, pv, montoEsperado) ->
            var totalSucursal = 0.0
            var maxComision = 0.0
            var puntoVentaMaxComision = 0

            pv.forEach { (codigoPV, ventas, esperadoPV) ->
                var totalPV = 0.0
                var unidadesTotales = 0
                var productoMenosVendido = ventas.minByOrNull { it.second }?.first ?: -1

                ventas.forEach { (producto, unidades) ->
                    val venta = unidades * productos[producto]!!
                    totalPV += venta
                    unidadesTotales += unidades
                }

                val comisiones = totalPV * 0.10
                if (comisiones > maxComision) {
                    maxComision = comisiones
                    puntoVentaMaxComision = codigoPV
                }

                totalSucursal += totalPV

                println("Punto de Venta: $codigoPV, Unidades Vendidas: $unidadesTotales, Monto Neto: ${totalPV - comisiones}, Comisiones: $comisiones, Producto Menos Vendido: $productoMenosVendido")
            }

            val porcentajeAlcanzado = (totalSucursal / montoEsperado) * 100
            println("Sucursal $codigoSucursal - $descripcion, Total Vendido: $totalSucursal, Porcentaje Alcanzado: $porcentajeAlcanzado%, Punto de Venta con más comisiones: $puntoVentaMaxComision ($maxComision)")
        }
    }
}
class Ejercicios80{
    init {
        // Simulación de los datos
        val personas = listOf(
            Persona("01", "0101", "010101", 30, "N", "D"),
            Persona("01", "0101", "010101", 26, "N", "D"),
            Persona("01", "0102", "010201", 34, "P", "D"),
            Persona("02", "0201", "020101", 28, "P", "E"),
            Persona("02", "0201", "020101", 22, "B", "D"),
            Persona("02", "0202", "020201", 27, "P", "D"),
            Persona("03", "0301", "030101", 29, "S", "E")
        )

        // Agrupar por municipio y filtrar según los criterios
        val resultadoMunicipio = personas.groupBy { it.municipioCodigo }
            .mapValues { (_, lista) ->
                lista.count { it.edad > 25 && it.nivelEducacion == "N" && it.situacionActual == "D" }
            }

        // Imprimir resultados por municipio
        resultadoMunicipio.forEach { (codigo, count) ->
            println("Municipio $codigo: $count personas desempleadas, sin educación y mayores de 25 años")
        }

        // Calcular e imprimir ciudades con más del 50% en la situación descrita
        val resultadoCiudad = personas.groupBy { it.ciudadCodigo }
            .filter { (_, lista) ->
                lista.count { it.edad > 25 && it.nivelEducacion == "N" && it.situacionActual == "D" }.toDouble() / lista.size > 0.5
            }.keys.forEach {
                println("Ciudad $it con más del 50% de las personas en la situación descrita")
            }

        // Calcular e imprimir el Estado con el mayor porcentaje de profesionales desempleados
        val resultadoEstado = personas.filter { it.nivelEducacion == "P" && it.situacionActual == "D" }
            .groupBy { it.estadoCodigo }
            .maxByOrNull { (_, lista) -> lista.size.toDouble() / personas.count { it.estadoCodigo == lista.first().estadoCodigo } }?.key

        println("Estado con mayor porcentaje de profesionales desempleados: $resultadoEstado")
    }

    data class Persona(
        val estadoCodigo: String,
        val ciudadCodigo: String,
        val municipioCodigo: String,
        val edad: Int,
        val nivelEducacion: String,
        val situacionActual: String
    )
}

class Ejercicios82{
    init {
        // Datos de estudiantes y sus notas
        val estudiantes = listOf(
            Estudiante("María", listOf(16, 14, 15, 13, 9)),
            Estudiante("Juan Carlos", listOf(10, 9, 7, 11, 14)),
            Estudiante("Josefina", listOf(13, 12, 15, 17, 13)),
            Estudiante("José Luis", listOf(7, 11, 10, 8, 17))
        )

        // Calcular promedios individuales y de clase
        val promedios = estudiantes.map { it.calcularPromedio() }
        val promedioClase = promedios.average()

        // Determinar estudiantes con promedio por debajo y por encima del promedio de la clase
        val porDebajo = promedios.count { it < promedioClase }
        val porEncima = promedios.count { it > promedioClase }

        // Mostrar resultados
        estudiantes.forEachIndexed { index, estudiante ->
            println("${index + 1}. ${estudiante.nombre} - Promedio: ${"%.2f".format(estudiante.calcularPromedio())}")
        }
        println("Promedio de la clase: ${"%.2f".format(promedioClase)}")
        println("Alumnos con promedio menor al promedio de la clase: $porDebajo")
        println("Alumnos con promedio mayor al promedio de la clase: $porEncima")
    }

    data class Estudiante(val nombre: String, val notas: List<Int>) {
        fun calcularPromedio(): Double = notas.average()
    }
}
class Ejercicios84{
    data class Proveedor(
        var nombre: String,
        var ciudad: String,
        var numeroArticulos: Int
    )

        private val proveedores = mutableListOf<Proveedor>()

        init {
            // Inicialización de algunos datos de prueba
            proveedores.addAll(listOf(
                Proveedor("Almacenes ABC", "Medellín", 150),
                Proveedor("Distribuciones XYZ", "Bogotá", 200),
                Proveedor("Proveedor SA", "Cali", 120)
            ))

            // Ordena alfabéticamente por el nombre del proveedor
            proveedores.sortBy { it.nombre }
        }

        fun buscarProveedor(nombre: String) {
            val proveedor = proveedores.find { it.nombre.equals(nombre, ignoreCase = true) }
            if (proveedor != null) {
                println("Proveedor: ${proveedor.nombre}, Ciudad: ${proveedor.ciudad}, Artículos: ${proveedor.numeroArticulos}")
            } else {
                println("Proveedor no encontrado.")
            }
        }

        fun actualizarCiudad(nombre: String, nuevaCiudad: String) {
            val proveedor = proveedores.find { it.nombre.equals(nombre, ignoreCase = true) }
            proveedor?.let {
                it.ciudad = nuevaCiudad
                println("Ciudad actualizada a $nuevaCiudad para el proveedor ${it.nombre}.")
            } ?: println("Proveedor no encontrado.")
        }

        fun actualizarNumeroArticulos(nombre: String, nuevoNumero: Int) {
            val proveedor = proveedores.find { it.nombre.equals(nombre, ignoreCase = true) }
            proveedor?.let {
                it.numeroArticulos = nuevoNumero
                println("Número de artículos actualizado a $nuevoNumero para el proveedor ${it.nombre}.")
            } ?: println("Proveedor no encontrado.")
        }
    }
/// fun main() {
//val gestion = GestionProveedores()
///gestion.buscarProveedor("Distribuciones XYZ")
///gestion.actualizarCiudad("Proveedor SA", "Bucaramanga")
/// gestion.actualizarNumeroArticulos("Almacenes ABC", 180)
///  }

class Ejercicios86{
    private val proveedores = mutableListOf(
        Proveedor("Almacenes ABC", "Medellín", 150),
        Proveedor("Distribuciones XYZ", "Bogotá", 200),
        Proveedor("Proveedor SA", "Cali", 120)
    )

    init {
        // Ordenar alfabéticamente los proveedores por nombre
        proveedores.sortBy { it.nombre }

        // Mostrar información de un proveedor específico
        buscarProveedor("Distribuciones XYZ")

        // Actualizar la ciudad de un proveedor
        actualizarCiudad("Proveedor SA", "Bucaramanga")

        // Actualizar el número de artículos de un proveedor
        actualizarNumeroArticulos("Almacenes ABC", 180)

        // Mostrar la lista actualizada de proveedores para verificar cambios
        proveedores.forEach { println(it) }
    }

    private fun buscarProveedor(nombre: String) {
        val proveedor = proveedores.find { it.nombre.equals(nombre, ignoreCase = true) }
        println("Buscando Proveedor: ${proveedor?.let { "${it.nombre}, Ciudad: ${it.ciudad}, Artículos: ${it.numeroArticulos}" } ?: "Proveedor no encontrado."}")
    }

    private fun actualizarCiudad(nombre: String, nuevaCiudad: String) {
        proveedores.find { it.nombre.equals(nombre, ignoreCase = true) }?.let {
            it.ciudad = nuevaCiudad
            println("Ciudad actualizada a $nuevaCiudad para el proveedor ${it.nombre}.")
        }
    }

    private fun actualizarNumeroArticulos(nombre: String, nuevoNumero: Int) {
        proveedores.find { it.nombre.equals(nombre, ignoreCase = true) }?.let {
            it.numeroArticulos = nuevoNumero
            println("Número de artículos actualizado a $nuevoNumero para el proveedor ${it.nombre}.")
        }
    }

    data class Proveedor(var nombre: String, var ciudad: String, var numeroArticulos: Int)
}


class Ejercicios88{
    val clientes = mutableListOf<Cliente>()

    init {
        // Cargar algunos datos iniciales
        cargarDatosIniciales()
        // Interfaz de usuario para la cancelación de pagarés
        registrarCancelacionPagare()
        // Mostrar el listado final de clientes
        mostrarListadoClientes()
    }

    private fun cargarDatosIniciales() {
        clientes.add(Cliente(215, 10, 50000.0))
        clientes.add(Cliente(102, 15, 30000.0))
        clientes.add(Cliente(708, 27, 25000.0))
    }

    private fun registrarCancelacionPagare() {
        println("Ingrese el código del cliente:")
        val codigo = readLine()?.toIntOrNull() ?: return
        println("Ingrese la cantidad de pagarés a cancelar:")
        val cantidad = readLine()?.toIntOrNull() ?: return

        val cliente = clientes.find { it.codigo == codigo }
        if (cliente == null) {
            println("Cliente no existe.")
        } else {
            cliente.cancelarPagares(cantidad)
        }
    }

    private fun mostrarListadoClientes() {
        clientes.sortByDescending { it.montoTotalPagado() }
        clientes.forEach {
            println("Código: ${it.codigo}, Pagarés Pendientes: ${it.pagaresPendientes}, Pagarés Cancelados: ${it.pagaresCancelados}, Monto Total Pagado: ${it.montoTotalPagado()}")
        }
    }

    data class Cliente(
        val codigo: Int,
        var pagaresPendientes: Int,
        val montoPorPagare: Double,
        var pagaresCancelados: Int = 0
    ) {
        fun cancelarPagares(cantidad: Int) {
            if (cantidad > pagaresPendientes) {
                println("No hay suficientes pagarés pendientes.")
                return
            }
            pagaresPendientes -= cantidad
            pagaresCancelados += cantidad
        }

        fun montoTotalPagado(): Double = pagaresCancelados * montoPorPagare
    }
}
