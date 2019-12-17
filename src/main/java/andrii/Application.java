package andrii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static andrii.Calculator.*;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        int i,fact=1;
        int number=4;//It is the number to calculate factorial
        fact = Recursive_factorial.factorial(number);
        String str = "Factorial of "+Integer.toString(number)+" is: "+Integer.toString(fact);
        return str;
    }
    @RequestMapping("/calc")
    public String homecalc() {
        int a= 15;
        int b = 4;//It is the number to calculate factorial
        int sumar = sum(a,b);
        int subs = substract(a,b);
        int divid = divide(a,b);
        int mult = multiplication(a,b);
        String str = "Sum of "+Integer.toString(a)+"+"+Integer.toString(b)+" is: "+Integer.toString(sumar);
        String str2 = "Substract of "+Integer.toString(a)+"-"+Integer.toString(b)+" is: "+Integer.toString(subs);
        String str3 = "Division of "+Integer.toString(a)+"/"+Integer.toString(b)+" is: "+Integer.toString(divid);
        String str4 = "Multiple of "+Integer.toString(a)+"*"+Integer.toString(b)+" is: "+Integer.toString(mult);
        return str+"\n"+str2+"\n"+str3+"\n"+str4;
    }
    @RequestMapping("/fib")
    public String homefib() {
        int a = 10;
        int fib = Fibonachi.fib(a);

        return "Sequence fibonachi of "+Integer.toString(a)+" is: "+Integer.toString(fib);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
