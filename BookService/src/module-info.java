package br.com.andersonchoren.service;

import org.springframework.stereotype.Service;

import br.com.andersonchoren.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public Book insert(Book book) {
        return bookRepository.save(book);
	}
}