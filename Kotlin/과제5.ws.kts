//5
//Nullable 정수형 두개를 받는 함수를 만든다.
//이 함수는 받은 인수의 합을 반환한다 (이때, 인수중에 null이 있으면 0으로 취급하여 합을 구한다.)

fun sum (num1 : Int , num2 : Int) : Int {
    return num1 + num2
}

var num1 : Int? = 0
var num2 : Int? = 2

println("num1 : $num1 , num2 : $num2 , sum = ${sum(num1!!,num2!!)}")