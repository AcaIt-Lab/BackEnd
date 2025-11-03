package com.acait.lecture.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum PaymentMethod {
    SESSION_BASED("회차별"),      // 회차별 기준
    MONTHLY("월별"),              // 월 기준
    COUNT_BASED("횟수기준");      // 횟수 기준

    private final String description;
}
