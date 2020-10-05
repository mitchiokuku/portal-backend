package com.deficure.portalbackend.supplier

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document
data class Supplier(@Id var id: String?,
                    val firstName: String?,
                    val lastName: String?,
                    val nick: String?,
                    val name: String,
                    val countryCode: String = "PL",
                    val city: String?,
                    val postalCode: String?,
                    val street: String?,
                    val buildingNr: String?,
                    val mapCoordinates: String,
                    val type: SupplierType = SupplierType.PRIVATE,
                    val contactPhone: String,
                    val email: String,
                    val availabilityInDays: String = "1111100",
                    val workingHours: String = "9.00 - 17.00",
                    val verified: Boolean = false,
                    val shipment : Boolean = false,
                    val bankAccount: String?,
                    val status: SupplierStatus = SupplierStatus.NEW,
                    val rating: Int = 0)

enum class SupplierType {
    PRIVATE, FARMER, SMALL_BUSINESS, COMPANY, RESELLER
}

enum class SupplierStatus {
    NEW, ACTIVE, NOT_ACTIVE, REMOVED
}