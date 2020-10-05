package com.deficure.portalbackend.customer

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Customer(@Id var id: String?,
                    val firstName: String?,
                    val lastName: String?,
                    val nick: String,
                    val countryCode: String?,
                    val city: String?,
                    val postalCode: String?,
                    val street: String?,
                    val buildingNr: String?,
                    val contactPhone: String?,
                    val email: String,
                    val status: CustomerStatus = CustomerStatus.NEW)

enum class CustomerStatus {
    NEW, ACTIVE, NOT_ACTIVE, REMOVED
}