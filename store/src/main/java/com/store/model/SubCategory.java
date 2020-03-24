package com.store.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sub_category")
public class SubCategory implements Serializable {

	private static final long serialVersionUID = 5023095536184413101L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sub_cat_id")
	private long subCategoryId;

	@Column(name = "sub_cat_name")
	private String subCategoryName;

	@ManyToOne
	@JoinColumn(name = "cat_id")
	private Category category;

	public SubCategory() {
		super();
	}

	public long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
