package teckwil.com.variablesprogramme;

public class ExecutionServices {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(150, 350);
        System.out.println("Variabile randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabile randomInt: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1099.0);
        System.out.println("Variabile randomInt: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1099.0);
        System.out.println("Variabile randomInt: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random Email: " + DataGeneratorUtil.getRandomEmail());

        Customer vasileConsumer = new Customer("Vasile Naie" , 26 , "vassile.naie@gmail.com");
        System.out.println("Nume obiect Vasea:" +vasileConsumer.getName());
        System.out.println("Age is: " + vasileConsumer.getAge());
        System.out.println("Email is:" + vasileConsumer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12), DataGeneratorUtil.getRandomInt(125), DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());
        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(7));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(14, 88));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());
    }
}
