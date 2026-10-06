// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt
import kotlin.system.exitProcess

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    val (a, b, c) = triangle
    return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)
}

fun triangleArea(triangle: Triangle): Double {
    val (a,b,c) = triangle
    val s = (a+b+c) / 2.0
    return sqrt(s*(s-a)*(s-b)*(s-c))
    
}