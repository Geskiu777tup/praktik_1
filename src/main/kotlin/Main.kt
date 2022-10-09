import kotlin.math.*
fun main(args: Array<String>)
{
    val exercises:Int=13  //#1
    var exercisesSolved:Int=0
    exercisesSolved+=1
    var age:Int=18
    //2
    exercisesSolved+=1
    var average:Double=18.0//#3
    exercisesSolved+=1
    average=(average +30.0)/2.0
    exercisesSolved+=1
    val testNumber:Int=1775//#4
    val evenOdd:Double=testNumber%2.0
    println(evenOdd)
    exercisesSolved+=1
    var answer:Int=0 //#5
    answer=((answer+10)*10)shr 3
    println(answer)
    exercisesSolved+=1
    age=16 //#6
    println(age)
    age=30
    println(age)
    exercisesSolved+=1
    val a:Double=46.6 //#7
    val b:Double=10.3
    val answer1=a*100+b
    println(answer1)
    val answer2=a*100+b*100
    println(answer2)
    val answer3=a*100+b/10
    println(answer3)
    exercisesSolved+=1
    println("Ответ="+(5*3-4/2*2)) //#8
    exercisesSolved+=1
    average = (a+b)/2.0 //#9
    exercisesSolved+=1
    val fahrig:Double=180.0 //#10
    var celci:Double=(180.0-32.0)/1.8
    println(celci)
    exercisesSolved+=1
    val position:Int=3 //#11
    val row:Int=0
    val colum:Int=3
    exercisesSolved+=1
    val degrees:Double=45.0 //12
    val radians:Double=PI*degrees/180.0
    println(radians)
    exercisesSolved+=1
    val x1:Double=1.0 //#13
    val x2:Double=5.0
    val y1:Double=3.0
    val y2:Double=8.0
    val distance:Double= sqrt  (((x2-x1).pow(2))+ ((y2-y1).pow(2)))
    println(distance)
    println(exercisesSolved)






















}