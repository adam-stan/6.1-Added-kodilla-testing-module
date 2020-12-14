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
    void testTaskAdd() {

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




    }
}
