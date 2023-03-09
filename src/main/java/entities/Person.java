package entities;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Address_street")
    private Address addressStreet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Hobby_nameHobby")
    private Hobby hobbyNamehobby;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Phone_PhoneNumber")
    private Phone phonePhonenumber;

    public Phone getPhonePhonenumber() {
        return phonePhonenumber;
    }

    public void setPhonePhonenumber(Phone phonePhonenumber) {
        this.phonePhonenumber = phonePhonenumber;
    }

    public Hobby getHobbyNamehobby() {
        return hobbyNamehobby;
    }

    public void setHobbyNamehobby(Hobby hobbyNamehobby) {
        this.hobbyNamehobby = hobbyNamehobby;
    }

    public Address getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(Address addressStreet) {
        this.addressStreet = addressStreet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}