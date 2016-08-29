package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipCodeController {

	private static final String template = "max of all the zip codes, %i!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping("/zipcode")
	public ZipCode zipcode(@RequestParam(value = "zip", defaultValue = "75024") String zip) {
		int zipcode = Integer.parseInt(zip);
		processZipCode(zipcode);
		// return new ZipCode(zipcode);
		return null;
	}

    @ExceptionHandler(ZipCodeException.class)
	@RequestMapping(value = "/GetJson", method = RequestMethod.GET)
	public String getJson(@RequestParam("zip1") int zip1, @RequestParam("zip2") int zip2,
			@RequestParam("zip3") String zip3) {
		return zip1 + " " + zip2 + " " + zip3;
	}

	@RequestMapping(value = "/Get", method = RequestMethod.GET)
	public ZipCode getJson(@RequestParam("zipCodeList") int[] zipCodeList) throws ZipCodeException {
		validate(zipCodeList);
		return new ZipCode(zipCodeList);

	}

	private void validate(int[] zipCodeList) throws ZipCodeException {
		if(zipCodeList.length<0)
		{
			throw new ZipCodeException("please enter atleast one valid zip code, a zipcode size is 5 digits");
		}
		else
		{
			for(int zipcode:zipCodeList)
			{
				if(!(Integer.toString(zipcode).length() == 5)){
					throw new ZipCodeException("please enter atleast one valid zip code, a zipcode size is 5 digits");
				}
			}
		}
		
	}

	private void processZipCode(int zipcode) {

		// Arrays zipcodeArray = new // TODO Auto-generated method stub

	}
}
