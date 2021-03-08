package com.example.spatulaprojectmain

class SpatulaAlgorithm {
    data class CarlorieConstructor(
            val Carb: Int=4,
            val Protein: Int=4,
            val fat: Int=9
    )


    object Calcultae{
        fun Bmr(weight:Int, height: Int, age:Int, gender:Int): Double {

            when (gender) {
                //남자의 경우
                0 -> return 10 * weight + 6.25 * height - 5 * age + 5
                //여자의 경우
                1 -> return 10 * weight + 6.25 * height - 5 * age - 161
                // 사용자가 잘못 입력한 경우 3.0 출력
                else -> return 3.0
            }
        }
        //활동 강도 함수 BMR 입력
        fun Rmr(Bmr:Int, ActivityLevel:Int):Double{
            when(ActivityLevel){
                //활동강도가 1일 경우
                1 -> return Bmr*1.2
                2 -> return Bmr*1.375
                3 -> return Bmr*1.55
                4 -> return Bmr*1.725
                5 -> return Bmr*1.98
                // 사용자가 잘못 입력한 경우 3.0 출력
                else -> return 3.0
            }

        }

    }

    //1일 기준 섭취 칼로리(목표 설정)

    class DayGoal(selection: Int) {
        init{
            //하루 권장섭취 칼로리양
            var Daycalorie:Int
            //하루 권장 탄수화물 양
            var Dailycarb: Int

            //하루 권장 단백질 양
            var DailyProtein: Int

            //하루 권장 지방 양
            var DailyFat= Int

        }
        fun Dailycalorie{


        }


    }



}