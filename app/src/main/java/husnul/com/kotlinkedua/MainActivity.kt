package husnul.com.kotlinkedua

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnrecyclerView.setOnClickListener {
            actionPindah(RecyclerViewActivity())
        }
        btnlistView.setOnClickListener {
            actionPindah(ListViewActivity())

        }

    }

    private fun actionPindah(RecyclerViewActivity : Any) {
        startActivity(Intent(applicationContext,RecyclerViewActivity::class.java))


    }

}
