package com.deficure.portalbackend.assortyment

import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface AssortmentRepository : ReactiveMongoRepository<Assortment, String>