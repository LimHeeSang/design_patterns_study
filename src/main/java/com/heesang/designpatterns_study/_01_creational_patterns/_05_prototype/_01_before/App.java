package com.heesang.designpatterns_study._01_creational_patterns._05_prototype._01_before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("heesang");
        repository.setName("design-patterns-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차: singleton 패턴이란 무엇인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);
    }
}
