package com.mobile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mobile.entity.Mobile;

public interface MobileRepository extends JpaRepository <Mobile, Integer>{

	

	

	@Query(value= "SELECT brand, color FROM mobiletable.mob_table", nativeQuery=true)
	List<String> find();

	
	
@Query(value= "SELECT * from mobiletable.mob_table where price>45000", nativeQuery=true)
	List<Mobile> find1(List<Mobile> m);

@Query(value="SELECT * from mobiletable.mob_table where brand=\"Samsung\"", nativeQuery=true)
List<Mobile> find2(List<Mobile> m);

@Query(value="SELECT brand, color from mobiletable.mob_table where price between 25000 and 35000",nativeQuery=true)
List<String> find3(List<Mobile> m);

@Query(value="SELECT max(price) from mobiletable.mob_table", nativeQuery=true)
Integer find4(List<Mobile> m);


@Query(value="SELECT * from mobiletable.mob_table where price>?", nativeQuery=true)
List<Mobile> find5(int m);


@Query(value="SELECT * from mobiletable.mob_table where price=(SELECT max(price) from mobiletable.mob_table)",nativeQuery=true)
Mobile find6(List<Mobile> m);


@Query(value="SELECT * from mobiletable.mob_table where price=(SELECT max(price) from mobiletable.mob_table where price <(Select max(price) from mobiletable.mob_table))",nativeQuery=true)
Mobile find7(List<Mobile> m);


@Query(value="SELECT * from mobiletable.mob_table where brand like concat (?,'%')",nativeQuery=true)
List<String> find8(char m);


@Query(value="SELECT * from mobiletable.mob_table where brand like concat ('%',?,'%')",nativeQuery=true)
List<String> find9(char m);


@Query(value="Select * from mobiletable.mob_table where brand like concat ('%',?,'_','_')",nativeQuery=true)
List<String> find10(char m);


@Query(value="Select E.brand,E.color,E.price from Mobile E")
List<String> jpqlbrand();


@Query(value="Select E from Mobile E where E.price>25000 and E.price<35000")
List<Mobile> jpqlpricebet();


@Query(value="Select E from Mobile E where E.price=(Select max(price) from Mobile E)")
Mobile jpqlmaxobj(List<Mobile> m);


@Query(value="Select E from Mobile E where E.brand like concat (:a,'%')")
List<Mobile> jpqlchar(@Param("a")char m);


@Query("Select E from Mobile E where E.price=?1")
List<Mobile> jpqlprice(int m);


@Query(value="Select E from Mobile E where E.price between ?1 and ?2")
List<Mobile> jpqlpricebetrange(int r, int n);


@Query(value="select E from Mobile E")
List<Mobile> getall();

}
