package com.feignclient.user.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.feignclient.user.Model;


@FeignClient(url="https://coronavirus-19-api.herokuapp.com",name="FEIGN")
public interface FeignUserClient {
	
	@GetMapping("/countries")
	public List<Model> getCovidData();

}
