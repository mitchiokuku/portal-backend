package com.deficure.portalbackend.assortyment


import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.time.LocalDateTime

@Document
data class Assortment(@Id var id: String?,
                      val supplierId: String,
                      val category: String,
                      val name: String,
                      val type: String?,
                      val price: BigDecimal?,
                      val created: LocalDateTime,
                      val status: AssortmentStatus= AssortmentStatus.NEW
                      )
enum class AssortmentStatus {
    NEW, ACTIVE, UNAVAILABLE, REMOVED
}