package com.acait.lecture.model;

import com.acait.lecture.entity.Lecture;
import com.acait.lecture.entity.PaymentMethod;
import com.acait.lecture.entity.Subject;

import java.math.BigDecimal;
import java.time.LocalDate;

public record LectureResponseDto(
        Long lectureId,

        // 기본 정보
        String name,
        Subject subject,
        Integer studentCount,
        String description,

        // 수업 일정
        LocalDate startDate,
        LocalDate endDate,
        Integer totalSessions,
        Integer minutesPerSession,

        // 수업료 설정
        PaymentMethod paymentMethod,
        BigDecimal feePerSession
) {
    // Entity로부터 DTO 생성하는 정적 팩토리 메서드
    public static LectureResponseDto from(Lecture lecture) {
        return new LectureResponseDto(
                lecture.getLectureId(),
                lecture.getName(),
                lecture.getSubject(),
                lecture.getStudentCount(),
                lecture.getDescription(),
                lecture.getStartDate(),
                lecture.getEndDate(),
                lecture.getTotalSessions(),
                lecture.getMinutesPerSession(),
                lecture.getPaymentMethod(),
                lecture.getFeePerSession()
        );
    }
}
