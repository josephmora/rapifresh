package com.example.example.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.example.R
import com.example.example.ui.listeners.OnProductListener
import com.example.example.ui.adapters.ProductAdapter
import com.example.example.data.models.Product
import com.example.example.databinding.FragmentProductBinding
import com.example.example.ui.viewmodels.ProductViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel


class ProductFragment : Fragment() {

    private var _binding:FragmentProductBinding?= null
    private val binding get() = _binding!!

    private lateinit var productAdapter: ProductAdapter
    private lateinit var productManager: GridLayoutManager
    private val productViewModel: ProductViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentProductBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        productViewModel.loadProducts()
        productAdapter = ProductAdapter(
            listOf()
        )
        productManager = GridLayoutManager(requireContext(),2)
        //hacer algo cuando se detecta clic en una card de producto
        productAdapter.listener= object : OnProductListener {
            override fun onClick(item: Product) {
                Log.d("Prducto", item.name)
                productViewModel.selectProduct(item)
                findNavController().navigate(R.id.action_productFragment_to_productDetailFragment)
            }
        }
        binding.productRecycler.apply{
            adapter= productAdapter
            layoutManager= productManager
        }
        observerViewModels()
    }

    private fun observerViewModels(){
        productViewModel.product.observe(viewLifecycleOwner, Observer { products ->
            productAdapter.newDataSet(products)
        })
    }


}