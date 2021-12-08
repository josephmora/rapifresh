package com.example.example.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.example.ui.adapters.CommentAdapter
import com.example.example.data.models.Comment
import com.example.example.databinding.FragmentCommentBinding
import com.example.example.ui.viewmodels.CommentViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class CommentFragment : Fragment() {

    private var _binding:FragmentCommentBinding?= null
    private val binding get() = _binding!!

    private lateinit var commentAdapter: CommentAdapter
    private lateinit var commentManager: LinearLayoutManager
    private val commentViewModel: CommentViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentCommentBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        commentViewModel.loadComments()
        commentAdapter= CommentAdapter(

            listOf()
        )
        //el constructor puede recibir parametros como reverso y orientación
        commentManager= LinearLayoutManager(requireContext())
        binding.commentRecycler.apply{
            adapter= commentAdapter
            layoutManager= commentManager
        }
        observeViewModels()
    }
    private fun observeViewModels(){
        commentViewModel.comments.observe(viewLifecycleOwner, Observer { comments ->
            commentAdapter.newDataSet(comments)

        })
    }

}