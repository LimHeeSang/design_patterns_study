package com.heesang.designpatterns_study._01_creational_patterns._05_prototype._02_after;

import java.util.Objects;

public class DeepGithubIssue implements Cloneable {

    private int id;

    private String title;

    private GithubRepository repository;

    public DeepGithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());

        DeepGithubIssue deepGithubIssue = new DeepGithubIssue(repository);
        deepGithubIssue.setId(this.id);
        deepGithubIssue.setTitle(this.title);

        return deepGithubIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeepGithubIssue that = (DeepGithubIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }
}
