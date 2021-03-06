package com.omg.omgWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omg.omgWebApp.model.ItemType;
import com.omg.omgWebApp.services.ItemTypeService;

@RestController
public class ItemTypeController {

	@Autowired
	private ItemTypeService itemTypeService;
	
	@GetMapping("/getAllTypes")
	public List<ItemType> getAllTypes(){
		return itemTypeService.getAllTypes();
	}
	
	@PostMapping(value = "/addType",consumes = { MediaType.APPLICATION_JSON_VALUE})
	public String addType(@RequestBody ItemType type)
	{
		this.itemTypeService.addType(type);
		return "Sucess";
	}
	
	@GetMapping("/dummyType")
	public ItemType getDummyItemType()
	{
		return new ItemType();
	}
}
