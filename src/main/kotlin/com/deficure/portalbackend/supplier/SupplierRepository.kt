package com.deficure.portalbackend.supplier

import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface SupplierRepository : ReactiveMongoRepository<Supplier, String>
