package com.example.demoadhar.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor


@Getter
@Setter

public class AdharcenterDto {
	private Integer id;
	private Integer code;
	private String city;
	
	private UserDto userDto;
	
	private AdharcenterDto (){
		
		
	}
	@Override
	public String toString() {
		return "AdharcenterDto [center_id=" + id + ", code=" + code + ", city=" + city + ", userDto=" + userDto
				+ "]";
	
	}
}
