package com.omg.omgWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCloth {

	private String name;
	private String price;
	private ItemType type;
}