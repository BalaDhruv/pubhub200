package com.bala.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "stu_details")
public class Student {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "mark1")
	private Integer mark1;

	@Column(name = "mark2")
	private Integer mark2;

	@Column(name = "mark3")
	private Integer mark3;

	@Column(name = "total")
	private Integer total;

	@Column(name = "aveg")
	private Integer aveg;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMark1() {
		return mark1;
	}

	public void setMark1(Integer mark1) {
		this.mark1 = mark1;
	}

	public Integer getMark2() {
		return mark2;
	}

	public void setMark2(Integer mark2) {
		this.mark2 = mark2;
	}

	public Integer getMark3() {
		return mark3;
	}

	public void setMark3(Integer mark3) {
		this.mark3 = mark3;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getAveg() {
		return aveg;
	}

	public void setAveg(Integer aveg) {
		this.aveg = aveg;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3
				+ ", total=" + total + ", aveg=" + aveg + "]";
	}

}
