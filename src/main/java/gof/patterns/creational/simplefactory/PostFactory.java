package gof.patterns.creational.simplefactory;

/*
 * This class acts as a simple factory
 * 	for the creation of different posts 
 * 	on web site.
 */
public class PostFactory {

	public static  Post createPost(String type) {
		switch(type) {
		case "blog":
			return new BlogPost();
		case "news":
			return new NewsPost();
		case "product":
			return new ProductPost();
		default:
			throw new IllegalArgumentException("Post type is unknown.");
		}
	}
}
