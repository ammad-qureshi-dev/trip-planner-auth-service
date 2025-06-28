package com.trip_planner.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginFormDto {
    @NonNull
    private String email;

    @NonNull
    private String password;
}
