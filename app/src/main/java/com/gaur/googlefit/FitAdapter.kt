package com.gaur.googlefit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.gaur.googlefit.databinding.ViewHolderFitBinding

class FitAdapter(val list:List<FitData>) : RecyclerView.Adapter<FitAdapter.MyViewHolder>() {


    inner class MyViewHolder(val viewDataBinding: ViewHolderFitBinding): RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FitAdapter.MyViewHolder {
        val binding = ViewHolderFitBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FitAdapter.MyViewHolder, position: Int) {
        val binding = holder.viewDataBinding
        val item = list[position]
        binding.apply {
            this.date.text = item.endTime
            this.steps.text = item.steps+" Steps"
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}