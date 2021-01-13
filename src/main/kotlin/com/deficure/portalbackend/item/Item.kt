package com.deficure.portalbackend.item

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.time.LocalDateTime

@Document
data class Item(@Id var id: String?,
                val supplierId: String,
                val name: String,
                val description: String,
                val categoryId: String,
                val quantity: Int,
                val unitOfMeasure: String,
                val price: BigDecimal = BigDecimal.ZERO,
                val created: LocalDateTime = LocalDateTime.now(),
                val status: ItemStatus = ItemStatus.ACTIVE)

enum class ItemStatus {
    ACTIVE, UNAVAILABLE, REMOVED
}