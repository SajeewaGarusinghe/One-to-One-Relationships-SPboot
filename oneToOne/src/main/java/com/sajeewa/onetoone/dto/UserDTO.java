package com.sajeewa.onetoone.dto;

import com.sajeewa.onetoone.Entity.Address;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private long uid;
    private String userName;
    private String dob;
    private AddressDTO address;
}
