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

class FragmentImages : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter
    private lateinit var imageList: ArrayList<Image>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_images, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewFragmentImages)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        imageList = generateItemList()
        adapter = MyAdapter(imageList)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }

    private fun generateItemList(): ArrayList<Image> {
        val list = ArrayList<Image>()

        for (i in 1..50) {
            val name = "Image$i"
            val type = "Tipo$i"
            val image = R.drawable.image
            val img = Image(name, type, image)
            list.add(img)
        }

        return list
    }
}

data class Image(
    override val name: String,
    override val type: String,
    override val image: Int
) : DataItem
