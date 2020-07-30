package com.nem.docms.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "Ad_payment")
public class Advance {
	
	@Id
	private String id;
	private String name;
	private Long amount;
	//give a standard format and remove time
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date effective;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date expire;
	private String status;
	private Long remain;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRemain() {
		return remain;
	}

	public void setRemain(Long remain) {
		this.remain = remain;
	}

	public Advance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Date getEffective() {
		return effective;
	}

	public void setEffective(Date effective) {
		this.effective = effective;
	}

	public Date getExpire() {
		return expire;
	}

	public void setExpire(Date expire) {
		this.expire = expire;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Advance(String id, String name, Long amount, Date effective, Date expire, String status, Long remain) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.effective = effective;
		this.expire = expire;
		this.status = status;
		this.remain = remain;
	}
	
	
}