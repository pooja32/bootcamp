import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountryCurrency {
    public static void main(String[] args) throws IOException, CountryNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String country = br.readLine();
        Currency currency = null;
        if (country.equals("India"))
            currency = new Rupee();
        else if (country.equals("USA"))
            currency = new Dollar();
        else if (country.equals("UK"))
            currency = new Pound();
        if (currency == null)
            throw new CountryNotFoundException();
        else
            System.out.print(currency.getCurrency());

    }
}