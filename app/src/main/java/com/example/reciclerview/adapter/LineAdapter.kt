package com.example.reciclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerview.R
import com.example.reciclerview.dataClasses.Place

class LineAdapter(private val dataSet: ArrayList<Place>) :
    RecyclerView.Adapter<LineAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // ir buscar os controlos do tipo textview da minha linha
        val vh_txt1: TextView
        val vh_txt2: TextView
        val vh_txt3: TextView
        val vh_txt4: TextView

        init {
            // TODO: Define click listener for the ViewHolder's View.
            vh_txt1 = view.findViewById(R.id.textView1)
            vh_txt2 = view.findViewById(R.id.textView2)
            vh_txt3 = view.findViewById(R.id.textView3)
            vh_txt4 = view.findViewById(R.id.textView4)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            // TODO: specify the line layout
            .inflate(R.layout.line, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        // TODO: Define what each text has
        viewHolder.vh_txt1.text = "nome do país: " + dataSet[position].country
        viewHolder.vh_txt2.text = dataSet[position].capital
        viewHolder.vh_txt3.text = dataSet[position].habitante.toString()
        viewHolder.vh_txt4.text = dataSet[position].bandeira
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}