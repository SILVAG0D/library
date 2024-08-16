package com.example.library.repository

import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository
import java.awt.print.Book

@Repository
interface BookRepository: CoroutineCrudRepository<com.example.library.entity.book.Book,Long?>{

    @Query("SELECT * FROM application.books WHERE title = :title")
    suspend fun findByTitle(title:String): List<Book>
}