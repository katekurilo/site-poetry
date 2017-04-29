package by.katekurilo.sitepoems.model;

import javax.persistence.*;

/**
 * @author Kate Kurilo
 */
@Entity
@Table(name = "poems")
public class Poem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "poem")
    private String poem;

    @Column(name = "author")
    private String author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoem() {
        return poem;
    }

    public void setPoem(String poem) {
        this.poem = poem;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
