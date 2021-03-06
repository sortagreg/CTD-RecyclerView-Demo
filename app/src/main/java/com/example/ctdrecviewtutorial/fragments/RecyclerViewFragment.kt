package com.example.ctdrecviewtutorial.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

import com.example.ctdrecviewtutorial.R
import com.example.ctdrecviewtutorial.database.MyViewModel
import kotlinx.android.synthetic.main.fragment_recycler_view.*

class RecyclerViewFragment : Fragment() {

    val viewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.myNotes.observe(this, Observer {
            it?.let { noteList ->

            }
        })

    }

}
