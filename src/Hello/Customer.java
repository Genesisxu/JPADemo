package Hello;

import javax.persistence.*;

@NamedQuery(name="testNamedQuery", query="FROM Customer c WHERE c.id = ?")
@Cacheable(true)
@Table(name="JPA_CUTOMERS")
@Entity
public class Customer {

	private Integer id;
	private String lastName;

	private String email;
	private int age;
	

	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String lastName, int age) {
		super();
		this.lastName = lastName;
		this.age = age;
	}

	@GeneratedValue(strategy= GenerationType.AUTO)
	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="LAST_NAME",length=50,nullable=false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Hello.Customer [id=" + id + ", lastName=" + lastName + ", email="
				+ email + ", age=" + age +  "]";
	}

}
