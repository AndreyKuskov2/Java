package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        PhoneRepository phoneRepository = context.getBean(PhoneRepository.class);

        addInitialData(phoneRepository);

        Iterable<Phone> phones = phoneRepository.findAll();

        System.out.println("ВЫВОД ДАННЫХ:");
        for (Phone phone : phones) {
            System.out.println(phone.getManufacturer() + " " +
                    phone.getModel() + " " +
                    phone.getYear() + " " +
                    phone.getScreenDiagonal());
        }
        context.close();
    }

    private static void addInitialData(PhoneRepository phoneRepository) {
        String[] manufacturers = {"Apple", "Samsung", "Google", "Xiaomi", "Huawei"};
        String[] models = {"iPhone", "Galaxy", "Pixel", "Redmi", "P30"};
        int[] years = {2019, 2020, 2021, 2022, 2023};
        double[] screenDiagonals = {6.1, 6.4, 5.8, 6.5, 6.7};

        for (int i = 0; i < 10; i++) {
            int index = i % manufacturers.length;

            Phone phone = new Phone();
            phone.setManufacturer(manufacturers[index]);
            phone.setModel(models[index]);
            phone.setYear(years[index]);
            phone.setScreenDiagonal(screenDiagonals[index]);

            phoneRepository.save(phone);
        }
    }
}
