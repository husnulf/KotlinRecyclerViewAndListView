package husnul.com.kotlinkedua

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    var dataArray = arrayOf("PHP","Java","Ruby","HTML 5","XML","Kotlin")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var adapterData = ArrayAdapter(ListViewActivity@this,android.R.layout.simple_list_item_1,dataArray)
        listView.adapter = adapterData





    }
}
