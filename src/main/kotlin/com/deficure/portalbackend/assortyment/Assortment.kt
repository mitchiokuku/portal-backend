package com.deficure.portalbackend.assortyment

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Assortment(@Id var id: String?,
                      val name: String)