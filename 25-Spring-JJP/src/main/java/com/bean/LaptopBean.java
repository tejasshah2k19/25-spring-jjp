package com.bean;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter 
//@Data 
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LaptopBean {

	Integer laptopId;
	
	@NotBlank(message = "Please Enter Model Name")
	String modelName;
	
	@NotNull(message="Please Enter RAM ")
	Integer ram;
	
	@NotNull(message = "Please Enter Price")
	Integer price;
	
	@NotNull(message = "Please Enter SSD")
	Integer ssd;
 }
