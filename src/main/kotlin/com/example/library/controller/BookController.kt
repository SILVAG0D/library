package com.example.library.controller

import com.example.library.entity.book.Book
import com.example.library.service.book.BookService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/book")
class BookController (
    private val bookService: BookService
){
    @PostMapping("/new")
     suspend fun save(@RequestBody book: Book): java.awt.print.Book {
         return  bookService.save(book)
     }
}