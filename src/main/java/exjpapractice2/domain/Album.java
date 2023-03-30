package exjpapractice2.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Setter
@Getter
@DiscriminatorValue("ITEM")
public class Album extends Item {
    private String artist;
    private String etc;
}
