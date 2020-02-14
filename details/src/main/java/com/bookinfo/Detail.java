package com.bookinfo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Detail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String author;
	private int year;
	private String type;
	private int pages;
	private String publisher;
	private String language;
	private String ISBN_10;
	private String ISBN_13;
	public Detail(int id, String author, int year, String type, int pages, String publisher, String language,
			String iSBN_10, String iSBN_13) {
		super();
		this.id = id;
		this.author = author;
		this.year = year;
		this.type = type;
		this.pages = pages;
		this.publisher = publisher;
		this.language = language;
		ISBN_10 = iSBN_10;
		ISBN_13 = iSBN_13;
	}

}
