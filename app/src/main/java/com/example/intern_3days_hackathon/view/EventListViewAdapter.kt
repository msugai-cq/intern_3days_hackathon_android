package com.example.intern_3days_hackathon.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.intern_3days_hackathon.R
import com.example.intern_3days_hackathon.model.response.Event
import com.example.intern_3days_hackathon.view.EventListViewAdapter.EventListViewHolder
import kotlinx.android.synthetic.main.row_event_list.view.*

class EventListViewAdapter(private val listData: List<Event>?) : RecyclerView.Adapter<EventListViewHolder>() {

    lateinit var listener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClickListener(item: Event)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    class EventListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvEventTitle: TextView = itemView.tv_event_title
        val tvEventAddress: TextView = itemView.tv_event_address_name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_event_list, parent, false)
        return EventListViewHolder(v)
    }

    override fun onBindViewHolder(holder: EventListViewHolder, position: Int) {
        listData?.let {
            val event = listData[position]
            holder.tvEventTitle.text = event.title
            holder.tvEventAddress.text = event.address
            holder.itemView.setOnClickListener {
                if (position == RecyclerView.NO_POSITION) {
                    return@setOnClickListener
                }
                listener.onItemClickListener(event)
            }
        }
    }

    override fun getItemCount(): Int {
        listData?.let {
            return listData.size
        }
        return 0
    }
}
