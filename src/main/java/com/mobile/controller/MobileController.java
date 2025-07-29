package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@RequestMapping(value="/mob/api")
public class MobileController {
@Autowired
MobileService ms;
@PostMapping(value="/postall")
public String postall(@RequestBody List<Mobile> m) {
	return ms.postall(m);
}
@GetMapping(value="/getall")
public List<Mobile> getall(){
	return ms.getall();
}
@GetMapping("/brand")
public List<String> brand() {
	return ms.brand();
}
@GetMapping("/price")
public List<Mobile> price(@RequestBody List<Mobile> m){
	return ms.price(m);
}
@GetMapping("/brandname")
public List<Mobile> brandname(@RequestBody List<Mobile> m){
	return ms.brandname(m);
}
@GetMapping("/pricebet")
public List<String> pricebet(@RequestBody List<Mobile> m){
	return ms.pricebet(m);
}
@GetMapping("/maxprice")
public Integer maxprice(@RequestBody List<Mobile> m) {
	return ms.maxprice(m);
}
@GetMapping("/pricesel/{m}")
public List<Mobile> pricesel(@PathVariable int m){
	return ms.pricesel(m);
}
@GetMapping("/maxobj")
public Mobile maxobj(@RequestBody List<Mobile> m) {
	return ms.maxobj(m);
}

@GetMapping("/secondmaxobj")
public Mobile secondmaxobj(@RequestBody List<Mobile> m) {
	return ms.secondmaxobj(m);
}

@GetMapping("/char/{m}")
public List<String> charstart(@PathVariable char m){
	return ms.charstart(m);
}

@GetMapping("/allchar/{m}")
public List<String> allchar(@PathVariable char m){
	return ms.allchar(m);
}
@GetMapping("/singlechar/{m}")
public List<String> singlechar(@PathVariable char m){
	return ms.singlechar(m);
}
@GetMapping("/jpql/brand")
public List<String> jpqlbrand(){
	return ms.jpqlbrand();
}
@GetMapping("/jpql/pricebet")
public List<Mobile> jpqlpricebet(){
	return ms.jpqlpricebet();
}
@GetMapping("/jpql/maxobj")
public Mobile jpqlmaxobj(@RequestBody List<Mobile> m) {
	return ms.jpqlmaxobj(m);
}
@GetMapping("/jpql/char/{m}")
public List<Mobile> jpqlchar(@PathVariable char m){
	return ms.jpqlchar(m);
}
@GetMapping("/jpql/price/{m}")
public List<Mobile> jpqlprice(@PathVariable int m){
	return ms.jpqlprice(m);
}
@GetMapping("/jpql/pricebetrange/{r}/{n}")
public List<Mobile> jpqlpricebetrange(@PathVariable int r, @PathVariable int n){
	return ms.jpqlpricebetrange(r,n);
}
}
