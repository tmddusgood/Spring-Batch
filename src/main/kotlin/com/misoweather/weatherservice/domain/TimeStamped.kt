package com.misoweather.weatherservice.domain

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class TimeStamped(

    @CreatedDate
    @Column(name = "CREATED_DATE")
    var createdAt: LocalDateTime? = null,

    @LastModifiedDate
    @Column(name = "MODIFIED_DATE")
    var updatedAt: LocalDateTime? = null,
)