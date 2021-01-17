package com.example.week6assignment1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.week6assignment1.R
import com.example.week6assignment1.adapter.UserAdapter
import com.example.week6assignment1.model.User
import com.example.week6assignment1.model.UserDatabase
import com.example.week6assignment1.model.students
import com.example.week6assignment1.ui.dashboard.DashboardFragment

class HomeFragment : Fragment() {

  private lateinit var recyclerView: RecyclerView

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val root = inflater.inflate(R.layout.fragment_home, container, false)
    recyclerView = root.findViewById(R.id.recyclerView)
    val adapter = UserAdapter(students,container!!.context)
    recyclerView.layoutManager = LinearLayoutManager(container.context)
    recyclerView.adapter = adapter
    return root
  }


}