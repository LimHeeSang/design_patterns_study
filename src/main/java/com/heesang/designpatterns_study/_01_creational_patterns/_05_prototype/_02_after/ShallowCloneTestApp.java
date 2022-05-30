package com.heesang.designpatterns_study._01_creational_patterns._05_prototype._02_after;

public class ShallowCloneTestApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("heesang");
        repository.setName("design-patterns-study");

        ShallowGithubIssue deepGithubIssue = new ShallowGithubIssue(repository);
        deepGithubIssue.setId(1);
        deepGithubIssue.setTitle("1주차: singleton 패턴이란 무엇인가.");

        ShallowGithubIssue cloneShallowGithubIssue = (ShallowGithubIssue) deepGithubIssue.clone();
        repository.setUser("yuna");

        System.out.println(cloneShallowGithubIssue != deepGithubIssue);
        System.out.println(cloneShallowGithubIssue.equals(deepGithubIssue));
        System.out.println(cloneShallowGithubIssue.getClass() == deepGithubIssue.getClass());
        System.out.println(cloneShallowGithubIssue.getRepository() == deepGithubIssue.getRepository());

        System.out.println(deepGithubIssue.getUrl());
        System.out.println(cloneShallowGithubIssue.getUrl());
    }
}
