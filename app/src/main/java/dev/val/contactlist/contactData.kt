package dev.`val`.contactlist

import android.provider.ContactsContract.CommonDataKinds.Email
import android.provider.ContactsContract.CommonDataKinds.Phone

data class ContactData(
    var avator:String,
    var name:String,
    var email: String,
    var phone: String,


)
