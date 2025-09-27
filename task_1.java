import java.util.*;
class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6)");
        int choice = sc.nextInt();
        System.out.print("Enter the temperature value:");
        double temperature = sc.nextDouble();
        switch (choice) {
            case 1:
                System.out.printf("%.2f Celsius to %.2f Fahrenheit%n", temperature, celsiusToFahrenheit(temperature));
                break;
            case 2:
                System.out.printf("%.2f Fahrenheit to %.2f Celsius%n", temperature, fahrenheitToCelsius(temperature));
                break;
            case 3:
                System.out.printf("%.2f Celsius to %.2f Kelvin%n", temperature, celsiusToKelvin(temperature));
                break;
            case 4:
                System.out.printf("%.2f Kelvin to %.2f Celsius%n", temperature, kelvinToCelsius(temperature));
                break;
            case 5:
                System.out.printf("%.2f Fahrenheit to %.2f Kelvin%n", temperature, fahrenheitToKelvin(temperature));
                break;
            case 6:
                System.out.printf("%.2f Kelvin to %.2f Fahrenheit%n", temperature, kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }
    public static double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }
}import java.util.*;
class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();
        System.out.print("Enter the temperature value: ");
        double temperature = sc.nextDouble();
        switch (choice) {
            case 1:
                System.out.printf("%.2f Celsius to %.2f Fahrenheit%n", temperature, celsiusToFahrenheit(temperature));
                break;
            case 2:
                System.out.printf("%.2f Fahrenheit to %.2f Celsius%n", temperature, fahrenheitToCelsius(temperature));
                break;
            case 3:
                System.out.printf("%.2f Celsius to %.2f Kelvin%n", temperature, celsiusToKelvin(temperature));
                break;
            case 4:
                System.out.printf("%.2f Kelvin to %.2f Celsius%n", temperature, kelvinToCelsius(temperature));
                break;
            case 5:
                System.out.printf("%.2f Fahrenheit to %.2f Kelvin%n", temperature, fahrenheitToKelvin(temperature));
                break;
            case 6:
                System.out.printf("%.2f Kelvin to %.2f Fahrenheit%n", temperature, kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }
    public static double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }
}
