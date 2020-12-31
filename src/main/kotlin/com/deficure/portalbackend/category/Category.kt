package com.deficure.portalbackend.category

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime


@Document
data class Category(@Id var id: String?,
                    val name: String,
                    val parentCategoryId: String?,
                    val created: LocalDateTime = LocalDateTime.now(),
                    val status: CategoryStatus = CategoryStatus.ACTIVE)

enum class CategoryStatus {
    ACTIVE, NOT_ACTIVE, REMOVED
}