package com.tcito.api.repository

import com.tcito.api.domain.Topic
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TopicRepository: MongoRepository<Topic, String>