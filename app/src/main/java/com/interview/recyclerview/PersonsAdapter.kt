package com.interview.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.interview.R
// THIS CLASS CAN'T BE MODIFIED
class PersonsAdapter : RecyclerView.Adapter<PersonViewHolder>()
{
    var personsNames = emptyList<String>()

    override fun getItemCount() = personsNames.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent,false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.nameTextView.text = personsNames[position]
    }
}

class PersonViewHolder(view: View)  : RecyclerView.ViewHolder(view)
{
    val nameTextView = view.findViewById<TextView>(R.id.name_text_view)
}