package sheridan.tetervak.hellosheridan1a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object{
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeButton : Button = findViewById(R.id.clickMeButton)
        clickMeButton.setOnClickListener {
            Log.d(TAG, "The Button is Clicked")
            Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
        }

    }
}