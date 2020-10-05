package com.deficure.portalbackend.item

import com.deficure.portalbackend.assortyment.Assortment
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Item(@Id var id: String?,
                val name: String,
                val quantity: Int,
                val unitOfMeasure: String,
                val assortment: Assortment?,
                val status: ItemStatus = ItemStatus.ACTIVE)

enum class ItemStatus {
    ACTIVE, UNAVAILABLE, REMOVED
}