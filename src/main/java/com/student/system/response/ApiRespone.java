package com.student.system.response;

import com.student.system.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class ApiRespone<T> {
    int recordCount;
    T response;

    public ApiRespone(int recordCount, T response) {
        this.recordCount = recordCount;
        this.response = response;
    }
}
