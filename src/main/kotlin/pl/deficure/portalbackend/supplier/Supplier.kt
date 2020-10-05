package pl.deficure.portalbackend.supplier

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Supplier(@Id var id: String?, val name: String)