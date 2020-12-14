package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(@Qualifier("toDo") TaskList toDoList,
                 @Qualifier("inProgress") TaskList inProgressList,
                 @Qualifier("done") TaskList doneList)
    {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

}
