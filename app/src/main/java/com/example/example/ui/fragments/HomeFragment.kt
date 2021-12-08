package com.example.example.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.example.databinding.FragmentHomeBinding
import com.example.example.ui.viewmodels.StoreViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding?= null
    private val binding get() = _binding!!

    private val storeViewModel: StoreViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentHomeBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        storeViewModel.loadInfo()
        observeViewModels()
    }

    private fun observeViewModels(){
        storeViewModel.info.observe(viewLifecycleOwner, Observer { store->
            binding.homeTitle.text= store.name
            binding.homeAddress.text= store.address
            binding.homeDescription.text= store.description
            Glide.with(binding.root).load(store.image).into(binding.homeImage)

        })
    }


}