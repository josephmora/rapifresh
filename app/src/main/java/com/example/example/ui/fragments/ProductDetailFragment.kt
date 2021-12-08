package com.example.example.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.example.databinding.FragmentProductBinding
import com.example.example.databinding.FragmentProductDetailBinding
import com.example.example.ui.viewmodels.ProductViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class ProductDetailFragment : Fragment() {


    private var _binding: FragmentProductDetailBinding?= null
    private val binding get() = _binding!!
    private val productViewModel: ProductViewModel by sharedViewModel()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentProductDetailBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        observerViewModels()
    }
    private fun observerViewModels(){
        productViewModel.selected.observe(viewLifecycleOwner, Observer { product ->
            binding.productDetailName.text = product.name
            binding.productDetailPrice.text = product.price
            binding.productDetailDescription.text= product.description
            Glide.with(binding.root).load(product.image).into(binding.productDetailImage)

        })
    }


}