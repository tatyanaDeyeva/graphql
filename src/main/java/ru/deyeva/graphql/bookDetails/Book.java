package ru.deyeva.graphql.bookDetails;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class Book {

    private String id;
    private String name;
    private int pageCount;
    private String authorId;

    public Book(String id, String name, int pageCount, String authorId) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }

    private static final List<Book> books = Arrays.asList(
            new Book("1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
            new Book("2", "Moby Dick", 635, "author-2"),
            new Book("3", "Interview with the vampire", 371, "author-3")
    );

    public static Book getById(String id) {
        log.info("Get by " + id);
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }
}
