package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyEmployeeException.class);

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> getCompanyByPartName(String name) throws CompanyEmployeeException {
        List<Company> companies = companyDao.findCompanyByPartName(name);
        boolean wasError = false;
        LOGGER.info("Searching companies by part name.");
        if (companies.size() <= 0) {
            LOGGER.error(CompanyEmployeeException.ERR_COMPANY_NOT_FOUND);
            wasError = true;
            if (wasError)
                LOGGER.info("Errors occured during process.");
            throw new CompanyEmployeeException(CompanyEmployeeException.ERR_COMPANY_NOT_FOUND);
        } else {
            return companies;
        }
    }

    public List<Employee> findEmployeeByPartLastname(String lastname) throws CompanyEmployeeException {
        List<Employee> employees = employeeDao.findByPartLastname(lastname);
        boolean wasError = false;
        LOGGER.info("Searching employees by part lastname");
        if (employees.size() <= 0) {
            LOGGER.error(CompanyEmployeeException.ERR_EMPLOYEE_NOT_FOUND);
            if (wasError)
                LOGGER.info("Errors occured during process.");
            throw new CompanyEmployeeException(CompanyEmployeeException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            return employees;
        }
    }
}
