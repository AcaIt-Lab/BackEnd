package com.acait.domain.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum FailedResultType {
  USER_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않은 사용자 입니다."),
  ;

  private final HttpStatus status;
  private final String message;
}
