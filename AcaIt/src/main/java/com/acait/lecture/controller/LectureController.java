package com.acait.lecture.controller;

import com.acait.lecture.model.LectureCreateRequestDto;
import com.acait.lecture.model.LectureResponseDto;
import com.acait.lecture.service.LectureService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "강의 관리", description = "강의 생성, 조회, 수정, 삭제 API")
@RestController
@RequestMapping("/lecture")
@RequiredArgsConstructor
public class LectureController {

    private final LectureService lectureService;

    @Operation(summary = "강의 생성", description = "새로운 강의를 생성합니다.")
    @PostMapping("/create")
    public LectureResponseDto create(@RequestBody LectureCreateRequestDto lectureCreateRequestDto) {
        return lectureService.create(lectureCreateRequestDto);
    }
}
