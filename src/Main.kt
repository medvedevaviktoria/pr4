//4 задача
//Треугольник в окружности (обязательно использование класса Точка и класса Треугольник. Класс Окружность и другие классы - по желанию)
//Треугольник расположен на координатной плоскости и описан координатами своих вершин. Написать программу вычисляющую координаты центра описанной вокруг треугольника окружности и ее радиус.

fun main() {

    //первая вершина A
println("Введите координаты вершин треугольника:")



    println("Введите координаты точки A (x y):")
    val AInput = readLine()!!.split(" ")
    val xA = AInput[0].toDouble()
    val yA = AInput[1].toDouble()
    val pointA = Point(xA, yA)

    println("Введите координаты точки B (x y):")
    val bInput = readLine()!!.split(" ")
    val xB = bInput[0].toDouble()
    val yB = bInput[1].toDouble()
    val pointB = Point(xB, yB)

    println("Введите координаты точки C (x y):")
    val cInput = readLine()!!.split(" ")
    val xC = cInput[0].toDouble()
    val yC = cInput[1].toDouble()
    val pointC = Point(xC, yC)


    val triangle = Triangle(pointA, pointB, pointC)

    val radius = triangle.Radius()
    println("Радиус описанной вокруг треугольника окружности равен: $radius")
    val center = triangle.circleCenter()
    println("Координаты центра описанной вокруг треугольника окружности: $center")

}