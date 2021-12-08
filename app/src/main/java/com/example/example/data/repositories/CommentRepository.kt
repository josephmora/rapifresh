package com.example.example.data.repositories

import com.example.example.data.mocks.CommentMock
import com.example.example.data.models.Comment


class CommentRepository(private val dataSource: CommentMock) {
    suspend fun loadComments(): List<Comment> {
       return dataSource.loadComments()

    }
}