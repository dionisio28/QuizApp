package com.dionisio.quizapp

object Constants {


    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions() : ArrayList<Question> {
        val questionsList = ArrayList<Question>()


        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_argetina,
            "Argentina",
            "Brazil",
            "Australia",
            "Andorra",
            1,
        )
        questionsList.add(que1)


        val que2 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_brazil,
            "Bolivia",
            "Cameroon",
            "Belarus",
            "Brazil",
            4,
        )
        questionsList.add(que2)

        val que3 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_canada,
            "China",
            "Canada",
            "Denmark",
            "Finland",
            2,
        )
        questionsList.add(que3)

        val que4 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_jamaica,
            "Colombia",
            "Jamaica",
            "Angola",
            "Argentina",
            2,
        )
        questionsList.add(que4)

        val que5 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_israel,
            "Brazil",
            "Iran",
            "Israel",
            "Georgia",
            3
        )
        questionsList.add(que5)

        val que6 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_japan,
            "Japan",
            "Haiti",
            "Guatemala",
            "Ireland",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_austria,
            "Bahamas",
            "Bangladesh",
            "Austria",
            "Bolivia",
            3
        )
        questionsList.add(que7)

        val que8 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_australia,
            "Cuba",
            "Honduras",
            "Barbados",
            "Australia",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_india,
            "India",
            "Iceland",
            "Indonesia",
            "Iraq",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_italy,
            "Italy",
            "Hungary",
            "France",
            "Afghanistan",
            1
        )
        questionsList.add(que10)


        return  questionsList
    }

}