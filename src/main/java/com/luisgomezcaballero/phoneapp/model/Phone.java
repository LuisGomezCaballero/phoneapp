package com.luisgomezcaballero.phoneapp.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String image;
	private String name;
	private String description;
	private BigDecimal price;
	@ManyToOne(fetch = FetchType.LAZY)
	private ShopOrder order;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public ShopOrder getOrder() {
		return order;
	}

	public void setOrder(ShopOrder order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", image=" + image + ", name=" + name + ", description=" + description + ", price="
				+ price + ", order=" + order + "]";
	}

}
