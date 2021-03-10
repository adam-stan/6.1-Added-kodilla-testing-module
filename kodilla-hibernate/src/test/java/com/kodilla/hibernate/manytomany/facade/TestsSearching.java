package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestsSearching {

    @Autowired
    private Facade facade;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    @Transactional
    public void testFindEmployeesByPartOfName() throws CompanyEmployeeException {

        //Given
        Employee employee1 = new Employee("Jan", "Kowal");
        Employee employee2 = new Employee("Leon", "Paczek");
        Company company1 = new Company("Super Softłer");
        Company company2 = new Company("Najs soluszyns");

        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee2);
        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);

        employeeDao.save(employee1);
        employeeDao.save(employee2);

        //When
        List<Employee> employees1 = facade.findEmployeeByPartLastname("Kow");
        List<Employee> employees2 = facade.findEmployeeByPartLastname("Pacz");

        //Then
        Assert.assertEquals(1, employees1.size());
        Assert.assertEquals(1, employees2.size());

        //CleanUp
        employeeDao.deleteAll();
        companyDao.deleteAll();
    }

    @Test
    @Transactional
    public void testFindCompaniesByPartOfName() throws CompanyEmployeeException {
        //Given
        Employee employee1 = new Employee("Jan", "Kowal");
        Employee employee2 = new Employee("Leon", "Paczek");
        Company company1 = new Company("Super Softłer");
        Company company2 = new Company("Najs soluszyns");

        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee2);
        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);

        companyDao.save(company1);
        companyDao.save(company2);

        //When
        List<Company> companies1 = facade.getCompanyByPartName("Sup");
        List<Company> companies2 = facade.getCompanyByPartName("Naj");

        //Then
        Assert.assertEquals(1, companies1.size());
        Assert.assertEquals(1, companies2.size());

        //CleanUp
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }
}
