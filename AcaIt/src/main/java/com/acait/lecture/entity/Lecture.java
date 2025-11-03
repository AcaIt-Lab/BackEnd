package com.acait.lecture.entity;

import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lectureId;     // ID (Key)

    // 기본 정보
    private String name;                    // 이름
    @Enumerated(EnumType.STRING)
    private Subject subject;                // 과목 Enum
    private Integer studentCount;           // 학생 수
    private String description;             // 설명

    // 수업 일정
    private LocalDate startDate;            // 수업 시작일
    private LocalDate endDate;              // 수업 종료일
    private Integer totalSessions;          // 총 회차
    private Integer minutesPerSession;      // 회차당 수업 시간 (분)

    // 수업료 설정
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;    // 납부 방식 (Enum)
    private BigDecimal feePerSession;       // 회차당 수업료(원)
}
