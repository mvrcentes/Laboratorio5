//package com.example.affirmations.adapter
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.LinearLayout
//import android.widget.TextView
//import android.widget.Toast
//import androidx.recyclerview.widget.RecyclerView
//import com.example.affirmations.R
//import com.example.affirmations.data.Datasource
//import com.example.affirmations.model.Album
//import com.squareup.picasso.Picasso
//
//class ItemAdapter(private val context: Context, private val dataset: List<Album>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
//    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
//        val textView: TextView = view.findViewById(R.id.item_title)
//        val imageView: ImageView = view.findViewById(R.id.item_image)
//        val linearLayout: LinearLayout = view.findViewById(R.id.linear_layout);
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//        // create a new view
//        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
//
//        return ItemViewHolder(adapterLayout)
//    }
//
//    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        val item = dataset[position]
//        holder.textView.text = context.resources.getString(item.stringResourceId)
//        Picasso.get().load(item.AlbumimageURL).into(holder.imageView)
//
//        val showPosition: String  = (Datasource().loadAlbums().indexOf(item)+1).toString()
//        holder.linearLayout.setOnClickListener{
//            Toast.makeText(context,"Posición: " + showPosition, Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    override fun getItemCount() = dataset.size
//}

package com.example.affirmations.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Album
import com.squareup.picasso.Picasso

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Album>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.imageFrame)
        val linearLayout: LinearLayout = view.findViewById(R.id.linear_layout);
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        val showPosition : String  = (Datasource().loadAlbums().indexOf(item)+1).toString()
        holder.textView.text = context.resources.getString(item.stringResourceId)
        Picasso.get().load(item.AlbumimageURL).into(holder.imageView)

        holder.linearLayout.setOnClickListener{
            Toast.makeText(context,"Position is: " + showPosition, Toast.LENGTH_SHORT).show()
        }


    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataset.size
}