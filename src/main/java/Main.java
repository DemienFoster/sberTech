import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        City city = new City("Адыгейск", "Адыгея", "Южный", 12248, "1973");
        System.out.println(city);
        Scanner scanner = new Scanner(new File("Задача ВС Java Сбер.csv"));
        int i = 0;
        String s = scanner.nextLine();
        String[] arr = s.split(";");
        System.out.println(Arrays.toString(arr));
        String a = "jdjdjdj";
        String b = "15";

       /* while (scanner.hasNextLine()) {
            System.out.println(scanner.nextL());

        }*/
    }
    public static class City{
        private String name;
        private String region;
        private String district;
        private int population;
        private String foundation;

        public City(String name, String region, String district, int population, String foundation) {
            this.name = name;
            this.region = region;
            this.district = district;
            this.population = population;
            this.foundation = foundation;
        }
        @Override
        public String toString() {
            return "City{" +
                    "name='" + name + '\'' +
                    ", region='" + region + '\'' +
                    ", district='" + district + '\'' +
                    ", population=" + population +
                    ", foundation=" + foundation +
                    '}';
        }
    }


    /*City с полями:

    name – наименование города

    region – регион

    district – федеральный округ

    population – количество жителей города

    foundation – дата основания или первое упоминание*/}
