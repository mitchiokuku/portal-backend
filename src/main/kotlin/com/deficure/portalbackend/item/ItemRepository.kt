package com.deficure.portalbackend.item

import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface ItemRepository : ReactiveMongoRepository<Item, String>