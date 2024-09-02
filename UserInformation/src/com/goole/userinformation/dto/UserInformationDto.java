package com.goole.userinformation.dto;

import com.google.userinformation.constant.GenderConstant;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class UserInformationDto {
   private String userName;
   private String emailId;
   private long contactNumber;
   private int age;
   private String education;
   private GenderConstant gender;
   private String designation;
   private String address;
   private long adharCardNumber;
}
