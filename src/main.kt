// Package Math_Package()

fun calculatesquare() {
    // Calculate square area if user chooses a square.
    var sideLength = 1
    var area = 1
    println("Enter the length of a side: ")
    sideLength = readLine()!!.toInt()
    area = sideLength * sideLength
    println("The area of your square is $area")
}

fun calculaterectangle() {
    // Calculate rectangle area if user chooses a rectangle.
    var sideLength1 = 1
    var sideLength2 = 1
    var area = 1
    println("Enter the length of side1: ")
    sideLength1 = readLine()!!.toInt()
    println("Enter the length of side2: ")
    sideLength2 = readLine()!!.toInt()
    area = sideLength1 * sideLength2
    println("The area of your rectangle is $area")
}

fun calculatecircle() {
    // Calculate circle area if user chooses a circle.
    val pi = math.PI
    var radius = 1
    var area: Double
    println("Enter the radius of the circle: ")
    radius = readLine()!!.toInt()
    area = (radius * radius) * pi
    println("The area of your circle is $area")
}

fun calculatetriangle() {
    // Calculate trinagle area if user chooses a triangle.
    var base = 1
    var height = 1
    var area = 1
    println("Enter the length of the base of your triangle: ")
    base = readLine()!!.toInt()
    println("Enter the length of the height of your trianle: ")
    height = readLine()!!.toInt()
    area = base * height * 1/2
    println("The area of your triangle is $area")
}

fun main(args: Array<String>) {
    // Print the menu choices and see what area the user would like to caclulate. Error check too.
    var menuChoice = 0
    do {
        println()
        println("1) Calculate the area of a square. -- Type 1")
        println("2) Calculate the area of a rectangle. -- Type 2")
        println("3) Calculate the area of a circle -- Type 3")
        println("4) Calculate the area of a triangle - Type 4")
        println("5) Exit the program -- Type 5")
        menuChoice = readLine()!!.toInt()
        when (menuChoice) {
            1 -> calculatesquare()
            2 -> calculaterectangle()
            3 -> calculatecircle()
            4 -> calculatetriangle()
            5 -> print("Goodbye.")
            !in 1..5 -> print("This is not a valid choice please choose again.                                                                                                        ")
        }
    } while (menuChoice != 5)
}