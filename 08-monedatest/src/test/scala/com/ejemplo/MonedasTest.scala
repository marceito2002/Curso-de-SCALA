package com.ejemplo

import org.scalatest.FunSuite
import org.scalatest.FunSpec

class MonedasTest extends FunSuite {

  test("El cambio de 12 Euros a Yenes tiene que ser de  1455.7950706555202") {

    var ej = Monedas.funcionOrdenMayor2(Monedas.cambioEuroDolar, Monedas.cambioDolarYen, _: Double)
    //println("Tercer cambio a Yen --> " + ej(12))    
    assert(ej(12) == 1455.7950706555202)

  }

}

class SetSpec extends FunSpec {

  describe("A Set") {
    describe("when empty") {
      it("should have size 0") {
        assert(Set.empty.size == 0)
      }

      it("should produce NoSuchElementException when head is invoked") {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }
}

import org.scalatest.WordSpec

class SetSpec2 extends WordSpec {

  "A Set" when {
    "empty" should {
      "have size 0" in {
        assert(Set.empty.size == 0)
      }

      "produce NoSuchElementException when head is invoked" in {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }
}