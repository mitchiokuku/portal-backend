package com.deficure.portalbackend.category

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/rest/v1")
class CategoryController (val categoryRepository: CategoryRepository) {

    @GetMapping("/categories")
    fun getAll() : Flux<Category> =
            categoryRepository.findAll()

    @GetMapping("/categories/{id}")
    fun get(@PathVariable("id") id: String): Mono<Category> =
            categoryRepository.findById(id)

    @PostMapping(path = arrayOf("/categories"), consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun saveNew(@RequestBody category: Category) : Mono<Category> =
            categoryRepository.save(category)
}
