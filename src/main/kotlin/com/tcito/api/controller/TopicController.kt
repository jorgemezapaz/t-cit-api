package com.tcito.api.controller

import com.fasterxml.jackson.module.kotlin.jacksonMapperBuilder
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.tcito.api.dto.TopicDTO
import com.tcito.api.service.TopicService
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/topics")
class TopicController(
  private val topicService: TopicService
) {

  companion object{
    private val LOGGER = LoggerFactory.getLogger(TopicController::class.java)
  }

  @GetMapping
  fun getAll(): ResponseEntity<List<TopicDTO>> {
    LOGGER.info("--TopicController::getAll")
    return ResponseEntity(topicService.getAll(), HttpStatus.OK).also {
      LOGGER.info("--TopicController::getAll --Response: [${jacksonObjectMapper().writeValueAsString(it.body)}}]")
    }
  }
}