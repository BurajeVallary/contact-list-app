package dev.`val`.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import dev.`val`.contactlist.databinding.ContactlistBinding

class ContactRvAdaptor(var contactLists: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var tweet =contactLists[position]
        holder.binding.ivAvatar.toString()
        holder.binding.tvName.text=tweet.displayName
        holder.binding.tvEmail.text=tweet.email
        holder.binding.tvNumber.text=tweet.number


    }

    override fun getItemCount(): Int {
        return  contactLists.size
    }
}




class ContactViewHolder(var binding: ContactlistBinding):ViewHolder(binding.root){}