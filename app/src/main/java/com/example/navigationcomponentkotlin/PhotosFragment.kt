package com.example.navigationcomponentkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_photos.*

class PhotosFragment: Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


       // button_home.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.next_action, null)) Or use this line
        button_home.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action)
        }

        arguments?.let {

           // val safeArgs: PhotosFragmentArgs by navArgs() // Or use it
            val safeArgs =PhotosFragmentArgs.fromBundle(it)
            textView_num.text="Number of photos: ${safeArgs.numOfPhotos}"
        }
    }
}