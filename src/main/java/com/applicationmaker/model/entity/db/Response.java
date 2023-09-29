package com.applicationmaker.model.entity.db;


import com.applicationmaker.model.entity.db.enums.DB;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Response {
    private DB db;
    private String dependency;
    private String driverClass;
    private String connectionString;


}
