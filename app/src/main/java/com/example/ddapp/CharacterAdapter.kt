package com.example.ddapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.character_list.view.*
import kotlinx.android.synthetic.main.character_list_content.view.*

class CharacterAdapter(val charList : ArrayList<Character>) : RecyclerView.Adapter<ViewHolder>() {

    // Gets the number of characters in the list
    override fun getItemCount(): Int {
        return charList.size
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.character_list_content, parent, false))
    }

    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mCharacter = charList[position]

        holder.mView.setOnClickListener(View.OnClickListener { v ->
            val context = v.context
            val intent = Intent(context, CharacterDetailActivity::class.java).apply {
                putExtra("charName", holder.mCharacter!!.getCharName())
            }

            context.startActivity(intent)
        })
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val characterName = view.name
    val mView = view
    var mCharacter: Character? = null
}
