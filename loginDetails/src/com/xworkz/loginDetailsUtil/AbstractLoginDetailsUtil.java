package com.xworkz.loginDetailsUtil;

import com.xworkz.loginDetailsDto.LoginDetailsDto;

public abstract class AbstractLoginDetailsUtil {
    public abstract boolean validateName(String userName);
    public abstract boolean validateEmail(String email);
    public abstract boolean validatePassword(String password);
    public abstract boolean duplicateCheck(LoginDetailsDto[] listOfLoginDetails,LoginDetailsDto loginDetailsDto);
}
