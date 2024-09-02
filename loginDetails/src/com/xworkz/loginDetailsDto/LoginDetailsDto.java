package com.xworkz.loginDetailsDto;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class LoginDetailsDto {
      private String useName;
      private String email;
      private String Password;
      private LocalDateTime loginDateTime;

}
