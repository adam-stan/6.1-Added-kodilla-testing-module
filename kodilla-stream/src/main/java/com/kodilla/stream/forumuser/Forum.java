package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final ArrayList<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(2346, "kuba", 'M',1992,2, 13, 12));
        forumUserList.add(new ForumUser(2736, "krzysiek", 'M', 1983, 9, 15, 21));
        forumUserList.add(new ForumUser(1126, "piotr", 'M', 1987, 4, 20, 33));
        forumUserList.add(new ForumUser(6379, "dariusz", 'M', 1995, 11, 12, 0));
        forumUserList.add(new ForumUser(1423, "jerzy", 'M', 1976, 5, 21, 5));
    }

    public ArrayList<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
