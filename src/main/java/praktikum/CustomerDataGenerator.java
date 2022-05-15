package praktikum;

import org.apache.commons.lang3.RandomStringUtils;

public class CustomerDataGenerator {

    public Customer getRandom() {
        String email = RandomStringUtils.randomAlphabetic(10, 15) + "@yandex.ru";
        String password = RandomStringUtils.randomAlphabetic(6);
        String name = RandomStringUtils.randomAlphabetic(3, 12);

        return new Customer(email, password, name);
    }

}
