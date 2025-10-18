package com.acait.exception;


import com.acait.domain.dto.response.ResultResponse;
import com.acait.domain.type.FailedResultType;
import lombok.Getter;

@Getter
public class GlobalException extends RuntimeException {

  private final ResultResponse resultResponse;

  public GlobalException(FailedResultType failedResultCode) {
    super("");
    this.resultResponse = ResultResponse.of(failedResultCode);
  }

  public GlobalException(ResultResponse resultResponse) {
    super("");
    this.resultResponse = resultResponse;
  }

}
