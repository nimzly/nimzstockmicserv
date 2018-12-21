package com.nimz.spring.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimz.spring.model.Quote;
import com.nimz.spring.model.QuotesVO;
import com.nimz.spring.repository.QuotesRepository;

@RestController
@RequestMapping("/rest/db")
public class DBServiceController {

	@Autowired
	private QuotesRepository quotesRepository;

	@GetMapping("{username}")
	public List<String> getQuotes(@PathVariable final String username) {
		return getQuotesByUserName(username);
	}

	private List<String> getQuotesByUserName(String username) {
		return quotesRepository.findByUserName(username).stream().map(Quote::getQuote).collect(Collectors.toList());

	}

	@PostMapping("/add")
	public List<String> add(@RequestBody final QuotesVO quotes) {
		quotes.getQuotes().stream().map(quote -> new Quote(quotes.getUserName(), quote))
				.forEach(quote -> quotesRepository.save(quote));

		return getQuotesByUserName(quotes.getUserName());
	}

	@PostMapping("/delete/{username}")
    public List<String> delete(@PathVariable("username") final String userName) {
		List<Quote> quotes = quotesRepository.findByUserName(userName);

		quotesRepository.deleteAll(quotes);

		return getQuotesByUserName(userName);

	}

}
