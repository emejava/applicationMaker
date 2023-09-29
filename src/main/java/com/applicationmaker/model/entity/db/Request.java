package com.applicationmaker.model.entity.db;


import com.applicationmaker.model.entity.db.enums.DB;
import com.applicationmaker.model.entity.db.enums.Dependencies;
import com.applicationmaker.model.entity.db.enums.JDKVersion;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
public class Request {
    private DB db;
    private Dependencies selectedDependency;
    @Length(min = 3,max = 20 , message = "username can't be over 20 characters")
    private String dbUsername;
    @Length(min = 3, max = 20, message = "password can't be over 20 characters")
    private String dbPassword;
    @Length(min = 4, max = 12, message = "hostName (IP) can't be over 12 numbers or lower than 4 character | 255.255.255.255 -> max-length = 12 | 1.1.1.1 min-length = 4")
    private String hostName;
    @Length(min = 4, max = 4, message = "serverPort can't be over 4 characters")
    private String serverPort;
    @Length(min = 3,max = 20 , message = "table Name or DbName can't be over 20 characters")
    private String dbName ;
    private JDKVersion jdkVersion;
}
