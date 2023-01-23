package negi.vivek.quizapp

object Constants {

    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTION:String = "total_questions"
    const val CORRECT_ANSWER:String = "correct_answers"

    fun getQuestion():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does the flag belong to?",R.drawable.ic_flag_of_argentina,
            "Argentina","India","Australia","Fiji",
            1
        )
        questionList.add(que1)
        val que2 = Question(
            2,"What country does the flag belong to?",R.drawable.ic_flag_of_fiji,
            "Argentina","India","Australia","Fiji",
            4
        )
        questionList.add(que2)
        val que3 = Question(
            3,"What country does the flag belong to?",R.drawable.ic_flag_of_india,
            "Argentina","India","Australia","Fiji",
            2
        )
        questionList.add(que3)
        val que4 = Question(
            4,"What country does the flag belong to?",R.drawable.ic_flag_of_australia,
            "Argentina","India","Australia","Fiji",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            5,"What country does the flag belong to?",R.drawable.ic_flag_of_belgium,
            "Argentina","Belgium","Australia","Fiji",
            2
        )
        questionList.add(que5)
        val que6 = Question(
            6,"What country does the flag belong to?",R.drawable.ic_flag_of_brazil,
            "Argentina","Brazil","Australia","Fiji",
            2
        )
        questionList.add(que6)
        val que7 = Question(
            7,"What country does the flag belong to?",R.drawable.ic_flag_of_germany,
            "Argentina","India","Germany","Fiji",
            3
        )
        questionList.add(que7)
        val que8 = Question(
            8,"What country does the flag belong to?",R.drawable.ic_flag_of_new_zealand,
            "New Zealand","India","Australia","Fiji",
            1
        )
        questionList.add(que8)








        return questionList
    }

}