package dataCreations;

import com.github.javafaker.Faker;

public class DataCreations {

    public static String [] registrationDetails(){
        Faker faker = new Faker();

        String first_name = faker.name().firstName();
        String last_name = faker.name().lastName();
        String postal_code = faker.number().digits(5);

        return new String[]{first_name, last_name, postal_code};
    }
}
