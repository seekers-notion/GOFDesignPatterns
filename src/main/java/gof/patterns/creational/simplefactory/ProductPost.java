package gof.patterns.creational.simplefactory;

import lombok.Data;

/*
 * Represents a product post
 */
@Data
public class ProductPost extends Post {

	private String imageUrl;

	private String name;
}
