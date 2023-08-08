package pet.store.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@Entity

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;
	
    private String customerfirstName;
    private String customerlastName;
    private String customerEmail;
	
    @ManyToMany(mappedBy = "customers", cascade = CascadeType.PERSIST)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<PetStore> petStores;
}
