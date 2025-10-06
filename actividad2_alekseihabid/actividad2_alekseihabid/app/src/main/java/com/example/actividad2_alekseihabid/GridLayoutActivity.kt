import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GridLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Asegúrate de que este archivo XML existe exactamente con este nombre
        setContentView(com.example.actividad2_alekseihabid.R.layout.activity_grid_layout)

        val btnRegresar: Button = findViewById(com.example.actividad2_alekseihabid.R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            finish()
        }
    }
}
