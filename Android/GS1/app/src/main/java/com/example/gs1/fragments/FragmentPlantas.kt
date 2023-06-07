package com.example.gs1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gs1.R
import com.example.gs1.fragments.DataItem
import com.example.gs1.fragments.Drone
import com.example.gs1.fragments.MyAdapter

class FragmentPlantas : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter
    private lateinit var plantaList: ArrayList<Planta>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_images, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewFragmentImages)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        plantaList = generateItemList()
        adapter = MyAdapter(plantaList)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }

    private fun generateItemList(): ArrayList<Planta> {
        val list = ArrayList<Planta>()

        for (i in 1..50) {
            val name = "Planta$i"
            val type = "Tipo$i"
            val image = R.drawable.planta
            val planta = Planta(name, type, image)
            list.add(planta)
        }

        return list
    }
}

data class Planta(
    override val name: String,
    override val type: String,
    override val image: Int
) : DataItem
