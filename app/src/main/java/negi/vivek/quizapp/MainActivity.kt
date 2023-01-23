package negi.vivek.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //btn
        val btn : Button = findViewById(R.id.btnclick)
        val name : EditText = findViewById(R.id.et_Name)


        btn.setOnClickListener {
            if(name.text.isEmpty()){
                Toast.makeText(this,"enter your name", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this,quizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME,name.text.toString())
                startActivity(intent)
                finish()

            }
        }
    }
}