/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
 fun  duplicatesWords(Sentences:String)
 {
     val words= ("")
     val seen = mutableSetOf<String>()
     val duplicates = mutableListOf<String>()
     
     for (word in words)
     {
         if(!seen.add(word))
         {
         
             duplicates.add(word)
         }
         
     }
     return duplicates 
 }
 
 
 fun main(){
     
     val sentence= "Kotlin is language and Kotlin is powerful"
     println("Duplicates words:{$findDuplicatesWords(sentence)}" )
 }
