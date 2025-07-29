package com.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;

@Service
public class MobileService {
@Autowired
MobileDao md;
	
	public String postall(List<Mobile> m) {
		// TODO Auto-generated method stub
		return md.postall(m);
	}

	public List<String> brand() {
		// TODO Auto-generated method stub
		return md.brand();
	}

	public List<Mobile> price(List<Mobile> m) {
		// TODO Auto-generated method stub
		return md.price(m);
	}

	public List<Mobile> brandname(List<Mobile> m) {
		// TODO Auto-generated method stub
		return md.brandname(m);
	}

	public List<String> pricebet(List<Mobile> m) {
		// TODO Auto-generated method stub
		return md.pricebet(m);
	}

	public Integer maxprice(List<Mobile> m) {
		// TODO Auto-generated method stub
		return md.maxprice(m);
	}

	public List<Mobile> pricesel(int m) {
		// TODO Auto-generated method stub
		return md.pricesel(m);
	}

	public Mobile maxobj(List<Mobile> m) {
		// TODO Auto-generated method stub
		return md.maxobj(m);
	}

	public Mobile secondmaxobj(List<Mobile> m) {
		// TODO Auto-generated method stub
		return md.secondmaxobj(m);
	}

	public List<String> charstart(char m) {
		// TODO Auto-generated method stub
		return md.charstart(m);
	}

	public List<String> allchar(char m) {
		// TODO Auto-generated method stub
		return md.allchar(m);
	}

	public List<String> singlechar(char m) {
		// TODO Auto-generated method stub
		return md.singlechar(m);
	}

	public List<String> jpqlbrand() {
		// TODO Auto-generated method stub
		return md.jpqlbrand();
	}

	public List<Mobile> jpqlpricebet() {
		// TODO Auto-generated method stub
		return md.jpqlpricebet();
	}

	public Mobile jpqlmaxobj(List<Mobile> m) {
		// TODO Auto-generated method stub
		return md.jpqlmaxobj(m);
	}

	public List<Mobile> jpqlchar(char m) {
		// TODO Auto-generated method stub
		return md.jpqlchar(m);
	}

	public List<Mobile> jpqlprice(int m) {
		// TODO Auto-generated method stub
		return md.jpqlprice(m);
	}

	public List<Mobile> jpqlpricebetrange(int r, int n) {
		// TODO Auto-generated method stub
		return md.jpqlpricebetrange(r,n);
	}

	public List<Mobile> getall() {
		// TODO Auto-generated method stub
		return md.getall();
	}
	
}
