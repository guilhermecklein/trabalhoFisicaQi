fun main() {

    val minhaFisica = Fisica()

    val peso = minhaFisica.calcPeso(5f, 5f)
    println("\nO resultado do peso é $peso")

    val centripeda = minhaFisica.calcCentripeda(11f, 11f, 5f)
    println("\nO resultado da centripeda é $centripeda")

    val impulso = minhaFisica.calcImpulso(1f, 5f)
    println("\nO resultado do impulso é $impulso")

    val elastica = minhaFisica.calcElastica(1f, 5f)
    println("\nO resultado da elastica é $elastica")

    val velocidadeMedia = minhaFisica.calcVelocidadeM(1f, 2f, 4f, 5f)
    println("\nO resultado da velocidade média é $velocidadeMedia")

    val MRU = minhaFisica.calcMru(5f, 5f, 5f)
    println("\nO resultado da MRU é $MRU")

    val MRUV = minhaFisica.calcMruv(3f, 5f, 6f, 5f)
    println("\nO resultado da MRUV é $MRUV")

}