package com.vinrak.fragmentviewbinding

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun cast_testing() {
        val strNumber = "9619747465"
        println("strNumber = $strNumber")
        val intNumber = strNumber.toBigInteger()
        println("intNumber = $intNumber")
    }

    @Test
    fun toDisplayString() {

        val inputString =
            "   @SerializedName(\"user_profession_id\") var user_profession_id: Int? = null,\n" +
                    "            @SerializedName(\"user_salary_mode\") var user_salary_mode: Int? = null,\n" +
                    "            @SerializedName(\"user_employer_name\") var user_employer_name: String? = null,\n" +
                    "            @SerializedName(\"user_joining_date\") var user_joining_date: String? = null,\n" +
                    "            @SerializedName(\"user_total_experience\") var user_total_experience: String? = null,\n" +
                    "            @SerializedName(\"user_current_employer_exp\") var user_current_employer_exp: String? = null,\n" +
                    "            @SerializedName(\"user_monthly_income\") var user_monthly_income: String? = null,\n" +
                    "            @SerializedName(\"user_employer_pincode\") var user_employer_pincode: String? = null,\n" +
                    "            @SerializedName(\"user_business_turnover_yearly\") var user_business_turnover_yearly: String? = null,\n" +
                    "            @SerializedName(\"user_college_pincode\") var user_college_pincode: String? = null,\n" +
                    "            @SerializedName(\"user_college_name\") var user_college_name: String? = null,\n" +
                    "            @SerializedName(\"user_class\") var user_class: String? = null"

        val inputStringArray = inputString.split(",")

        for (i in 0 until inputStringArray.size - 1) {
            //println("variableName = ${inputStringArray[i]}")
            val item = inputStringArray[i]
            val variableName = item.substring(item.indexOf("var") + 3, item.indexOf(":"))
            println("${variableName.trim()} = $${variableName.trim()}")
        }

        /* inputStringArray.forEach {
             //val variableName = inputString.substring(it.indexOf("var"),it.indexOf(":"))
             println("variableName = $it")
         }*/

    }

    @Test
    fun toForEachDisplay() {

        val a = arrayOf(1,2,3,4,5)
        a.forEach {
            println(it)
        }
    }

}