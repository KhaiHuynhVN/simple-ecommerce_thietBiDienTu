package com.dustincode.ecommerce.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDetailDTO {
    private String fullName;
    private String email;
    private String phone;
    private String address;
}
