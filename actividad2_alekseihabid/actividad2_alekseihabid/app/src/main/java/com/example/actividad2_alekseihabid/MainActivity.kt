import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.actividad2_alekseihabid.R.layout.activity_main)

        // Referencias a los botones usando el R completo
        val btnRelative: Button = findViewById(com.example.actividad2_alekseihabid.R.id.btnRelativeLayout)
        val btnLinear: Button = findViewById(com.example.actividad2_alekseihabid.R.id.btnLinearLayout)
        val btnTable: Button = findViewById(com.example.actividad2_alekseihabid.R.id.btnTableLayout)
        val btnGrid: Button = findViewById(com.example.actividad2_alekseihabid.R.id.btnGridLayout)

        // Configurar los clicks de forma más sencilla con lambdas
        btnRelative.setOnClickListener {
            val intent = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(intent)
        }

        btnLinear.setOnClickListener {
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
        }

        btnTable.setOnClickListener {
            val intent = Intent(this, TableLayoutActivity::class.java)
            startActivity(intent)
        }

        btnGrid.setOnClickListener {
            val intent = Intent(this, GridLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}
