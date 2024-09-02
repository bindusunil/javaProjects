package com.xworkz.loginDetailsService;

import com.xworkz.loginDetailsDto.LoginDetailsDto;

public abstract class AbstractLoginDetails {
    public abstract String validateAndSave(LoginDetailsDto logindetailsDto);
    public abstract void read();
    public abstract String searchByName(String name);
	public abstract String update(String oldName,String newName);
	public abstract String update(String oldname,LoginDetailsDto dto,String newName);
	//public abstract String delete(String name);

}
