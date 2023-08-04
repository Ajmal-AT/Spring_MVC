package com.demo.mvc.DTO;


public class ViewIdDTO {
	private int u_id;

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	
	public ViewIdDTO() {
		System.out.println(this.getClass().getSimpleName()+" created");	
	}
}
