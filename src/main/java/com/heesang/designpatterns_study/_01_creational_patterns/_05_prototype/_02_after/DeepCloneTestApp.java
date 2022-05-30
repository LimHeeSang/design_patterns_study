package com.heesang.designpatterns_study._01_creational_patterns._05_prototype._02_after;

public class DeepCloneTestApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("heesang");
        repository.setName("design-patterns-study");

        DeepGithubIssue deepGithubIssue = new DeepGithubIssue(repository);
        deepGithubIssue.setId(1);
        deepGithubIssue.setTitle("1주차: singleton 패턴이란 무엇인가.");

        DeepGithubIssue cloneDeepGithubIssue = (DeepGithubIssue) deepGithubIssue.clone();
        repository.setUser("yuna");

        System.out.println(cloneDeepGithubIssue != deepGithubIssue);
        System.out.println(cloneDeepGithubIssue.equals(deepGithubIssue));
        System.out.println(cloneDeepGithubIssue.getClass() == deepGithubIssue.getClass());
        System.out.println(cloneDeepGithubIssue.getRepository() == deepGithubIssue.getRepository());

        System.out.println(deepGithubIssue.getUrl());
        System.out.println(cloneDeepGithubIssue.getUrl());
    }
}
