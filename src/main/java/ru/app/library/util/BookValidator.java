package ru.app.library.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.app.library.DAO.BookDAO;
import ru.app.library.model.Book;

public class BookValidator implements Validator {

    public final BookDAO bookDAO;

    @Autowired
    public BookValidator(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Book.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Book book = new Book();

        if (bookDAO.show(book.getTitle()).isPresent()) {
            errors.rejectValue("name", "", "This name is already exist");
        }
    }
}
