package com.deficure.portalbackend.assortyment

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class AssortmentController(val assortmentRepository: AssortmentRepository) {


    @GetMapping("/assortment")
    fun getAll() : Flux<Assortment> =
            assortmentRepository.findAll()

    @GetMapping("/assortment/{id}")
    fun get(@PathVariable("id") id: String): Mono<Assortment> =
            assortmentRepository.findById(id)

    @PostMapping(path = arrayOf("/assortment"), consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun saveNew(@RequestBody assortment: Assortment) : Mono<Assortment> =
            assortmentRepository.save(assortment)

}
