package com.example.mylist;

public class RowItem {

	private int img;
	private String name;
	private String lctn;
	private double phone ;
	
	public RowItem(int img,String name,String lctn,double phone)
	{
		
		this.img=img;
		this.lctn=lctn;
		this.name=name;
		this.phone=phone;
	}
	
	public void setImg(int img){
		this.img=img;
	}
	public int getImg()
	{
		return img;
	}
	
	public void setLocation(String lctn)
	{
		this.lctn=lctn;
	}
	public String getLocation(){
		return lctn;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setPhone(double phone){
		this.phone=phone;
	}
	public double getPhone()
	{
		return phone;
	}
	
}//class
