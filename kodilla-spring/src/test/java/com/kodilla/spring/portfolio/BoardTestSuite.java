package com.kodilla.spring.portfolio;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;

public class BoardTestSuite {

    @Test
    void testToDoListLoading() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        BoardConfig boardConfig = context.getBean(BoardConfig.class);
        //When
        boardConfig.createBoard();
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");

        //Then
        //do nothing
    }

    @Test
    void testTaskAdd1() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        //When
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");

        //Then

        board.getToDoList().


        BoardConfig boardConfig = new BoardConfig();
        boardConfig.createBoard();
        TaskList getToList = boardConfig.getToDoList();
        getToList.




        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");

    }

}
