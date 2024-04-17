package main.java.mx.utng.s23.testdb.model;

@Entity

public class Pokemon {

    @Id1
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

@Column(length = 50, nullable = false)
private String name;

private Type type;

}
