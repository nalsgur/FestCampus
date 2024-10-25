//4
//학생이 시험에서 맞은 문제의 개수를 넣어주면 시험 점수를반환하는 함수를 만드시오
//시험문제는 총 20문제이고 만점은 100점

fun score (count : Int) : Int {
    if(count > 20) {
        println("아래는 잘못 계산 되었습니다.")
        return 100
    }
    return count*5
}

var student1 = 0
var student2 = 5
var student3 = 10
var student4 = 20
var student5 = 25

println("student : $student1 , score : ${score(student1)}")
println("student : $student2 , score : ${score(student2)}")
println("student : $student3 , score : ${score(student3)}")
println("student : $student4 , score : ${score(student4)}")
println("student : $student5 , score : ${score(student5)}")

