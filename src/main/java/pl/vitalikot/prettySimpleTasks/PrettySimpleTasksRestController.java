package pl.vitalikot.prettySimpleTasks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.vitalikot.prettySimpleTasks.currencySearch.CurrencyReq;
import pl.vitalikot.prettySimpleTasks.sortingNumbers.CustomerReq;
import pl.vitalikot.prettySimpleTasks.sortingNumbers.Order;

import java.net.URL;
import java.util.*;

@RestController
class PrettySimpleTasksRestController {

    @GetMapping("/status/ping")
    public String statusGet(){
        return "pong";
    }

    @PostMapping("/numbers/sort-command")
    public String numbersPost(@RequestBody CustomerReq customerReq) {

        if (customerReq.getNumbers() == null) {
            return "numbers: null";
        }

        Order newOrder = customerReq.getOrder();
        switch (newOrder) {
            case ASC:
                Collections.sort(customerReq.getNumbers());
                break;
            case DESC:
                Collections.sort(customerReq.getNumbers(), Collections.reverseOrder());
                break;
        }

        return "numbers: " + customerReq.getNumbers();
    }

    @PostMapping("/currencies/get-current-currency-value-command")
    public String currencyPost(@RequestBody CurrencyReq currencyReq) throws Exception {

        URL urlNBP = new URL("http://api.nbp.pl/api/exchangerates/rates/a/" + currencyReq.getCode() + "/");
        Scanner scanner = new Scanner(urlNBP.openStream());
        StringBuilder theCurrencyData = new StringBuilder();
        while (scanner.hasNext()) {
            theCurrencyData.append(scanner.next());
        }
        scanner.close();

        return "value: " + theCurrencyData.substring(theCurrencyData.length() - 9, theCurrencyData.length() - 3);
    }
}