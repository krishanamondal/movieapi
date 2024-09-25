package com.mondal.mondal_shop.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserRequest {
    private String firstName;
    private String lastName;
    private String username;
    private String password;

}
