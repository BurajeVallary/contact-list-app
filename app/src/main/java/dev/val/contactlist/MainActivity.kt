package dev.`val`.contactlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dev.`val`.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContact()
    }

    private fun displayContact() {
        var contact2 = ContactData("phelix", "phali", "val@gmail.com","07657890")
        var contact3 = ContactData("dester", "deste", "v@gmail.com","0986654")
        var contact4 = ContactData("juliet", "juliet@gmail.com", "ji@io.com","b0986433")
        var contactLists = listOf<ContactData>( contact2, contact3, contact4)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
       var contactAdapter=ContactRvAdaptor(contactLists)
        binding.rvContacts.adapter=contactAdapter


    }
    }



