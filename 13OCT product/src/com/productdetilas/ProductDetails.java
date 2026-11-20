package com.productdetilas;

public class ProductDetails {
	
	public static void main(String[] args) {
		
		Customer cust = new Customer();
		cust.cid = 87;
		cust.cname = "Rahul";
		cust.contact = 8308879632l;
		
		cust.order.oid = 21;
		cust.order.oname = "XYZ";
		
		cust.order.pro.pid = 321;
		cust.order.pro.pname = "Cricket Bat";
		cust.order.pro.price = 2038.89;
		
		System.out.println(cust.cid+" "+ cust.cname+ " "+ cust.contact);
		System.out.println(cust.order.oid+" "+cust.order.oname);
		System.out.println(cust.order.pro.pid+" "+ cust.order.pro.pname+" "+ cust.order.pro.price);
		
	}

}
