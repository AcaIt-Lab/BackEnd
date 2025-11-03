package com.acait.lecture.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Subject {
    KOREAN("국어"),
    ENGLISH("영어"),
    MATH("수학"),
    SOCIAL("사회"),
    SCIENCE("과학");

    private final String value;
}
