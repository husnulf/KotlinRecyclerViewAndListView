package husnul.com.kotlinkedua

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var imgdetail = intent.getIntExtra("nilai2",0)
        var txtdetail = intent.getStringExtra("nilai3")

        txtisi?.text = txtdetail
        imgisi?.setImageResource(imgdetail)




    }
}
