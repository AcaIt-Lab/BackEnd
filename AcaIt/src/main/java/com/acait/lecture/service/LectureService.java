package com.acait.lecture.service;


import com.acait.lecture.entity.Lecture;
import com.acait.lecture.model.LectureCreateRequestDto;
import com.acait.lecture.model.LectureResponseDto;
import com.acait.lecture.repository.LectureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LectureService {

    private final LectureRepository lectureRepository;

    public LectureResponseDto create(LectureCreateRequestDto requestDto){
        Lecture lecture = requestDto.toEntity();
        Lecture savedLecture = lectureRepository.save(lecture);
        return LectureResponseDto.from(savedLecture);
    }
}
