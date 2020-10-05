package com.deficure.portalbackend.item

import com.deficure.portalbackend.assortyment.Assortment
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Item(@Id var id: String?,
                val name: String,
                val quantity: Int,
                val unitOfMeasure: String,
                val assortment: Assortment,
                val countryCode: String,
                val city: String,
                val postalCode: String,
                val street: String,
                val buildingNr: String,
                val mapCoordinates: String,
                val contactPhone: String,
                val email: String,
                val status: CustomerStatus)

enum class CustomerStatus {
    NEW, ACTIVE, NOT_ACTIVE, REMOVED
}