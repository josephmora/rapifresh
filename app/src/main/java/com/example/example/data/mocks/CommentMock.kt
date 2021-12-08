package com.example.example.data.mocks

import com.example.example.data.models.Comment

class CommentMock {

        fun loadComments(): List<Comment> {
            return listOf(
                Comment("1","¡Yo soy tu padre!","Anakin Skywalker", "https://i.pinimg.com/564x/7e/34/9f/7e349f9acea478b4954416fedb0d796e.jpg","2021/10/21"),
                Comment("2","La fuerza estará ya contigo… siempre.","Obi-Wan Kenobi", "https://i.pinimg.com/564x/5f/12/b4/5f12b4ca1cfd0b4546e8e6ff2445e1a6.jpg","2021/11/21"),
                Comment("3","Hwaaurrgh ghaawwu huagg, Gwaaaaaghhhh Grrrruuughhh Gwehh","Chewbacca", "https://i.pinimg.com/564x/66/64/f8/6664f82a3683c5ff63e652f369ad75ab.jpg","2012/11/21")
            )
        }

}