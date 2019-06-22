package com.cpq.simulation

abstract class CircuitSimulation extends BasicCiruitSimulation {

  def halfAndder(a: Wire, b: Wire, s: Wire, c: Wire) = {
    val d, e = new Wire
    orGate(a, b, d)
    andGate(a, b, c)
    inverter(c, e)
    andGate(d,e,s)
  }
  def fuallAdder(a:Wire,b:Wire,cin:Wire,sum:Wire,cout:Wire) = {
    val s,c1,c2 = new Wire
    halfAndder(a,cin,s,c1)
    halfAndder(b,s,sum,c2)
    orGate(c1,c2,cout)
  }
}

