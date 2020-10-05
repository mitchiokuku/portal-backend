package pl.deficure.portalbackend.supplier

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class SupplierController(val supplierRepository: SupplierRepository) {


    @GetMapping("/supplier")
    fun getAll() : Flux<Supplier> =
            supplierRepository.findAll()

    @GetMapping("/supplier/{id}")
    fun get(@PathVariable("id") id: String): Mono<Supplier> =
            supplierRepository.findById(id)

    @PostMapping(path = arrayOf("/supplier"), consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun saveNew(@RequestBody supplier: Supplier) : Mono<Supplier> =
            supplierRepository.save(supplier)

}
