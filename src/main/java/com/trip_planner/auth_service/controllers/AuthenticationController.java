package com.trip_planner.auth_service.controllers;

import com.trip_planner.request.LoginFormDto;
import com.trip_planner.response.ServiceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.trip_planner.auth_service.utils.Constants.Endpoints.BASE_URL;
import static com.trip_planner.response.ServiceResponse.getServiceResponse;

@RestController
@RequestMapping(BASE_URL + "/auth")
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<Object> register() {
        return null;
    }

    @PostMapping("/login")
    public ResponseEntity<ServiceResponse<LoginFormDto>> login(@RequestBody LoginFormDto loginFormDto) {
        return getServiceResponse(true, loginFormDto, HttpStatus.OK);
    }
}
