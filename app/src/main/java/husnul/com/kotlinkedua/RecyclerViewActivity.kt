package husnul.com.kotlinkedua

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    var arrayNama = arrayOf("Avatar","Back","Book","Cancel","Chat","MyChat","Copy","Dislike")
    var arrayGambar = arrayOf(R.drawable.avatarr,R.drawable.back,R.drawable.book,R.drawable.cancel,R.drawable.chat
            ,R.drawable.chatku,R.drawable.copy,R.drawable.dislike)
    var arrayDet = arrayOf("isi","isi","masakan","masakan","minuman","minuman","gelas","gelas")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

//        var adapter = CustomAdapter(this,arrayNama,arrayGambar)
//        var linear = LinearLayoutManager(this)
//        recyclerView.adapter = adapter
//        recyclerView.layoutManager = linear
        var adapter = CustomAdapter(this,arrayNama,arrayGambar,arrayDet)
        var linear = LinearLayoutManager(applicationContext)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = linear


    }
}
