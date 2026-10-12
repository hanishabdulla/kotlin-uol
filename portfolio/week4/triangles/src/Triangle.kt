// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt


class Triangle(val sideA: Double, val  sideB: Double, val sideC: Double){
    init {
        val isValidTriangle = sideA > 0 && sideB > 0 && sideC > 0 && (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)
        if (isValidTriangle == false){  
        throw IllegalArgumentException("Invalid triangle sides") }
    }
    
    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
    
    val perimeter get(): Double = sideA + sideB + sideC   
    val semiPerimeter get (): Double = perimeter/2.0f
    val area get(): Double = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC)) 
    
    
}