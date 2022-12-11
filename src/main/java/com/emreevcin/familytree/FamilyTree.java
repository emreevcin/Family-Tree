package com.emreevcin.familytree;

public class FamilyTree {
    private Person[] members;
    private Relation[] relations;

    public FamilyTree(Person[] members, Relation[] relations) {
        this.members = members;
        this.relations = relations;
    }

    public Person[] getMembers() {
        return members;
    }

    public void setMembers(Person[] members) {
        this.members = members;
    }

    public Relation[] getRelations() {
        return relations;
    }

    public void setRelations(Relation[] relations) {
        this.relations = relations;
    }
}
