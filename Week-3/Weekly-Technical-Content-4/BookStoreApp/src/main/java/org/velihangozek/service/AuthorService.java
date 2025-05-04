package org.velihangozek.service;

import org.velihangozek.model.Author;
import org.velihangozek.model.enums.Gender;

import java.util.HashMap;
import java.util.Map;

public class AuthorService {

    private static Map<String, Author> authors = new HashMap();

    public void create(String firstName, String lastName, Gender gender) {

        Author author = new Author(firstName, lastName, gender);
        authors.put(author.getFirstName(), author);

    }

    public Author findAuthor(String name) {
        return authors.get(name);
    }


}