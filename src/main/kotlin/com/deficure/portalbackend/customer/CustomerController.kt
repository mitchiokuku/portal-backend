package com.deficure.portalbackend.customer

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class CustomerController(val customerRepository: CustomerRepository) {


    @GetMapping("/customers")
    fun getAll() : Flux<Customer> =
            customerRepository.findAll()

    @GetMapping("/customers/{id}")
    fun get(@PathVariable("id") id: String): Mono<Customer> =
            customerRepository.findById(id)

    @PostMapping(path = arrayOf("/customers"), consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun saveNew(@RequestBody customer: Customer) : Mono<Customer> =
            customerRepository.save(customer)

}