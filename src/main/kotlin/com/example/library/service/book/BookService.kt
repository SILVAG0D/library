package com.example.library.service.book

import com.example.library.repository.BookRepository
import kotlinx.coroutines.flow.toList
import org.springframework.stereotype.Service
import java.awt.print.Book

@Service
class BookService(
    private val bookRepository: BookRepository
) {
    suspend fun save(book: com.example.library.entity.book.Book):Book{
        return  bookRepository.save(book)
    }

    suspend fun findAll(): List<Book>{
        return bookRepository.findAll().toList()
    }

    suspend fun findById(id:Long) :Book{
        return bookRepository.findById(id)
            ?: throw Exception("Not Found")
    }

    suspend fun findByTitle(title:String) :List<Book>{
        return bookRepository.findByTitle(title)
    }

    suspend fun deleteById(id: Long){
        return bookRepository.deleteById(id)
    }
}