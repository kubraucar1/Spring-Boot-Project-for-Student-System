package com.student.system.exceptions;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse<T,S>{

    int statusCode;
    String errorMessage;
}
