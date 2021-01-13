package com.deficure.portalbackend.item

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/rest/v1")
class ItemController(val itemRepository: ItemRepository) {

    @GetMapping("/items")
    fun getAll() : Flux<Item> =
            itemRepository.findAll()

    @GetMapping("/items/{id}")
    fun get(@PathVariable("id") id: String): Mono<Item> =
            itemRepository.findById(id)

    @PostMapping(path = arrayOf("/items"), consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun saveNew(@RequestBody item: Item) : Mono<Item> =
            itemRepository.save(item)
}
