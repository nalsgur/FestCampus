//3
//학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오
// (90점 이상 A, 80~89 B, 70~79 C, 나머지 F)

fun score_cal (score : Int) : String {
    if(score > 90) return "A"
    else if(score > 80) return "B"
    else if(score > 70) return "C"
    else return "F"
}

var score1 = 50
var score2 = 60
var score3 = 80
var score4 = 100

println("score : $score1, grade : ${score_cal(score1)}")
println("score : $score2, grade : ${score_cal(score2)}")
println("score : $score3, grade : ${score_cal(score3)}")
println("score : $score4, grade : ${score_cal(score4)}")