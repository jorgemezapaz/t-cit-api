package com.tcito.api.domain

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Topic(
  @Id
  val id: ObjectId = ObjectId.get(),
  val code: String,
  val name: String
)
