package io.github.talentdevelopment004.optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        // APi client
        var apiClient = new Main();
        EmployeeRepository repository = new EmployeeRepository();
        Optional<Employee> employeeById = repository.findById(10L);
        System.out.println(employeeById);

        System.out.println("further processing.....");
        System.out.println(repository.findOne(5L));
        Employee employee = new Employee(1L, "Amani");
        employee.setEmail("example@mail.com");
        apiClient.processUser(Optional.of(employee));

        // Checking the value

        if (employeeById.isPresent()) {
            // get the value
            Employee employee2 = employeeById.get();
            System.out.println("Working on presence of an employee value...x" + employee2);
        }

        ConfigRepository configRepository = new ConfigRepository();
        Config config = configRepository.getCurrentConfig(1L)
                .orElse(new Config(5L, "my custom username ", "my password"));

        System.out.println(config);

        System.out.println(configRepository.getCurrentConfig(10L)
                .orElseGet(
                        () -> {

                            return new Config(5L, "my custom username ", "my password");
                        }));
        // configRepository.getCurrentConfig(10L).orElseThrow();
        configRepository.getCurrentConfig(10L)
                .orElseThrow(() -> new ConfigNotFoundException("The value with id 10 is not available"));

    }

    public void processUser(Employee employee) {
        // Dangerous - potential NPE
        // String name = employee.getName().toUpperCase();
        // String email = employee.getEmail().toLowerCase();

        // Defensive programming - verbose
        if (employee != null && employee.getName() != null && employee.getEmail() != null) {
            // Safe to use
            System.out.println("Processing ..." + employee);
        }
    }

    public void processUser(Optional<Employee> employee) {
        // Dangerous - potential NPE
        // String name = employee.getName().toUpperCase();
        // String email = employee.getEmail().toLowerCase();

        // Defensive programming - verbose
        // Since java 9+
        employee.ifPresentOrElse(
                emp -> {
                    // action if employee is not null
                },
                () -> {
                    // action if employee is null
                });

        employee.ifPresent(emp -> {
            // Safe to use
            System.out.println("Processing on Optional..." + emp);
        });

    }
}
