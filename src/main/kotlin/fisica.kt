class Fisica {

    fun calcPeso(massa: Float, gravidade: Float): Float {
        return massa * gravidade
    }

    fun calcCentripeda(massa_: Float, velocidade: Float, raio: Float): Float {
        return massa_ * (velocidade * velocidade / raio)
    }

    fun calcImpulso(forca: Float, deltaTempo: Float): Float {
        return forca * deltaTempo
    }

    fun calcElastica(constanteElastica: Float, variacaoSofrida: Float): Float {
        return constanteElastica * variacaoSofrida
    }

    fun calcVelocidadeM(posicaoFinal: Float, posicaoInicial: Float, tempoFinal: Float, tempoInicial: Float): Float {
        return (posicaoFinal - posicaoInicial) / (tempoFinal - tempoInicial)
    }

    fun calcMru(deslocamentoIniciall: Float, velocidadee: Float, tempo: Float): Float {
        return deslocamentoIniciall + velocidadee * tempo
    }

    fun calcMruv(deslocamentoInicialll: Float, velocidadeee: Float, tempoo: Float, aceleracao: Float): Float {
        return deslocamentoInicialll + velocidadeee * tempoo + (aceleracao * (tempoo * tempoo) / 2)
    }
}