package com.omg.omgWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCloth {

	private String name;
	private double price;
	private String type;
	private String size;
	private int quantity;
}
