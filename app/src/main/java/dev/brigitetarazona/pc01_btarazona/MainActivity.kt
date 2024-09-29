package dev.brigitetarazona.pc01_btarazona

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etemail:EditText = findViewById(R.id.etemail)
        val etpassword:EditText = findViewById(R.id.etpasword)
        val btlogin:Button=findViewById(R.id.btLogin)

        btlogin.setOnClickListener{
            this.sendMessage(etemail.text.toString())
            val email = etemail.text.toString()
            val password = etpassword.text.toString()
            // Aquí puedes agregar la lógica para iniciar sesión
            // Por ejemplo, puedes verificar las credenciales en una base de datos
            // y mostrar un mensaje de error si las credenciales son incorrectas
            if(email == "admin" && password == "admin"){
                // Credenciales correctas, iniciar sesión
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                // Credenciales incorrectas, mostrar mensaje de error
                etemail.error = "Credenciales incorrectas.."
            }

        }
    }
    private fun sendMessage(message: String){
        val intent = Intent(this,activityPlayers::class.java)
        intent.putExtra("param", message)
        startActivity(intent)
    }
}