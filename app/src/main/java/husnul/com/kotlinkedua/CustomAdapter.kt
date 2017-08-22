package husnul.com.kotlinkedua

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by Husnul on 22/08/2017.
 */
class CustomAdapter : RecyclerView.Adapter<CustomAdapter.Myholder> {
    constructor(recyclerViewActivity: RecyclerViewActivity,arrayNama: Array<String>, arrayGambar: Array<Int>,arrayDet: Array<String>)
            //inilisasi value
    {
        c = recyclerViewActivity
        arrNama = arrayNama
        arrGambar = arrayGambar
        arrDet = arrayDet



    }
    //untuk set image atau text
    override fun onBindViewHolder(holder: Myholder?, position: Int) {
        holder?.txtList?.text = arrNama?.get(position)
        holder?.imgView?.setImageResource(arrGambar?.get(position)!!)
        holder?.imgView?.setOnClickListener {
            var tent = Intent (c, DetailActivity::class.java)
            tent.putExtra("nilai2",arrGambar?.get(position))
            tent.putExtra("nilai3",arrDet?.get(position))
            c?.startActivity(tent)
        }

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return arrGambar?.size!!
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Myholder {
        var view = LayoutInflater.from(c).inflate(R.layout.list_itemrcl,parent,false)
        return Myholder(view)


        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var c : Activity? = null
    var arrGambar : Array<Int>? = null
    var arrNama : Array<String>? = null
    var arrDet : Array<String>? = null


        //untuk inisialisasi "id" dari list item
    class Myholder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
            var txtList : TextView? = itemView?.findViewById(R.id.txtList) as TextView?
            var imgView : ImageView? = itemView?.findViewById(R.id.imgList) as ImageView?


    }


}