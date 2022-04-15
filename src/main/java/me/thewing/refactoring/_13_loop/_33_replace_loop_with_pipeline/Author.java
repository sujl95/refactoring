package me.thewing.refactoring._13_loop._33_replace_loop_with_pipeline;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Author {

    private String company;

    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    public static List<String> TwitterHandles(List<Author> authors, String company) {
        return authors.stream()
            .filter(a -> a.company.equals(company))
            .map(a -> a.twitterHandle)
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
    }

}
