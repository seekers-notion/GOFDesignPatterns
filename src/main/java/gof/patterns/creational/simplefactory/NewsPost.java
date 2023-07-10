package gof.patterns.creational.simplefactory;

import java.time.LocalDate;

import lombok.Data;

/*
 * Represents a news post.
 */
@Data
public class NewsPost extends Post {

	private String headline;

	private LocalDate newsTime;

}
