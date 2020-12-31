package com.deficure.portalbackend.customer

import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface CustomerRepository : ReactiveMongoRepository<Customer, String>