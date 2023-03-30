package exjpapractice2.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("BOOK")
@Entity
@Getter
@Setter
public class Book extends Item {

    private String Author;
    private String isbn;
}
