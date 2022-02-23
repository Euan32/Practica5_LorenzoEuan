package euan.lorenzo.thecheezerys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.coldDrinksButton) as Button
        var btnHot: Button = findViewById(R.id.hotDrinksButton) as Button
        var btnSweets: Button = findViewById(R.id.sweetsButton) as Button
        var btnSalties: Button = findViewById(R.id.saltiesButton) as Button

        btnCold.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("type", "coldDrinks")
            startActivity(intent)
        }
        btnHot.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("type", "hotDrinks")
            startActivity(intent)
        }
        btnSweets.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("type", "sweets")
            startActivity(intent)
        }
        btnSalties.setOnClickListener{
            var intent: Intent= Intent(this, ProductosActivity::class.java)
            intent.putExtra("type", "salties")
            startActivity(intent)
        }

    }
}