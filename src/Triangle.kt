import kotlin.math.pow
import kotlin.math.sqrt

class Triangle(val a: Point, val b: Point, val c: Point) {

    //метод нахождения стороны треугольника
    private fun length( point1 : Point,  point2 : Point) : Double {
        return sqrt((point1.x - point2.x).pow(2) + (point1.y - point2.y).pow(2))
    }

    //метод нахождения площади треугольника
    private fun Area() : Double {
        //нахождение половины периметра треугольника
        val perimeter = ((length(a,b) + length(b,c) + length(a,c)) / 2.0)
        //нахождение площади треугольника
        return sqrt(perimeter * ((perimeter - length(a,b)) *(perimeter - length(b,c)) * (perimeter - length(a,c))))
    }

    //метод нахождения радиуса описанной окружности
    fun Radius(): Double {
        val Alength = length(a,b)
        val Blength = length(b,c)
        val Clength = length(a,c)
        val area = Area()
        return ((Alength * Blength * Clength) / (area * 4))
    }

    //метод нахождения центра окружности
    fun circleCenter() : Point  {
        val x0 = -( ( (a.y - b.y) * ( (c.x).pow(2) + (c.y).pow(2) ) + (b.y-c.y) * ( (a.x).pow(2) + (a.y).pow(2) ) + ( (c.y-a.y) * ( (b.x).pow(2) + (b.y).pow(2) ) ) ) / ( 2 * ( (a.x-b.x) * (c.y-a.y) - (a.y-b.y) * (c.x-a.x) ) ) )
        val y0 = ( ( (a.x - b.x) * ( (c.x).pow(2) + (c.y).pow(2) ) + (b.x-c.x) * ( (a.x).pow(2) + (a.y).pow(2) ) + ( (c.x-a.x) * ( (b.x).pow(2) + (b.y).pow(2) ) ) ) / ( 2 * ( (a.x-b.x) * (c.y-a.y) - (a.y-b.y) * (c.x-a.x) ) ) )
        return Point(x0, y0)
    }
}


