package common_utils;

import com.github.javafaker.Faker;

public class FakerUtils {
    private static final Faker faker = new Faker();

    public String fakeName(){
        Faker faker = new Faker();
        return faker.regexify("[A-Z][a-z]{2,19}");
    }
    public static String fakePassword(){
        return faker.internet().password();
    }
    public static String fakeEmail(){
        return faker.internet().emailAddress();
    }
}
