/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

    fun findDuplicatesInt(arr: Array<Int>): List<Int> {
    val seen = mutableSetOf<Int>()        // Set to track seen numbers
    val duplicates = mutableListOf<Int>() // List to store duplicates

    for (num in arr) {
        if (!seen.add(num)) {             // If the number is already in 'seen'
            duplicates.add(num)           // Add it to duplicates
        }
    }
    return duplicates                     // Return the list of duplicates
}

fun main() {
    val num = arrayOf(1, 2, 3, 4, 5, 2, 3, 6, 7, 1)  
    println("Duplicates num: ${findDuplicatesInt(num)}") // Call and print results
}
 