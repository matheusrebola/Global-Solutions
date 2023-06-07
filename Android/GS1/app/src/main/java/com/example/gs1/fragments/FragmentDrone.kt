package com.example.gs1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import com.example.gs1.R
import com.squareup.picasso.Picasso

class FragmentDrone : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter
    private lateinit var droneList: ArrayList<Drone>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_drone, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewFragmentDrone)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        droneList = generateItemList()

        adapter = MyAdapter(droneList)

        recyclerView.adapter = adapter

        return view
    }

    private fun generateItemList(): ArrayList<Drone> {
        val list = ArrayList<Drone>()

        for (i in 1..50) {
            val name = "Drone$i"
            val type = "Tipo$i"
            val image = R.drawable.image_drone
            val drone = Drone(name, type, image)
            list.add(drone)
        }

        return list
    }

}

class MyAdapter(private val dataList: List<DataItem>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val nameTextView: TextView = itemView.findViewById(R.id.textViewName)
        private val typeTextView: TextView = itemView.findViewById(R.id.textViewType)
        private val imageViewItem: ImageView = itemView.findViewById(R.id.imageViewItem)

        fun bind(item: DataItem) {
            nameTextView.text = item.name
            typeTextView.text = item.type

            imageViewItem.setImageResource(item.image)
        }
    }
}

data class Drone(
    override val name: String,
    override val type: String,
    override val image: Int
) : DataItem


