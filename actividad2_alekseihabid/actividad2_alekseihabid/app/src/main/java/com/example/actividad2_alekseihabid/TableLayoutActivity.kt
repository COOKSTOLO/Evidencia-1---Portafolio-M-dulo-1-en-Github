import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TableLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.actividad2_alekseihabid.R.layout.activity_table_layout)

        val btnRegresar: Button = findViewById(com.example.actividad2_alekseihabid.R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            finish()
        }
    }
}
