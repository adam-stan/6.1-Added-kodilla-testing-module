package com.kodilla.spring.portfolio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    @Bean(name = "toDo")
    public TaskList getToDoList(){
        return toDoList = new TaskList();
    }

    @Bean(name = "inProgress")
    public TaskList getInProgressList(){
        return inProgressList = new TaskList();
    }

    @Bean(name = "done")
    public TaskList getDoneList(){
        return doneList = new TaskList();
    }

    @Bean(name = "board")
    @Scope("prototype")
    public Board createBoard(){
        return new Board(toDoList, inProgressList, doneList);
    }
}
