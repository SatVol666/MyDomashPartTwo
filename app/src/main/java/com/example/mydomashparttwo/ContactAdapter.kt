package com.example.mydomashparttwo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val contactItems: ArrayList<ContactItem>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>()  {

    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {
      val name: TextView = view.findViewById(R.id.name)
      val number: TextView = view.findViewById(R.id.contact_number)
      val image: ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_item, parent, false)

        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.name.text = contactItems[position].username
        holder.number.text = contactItems[position].text
        holder.image.setImageResource(contactItems[position].images)
    }


    override fun getItemCount() = contactItems.size
}