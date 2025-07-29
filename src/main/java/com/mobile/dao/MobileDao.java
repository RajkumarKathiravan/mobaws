package com.mobile.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobile.entity.Mobile;
import com.mobile.repository.MobileRepository;

@Repository
public class MobileDao {
@Autowired
MobileRepository mr;

	public String postall(List<Mobile> m) {
		// TODO Auto-generated method stub
		mr.saveAll(m);
		return "Saved Successfully";
	}

	public List<String> brand() {
		// TODO Auto-generated method stub
		return mr.find();
	}

	public List<Mobile> price(List<Mobile> m) {
		// TODO Auto-generated method stub
		return mr.find1(m);
	}

	public List<Mobile> brandname(List<Mobile> m) {
		// TODO Auto-generated method stub
		return mr.find2(m);
	}

	public List<String> pricebet(List<Mobile> m) {
		// TODO Auto-generated method stub
		return mr.find3(m);
	}

	public Integer maxprice(List<Mobile> m) {
		// TODO Auto-generated method stub
		return mr.find4(m);
	}

	public List<Mobile> pricesel(int m) {
		// TODO Auto-generated method stub
		return mr.find5(m);
	}

	public Mobile maxobj(List<Mobile> m) {
		// TODO Auto-generated method stub
		return mr.find6(m);
	}

	public Mobile secondmaxobj(List<Mobile> m) {
		// TODO Auto-generated method stub
		return mr.find7(m);
	}

	public List<String> charstart(char m) {
		// TODO Auto-generated method stub
		return mr.find8(m);
	}

	public List<String> allchar(char m) {
		// TODO Auto-generated method stub
		return mr.find9(m);
	}

	public List<String> singlechar(char m) {
		// TODO Auto-generated method stub
		return mr.find10(m);
	}

	public List<String> jpqlbrand() {
		// TODO Auto-generated method stub
		return mr.jpqlbrand();
	}

	public List<Mobile> jpqlpricebet() {
		// TODO Auto-generated method stub
		return mr.jpqlpricebet();
	}

	public Mobile jpqlmaxobj(List<Mobile> m) {
		// TODO Auto-generated method stub
		return mr.jpqlmaxobj(m);
	}

	public List<Mobile> jpqlchar(char m) {
		// TODO Auto-generated method stub
		return mr.jpqlchar(m);
	}

	public List<Mobile> jpqlprice(int m) {
		// TODO Auto-generated method stub
		return mr.jpqlprice(m);
	}

	public List<Mobile> jpqlpricebetrange(int r, int n) {
		// TODO Auto-generated method stub
		return mr.jpqlpricebetrange(r,n);
	}

	public List<Mobile> getall() {
		// TODO Auto-generated method stub
		return mr.getall();
	}

}
