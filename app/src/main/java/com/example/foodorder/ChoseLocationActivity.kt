package com.example.foodorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.example.foodorder.databinding.ActivityChoseLocationBinding

class ChoseLocationActivity : AppCompatActivity() {
    private val binding:ActivityChoseLocationBinding by lazy {
        ActivityChoseLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val locationList:Array<String> = arrayOf("Bardhaman","kolkata","Purolia","Bhirbhum","Domdom","Jalpaiguri")
        val adapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}