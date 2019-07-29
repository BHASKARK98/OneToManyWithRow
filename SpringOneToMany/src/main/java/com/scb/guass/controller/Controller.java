package com.scb.guass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.guass.model.Acc;
import com.scb.guass.model.Accounts;
import com.scb.guass.model.Groups;
import com.scb.guass.repository.GroupRepository;

@RestController
public class Controller {
	
	@Autowired
	GroupRepository custRes;
	
	@RequestMapping("/findall/{id}")
	public List<Accounts> findAll(@PathVariable Long id)
	{
		return custRes.findAllOrderWithItems(id);
		
	}
	
	@RequestMapping("/find/{id}")
	public List<Accounts> find(@PathVariable Long id)
	{
		return custRes.findOrderWithItem(id);
		
	}
	

}
