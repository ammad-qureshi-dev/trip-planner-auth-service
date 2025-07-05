package com.trip_planner.response;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceResponse<T> implements Serializable {
  private boolean isSuccess;
  private transient T data;
  private UUID requestId;
  private LocalDateTime requestCompletedAt;

  public static <T> ResponseEntity<ServiceResponse<T>> getServiceResponse(
      boolean isSuccess, T data, HttpStatus httpStatus) {
    var serviceResponse =
        ServiceResponse.<T>builder()
            .isSuccess(isSuccess)
            .data(data)
            .requestId(UUID.randomUUID())
            .requestCompletedAt(LocalDateTime.now())
            .build();

    return new ResponseEntity<>(serviceResponse, httpStatus);
  }
}
