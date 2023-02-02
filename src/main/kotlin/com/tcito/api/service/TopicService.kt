package com.tcito.api.service

import com.tcito.api.dto.TopicDTO
import com.tcito.api.repository.TopicRepository
import org.springframework.stereotype.Service

@Service
class TopicService(
  private val topicRepository: TopicRepository
) {

  fun getAll(): List<TopicDTO> {
    return topicRepository.findAll().map { item -> TopicDTO(item.code, item.name) }.toList().sortedBy { it.code }
  }
}