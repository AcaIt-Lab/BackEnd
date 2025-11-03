package com.acait.lecture.model;

import com.acait.lecture.entity.Lecture;
import com.acait.lecture.entity.PaymentMethod;
import com.acait.lecture.entity.Subject;

import java.math.BigDecimal;
import java.time.LocalDate;

public record LectureCreateRequestDto(
        String name,
        Subject subject,
        Integer studentCount,
        String description,
        LocalDate startDate,
        LocalDate endDate,
        Integer totalSessions,
        Integer minutesPerSession,
        PaymentMethod paymentMethod,
        BigDecimal feePerSession
) {
    public LectureCreateRequestDto {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("강의명은 필수입니다.");
        }
        if (startDate != null && endDate != null && startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("시작일은 종료일보다 이전이어야 합니다.");
        }
    }

    public Lecture toEntity() {
        return Lecture.builder()
                .name(this.name)
                .subject(this.subject)
                .studentCount(this.studentCount)
                .description(this.description)
                .startDate(this.startDate)
                .endDate(this.endDate)
                .totalSessions(this.totalSessions)
                .minutesPerSession(this.minutesPerSession)
                .paymentMethod(this.paymentMethod)
                .feePerSession(this.feePerSession)
                .build();
    }
}
