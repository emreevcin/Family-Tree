package com.emreevcin.familytree;

public class Relation {
    private Person p1;
    private Person p2;
    private String relationName;
    private Person[] children;

    public Relation(Person p1, Person p2, String relationName, Person[] children) {
        this.p1 = p1;
        this.p2 = p2;
        this.relationName = relationName;
        this.children = children;
    }

    public Person getP1() {
        return p1;
    }

    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public Person getP2() {
        return p2;
    }

    public void setP2(Person p2) {
        this.p2 = p2;
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public Person[] getChildren() {
        return children;
    }

    public void setChildren(Person[] children) {
        this.children = children;
    }
}
