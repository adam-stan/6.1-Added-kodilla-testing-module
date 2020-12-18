package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When
        System.out.println(board.getToDoList());
        System.out.println(board.getInProgressList());
        System.out.println(board.getDoneList());

        //Then
        System.out.println("Let's add new tasks to each TaskLists.");

        board.getToDoList().addTask("Something new");
        System.out.println(board.getToDoList());

        board.getInProgressList().addTask("Something new");
        System.out.println(board.getInProgressList());

        board.getDoneList().addTask("Something new");
        System.out.println(board.getDoneList());

        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");

        assertEquals("TaskList{tasks=[Something new]}", board.getToDoList().toString());
        assertEquals("TaskList{tasks=[Something new]}", board.getInProgressList().toString());
        assertEquals("TaskList{tasks=[Something new]}", board.getDoneList().toString());
    }
}
