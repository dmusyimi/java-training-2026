package io.github.talentdevelopment004.optionals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EmployeeRepository extends Repository<Employee, Long> {
    // private final EmployeeJpaRepository employeeJpaRepository;

    // public EmployeeRepository(EmployeeJpaRepository employeeJpaRepository) {
    // this.employeeJpaRepository = employeeJpaRepository;
    // }

    private Map<Long, Employee> employeeMap = new HashMap<>();

    public EmployeeRepository() {
        employeeMap.put(1L, new Employee(1L, "Steve"));
        employeeMap.put(2L, new Employee(2L, "Sandra"));
        employeeMap.put(3L, new Employee(5L, "Tamiron"));
        employeeMap.put(4L, new Employee(4L, "Purity"));
        employeeMap.put(5L, new Employee(5L, "Joel"));
        employeeMap.put(6L, new Employee(3L, "Elisha"));
    }

    public Optional<Employee> findById(Long id) {
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            // creating optional with an object
            return Optional.of(employee);

        } else {
            // creating empty optional
            return Optional.empty();
        }

    }

    public Optional<Employee> findOne(Long id) {
        return employeeMap.values().stream()
                .filter(employee -> employee.getId() == id)
                .findFirst();
    }
}
